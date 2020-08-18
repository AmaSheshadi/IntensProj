package com.example.intentsproj;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class customtoast {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView();
        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                layout.findViewById());
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        toast.show();
    }

    private void getApplicationContext() {
    }

    private LayoutInflater getLayoutInflater() {
        return null;
    }

    private void setContentView() {
    }
}

