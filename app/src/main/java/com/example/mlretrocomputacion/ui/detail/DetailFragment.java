package com.example.mlretrocomputacion.ui.detail;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mlretrocomputacion.R;
import com.example.mlretrocomputacion.data.Model.Item;
import com.example.mlretrocomputacion.data.mvp.DetailsInterface;
import com.example.mlretrocomputacion.data.mvp.DetailsPresenter;
import com.example.mlretrocomputacion.databinding.FragmentDetailsBinding;
import com.example.mlretrocomputacion.ui.favorite.FavoriteViewModel;
import com.example.mlretrocomputacion.ui.home.HomeFragmentDirections;
import com.example.mlretrocomputacion.utils.Utils;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import www.sanju.motiontoast.MotionToast;

import static com.example.mlretrocomputacion.R.color.notification_action_color_filter;
import static com.example.mlretrocomputacion.R.color.reputation_green;
import static com.example.mlretrocomputacion.R.color.reputation_light_green;
import static com.example.mlretrocomputacion.R.color.reputation_no;
import static com.example.mlretrocomputacion.R.color.reputation_orange;
import static com.example.mlretrocomputacion.R.color.reputation_red;
import static com.example.mlretrocomputacion.R.color.reputation_yellow;

public class DetailFragment extends Fragment implements DetailsInterface.view {

    //vars
    private static final String TAG = "DetailFragment";
    private Item item;
    private String idItem,urlItem;
    private Integer idUser;
    private DetailsInterface.presenter presenter;
    private List<String> pictures;
    private FavoriteViewModel favoriteViewModel;

    //widgets
    private FragmentDetailsBinding binding;
    private DetailAdapter adapter;

    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            idItem = DetailFragmentArgs.fromBundle(getArguments()).getIdItem();
            idUser = DetailFragmentArgs.fromBundle(getArguments()).getIdUser();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        favoriteViewModel =
                new ViewModelProvider(this).get(FavoriteViewModel.class);
        binding = FragmentDetailsBinding.inflate(inflater, container, false);
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
        //call the presenter
        presenter = new DetailsPresenter(this);
        pictures = new ArrayList<>();
        setAdapter();
        setListener();

        checkIfItemIsFavorite();

        presenter.getItemDetails(idItem);
        presenter.getUserDetails(idUser);
        presenter.getItemQuestions(idItem);
    }

    private void checkIfItemIsFavorite() {
        favoriteViewModel.getListRetroCategory().observe(getViewLifecycleOwner(), new Observer<List<Item>>() {
            @Override
            public void onChanged(List<Item> mItems) {
                String idItemToInsert = idItem;
                if (Utils.isItemExist(mItems, idItemToInsert)) {
                    binding.imageButtonNoFav.setVisibility(View.GONE);
                    binding.imageButtonFav.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void setAdapter() {
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.recyclerViewPictures.setLayoutManager(layoutManager);
        adapter = new DetailAdapter(pictures,getContext());
        binding.recyclerViewPictures.setAdapter(adapter);
    }

    private void setListener() {
        adapter.setOnClickListener(v -> goToDialogImage(v));
        binding.imageButtonNoFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertCityRoom();
            }
        });
        binding.buttonWebView.setOnClickListener(v -> goToMl(v));
    }

    private void insertCityRoom() {
        favoriteViewModel.insertFavItem(item);
    }

    private void goToMl(View v) {
        Log.i(TAG, "goToMl: " + urlItem);
        NavController navController = Navigation.findNavController(v);
        NavDirections action = DetailFragmentDirections.actionDetailsFragmentToWebViewFragment(urlItem);
        navController.navigate(action);
    }

    @Override
    public void showItemResult(String title, String condition, Double price, String city, String state, String permalink, List<String> mPictures) {
        item = new Item();
        item.setItemTitle(title);
        item.setItemPrice(price);
        item.setIdItem(idItem);
        item.setIdUser(idUser);
        item.setThumbnail(mPictures.get(0));

        binding.tvDetailsCondition.setText(String.format("Estado: %s", condition));
        binding.tvDetailsTitle.setText(title);
        binding.tvDetailsPrice.setText(String.format("$ %s", price));
        binding.tvDetailsCiudad.setText(String.format("Ciudad: %s", city));
        binding.tvDetailsState.setText(String.format("Provincia: %s", state));
        urlItem = permalink;
        pictures = mPictures;
        adapter.setData(pictures);
    }

    @Override
    public void showUserResult(String usuario, String registerSince, Integer transactions, String number_reputation, String color_reputation) {
        binding.tvDetailsUsuario.setText(String.format("Nick usuario: %s", usuario));
        binding.tvDetailsYearRegister.setText(String.format("Usuario desde el año: %s", registerSince));
        binding.tvDetailsSales.setText(MessageFormat.format("Ventas totales: {0}", transactions));

        if (number_reputation.equals("no")){
            binding.tvDetailsReputacion.setText("Sin reputacion");
        }else{
            binding.tvDetailsReputacion.setText(String.format("Reputacion: %s", number_reputation));
        }

        switch (color_reputation){
            case "grey":
                binding.tvDetailsReputacion.setTextColor(ContextCompat.getColor(getContext(),reputation_no));
                break;
            case "green":
                binding.tvDetailsReputacion.setTextColor(ContextCompat.getColor(getContext(),reputation_green));
                break;
            case "light":
                binding.tvDetailsReputacion.setTextColor(ContextCompat.getColor(getContext(), reputation_light_green));
                break;
            case "yellow":
                binding.tvDetailsReputacion.setTextColor(ContextCompat.getColor(getContext(), reputation_yellow));
                break;
            case "orange":
                binding.tvDetailsReputacion.setTextColor(ContextCompat.getColor(getContext(),reputation_orange));
                break;
            case "red":
                binding.tvDetailsReputacion.setTextColor(ContextCompat.getColor(getContext(),reputation_red));
                break;
        }
    }

    @Override
    public void showQuestionResult(int totalQuestions) {
        String totaQuestionString = String.valueOf(totalQuestions);
        if (totaQuestionString.equals("99999")){
            totaQuestionString =" sin datos";
        }
       binding.tvDetailsNumberQuestions.setText(String.format("Preguntas realizadas: %s", totaQuestionString));
    }

    @Override
    public void showIfItemIsActive(Boolean isChecked, String itemTitle) {

    }

    private void goToDialogImage(View view) {
        String picture = pictures.get(binding.recyclerViewPictures.getChildAdapterPosition(view));
        Log.i(TAG, "PICTURE: " + picture);
        if (picture != null){
            DialogDetailFragment dialogF = new DialogDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putString("picture", picture);
            dialogF.setArguments(bundle);
            dialogF.show(getChildFragmentManager(),TAG);
        }else {
            MotionToast.Companion.darkToast(getActivity(),"No hay foto para mostrar!",
                    MotionToast.TOAST_WARNING,
                    MotionToast.GRAVITY_BOTTOM,
                    MotionToast.LONG_DURATION,
                    ResourcesCompat.getFont(getActivity(),
                            R.font.helvetica_regular));
        }
    }
}