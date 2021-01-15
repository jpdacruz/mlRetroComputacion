package com.example.mlretrocomputacion.utils;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mlretrocomputacion.R;

public class NetworkChangeListener extends BroadcastReceiver {
    private Button btnRetry;
    @Override
    public void onReceive(Context context, Intent intent) {

        //internet not connected
        if(!Utils.isNetworkConnected(context)){
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            View layout_dialog = LayoutInflater.from(context).inflate(R.layout.check_internet_dialog, null);
            builder.setView(layout_dialog);

            btnRetry = layout_dialog.findViewById(R.id.buttonRetry);

            //show dialog
            AlertDialog dialog = builder.create();
            dialog.show();
            dialog.setCancelable(false);
            dialog.getWindow().setGravity(Gravity.CENTER);

            btnRetry.setOnClickListener(v -> {
                dialog.dismiss();
                onReceive(context,intent);
            });
        }
    }
}
