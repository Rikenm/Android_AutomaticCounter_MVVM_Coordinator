package com.rikenmaharjan.automaticcounter.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;

import com.rikenmaharjan.automaticcounter.Interface.ViewMVVM;
import com.rikenmaharjan.automaticcounter.R;

public class Main extends AppCompatActivity implements ViewMVVM {


    public ImageButton mBtnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        mBtnBack = findViewById(R.id.btn_bulb);

       setContentView(R.layout.activity_list);
    }


}
