package com.example.mlretrocomputacion.ui.favorite;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mlretrocomputacion.MyApp;
import com.example.mlretrocomputacion.data.remote.clases.Item;
import com.example.mlretrocomputacion.data.mvp.details.DetailsInterface;
import com.example.mlretrocomputacion.data.mvp.details.DetailsPresenter;
import com.example.mlretrocomputacion.databinding.FragmentFavoriteBinding;
import com.example.mlretrocomputacion.ui.home.HomeAdapter;

import java.util.ArrayList;
import java.util.List;

public class FavoriteFragment extends Fragment implements DetailsInterface.view {

    private static final String TAG = "FavoriteFragment";
    private List<Item> items;
    private DetailsInterface.presenter presenter;

    //widgets
    FragmentFavoriteBinding binding;
    private HomeAdapter adapter;
    private FavoriteViewModel favoriteViewModel;

    public FavoriteFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        favoriteViewModel =
                new ViewModelProvider(this).get(FavoriteViewModel.class);
        binding = FragmentFavoriteBinding.inflate(inflater, container, false);

        View view = binding.getRoot();

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        items = new ArrayList<>();
        presenter = new DetailsPresenter(this);
        binding.recyclerViewFavorite.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new HomeAdapter(items, getContext());
        binding.recyclerViewFavorite.setAdapter(adapter);

        adapter.setOnClickListener(view1 -> goToDetailsFav(view1));
        getListFavItems();
        setItemTouchHelp();
    }

    //get list of favorite items
    private void getListFavItems() {
        favoriteViewModel.getListRetroCategory().observe(getViewLifecycleOwner(), mItems -> {
            items = mItems;
            adapter.setData(items);
            getCheckItemFav(items);
        });
    }

    //
    //check if the item still exists since the last visit
    private void getCheckItemFav(List<Item> itemsToCheck) {
        for (int i = 0; i < itemsToCheck.size(); i++){
            presenter.getItemifActive(itemsToCheck.get(i).getIdItem(), itemsToCheck.get(i).getItemTitle());
        }
    }

    private void setItemTouchHelp() {
        //init callback to delete item from recycler view
        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback
                (0,ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {

            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                //delete favItem from roomdb
                favoriteViewModel.deleteFavItem(adapter.getItem(viewHolder.getAdapterPosition()));
                Toast.makeText(MyApp.getContext(), "Articulo eliminada de favoritos", Toast.LENGTH_SHORT).show();
            }
        }).attachToRecyclerView(binding.recyclerViewFavorite);
    }

    private void goToDetailsFav(View view1) {
        Item item = items.get(binding.recyclerViewFavorite.getChildAdapterPosition(view1));
        Integer idUser = item.getIdUser();
        String idItem = item.getIdItem();

        Log.i(TAG, "goToDetailsFav: " + idItem + " " + idUser);

        NavController navController = Navigation.findNavController(view1);
        NavDirections action = FavoriteFragmentDirections.actionFavoriteFragmentToDetailsFragment2(idUser,idItem);
        navController.navigate(action);
    }

    @Override
    public void showItemResult(String title, String condition, Double price, String city, String state, String permalink, List<String> pictures) {

    }

    @Override
    public void showUserResult(String usuario, String registerSince, Integer transactions, String number_reputation, String color_reputation) {

    }

    @Override
    public void showIfItemIsActive(Boolean isChecked,String itemTitle) {
        //if response !active, delete item from favorite
        if (!isChecked) favoriteViewModel.deleteFavItem(itemTitle);
    }
}