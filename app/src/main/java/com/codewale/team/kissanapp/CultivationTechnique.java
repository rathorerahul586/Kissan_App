package com.codewale.team.kissanapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.material.appbar.AppBarLayout;

public class CultivationTechnique extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cultivation_technique);

    }
    public void techniqueClicked(View view){
        int tech = view.getId();
        String title = "";
        String msg = "";
        switch (tech){
            case R.id.tech1 : title = getResources().getString(R.string.technique1);
                        msg = getResources().getString(R.string.tech1_detail);break;
            case R.id.tech2 : title = getResources().getString(R.string.technique2);
                msg = getResources().getString(R.string.tech2_detail);break;
            case R.id.tech3 : title = getResources().getString(R.string.technique3);
                msg = getResources().getString(R.string.tech3_detail);break;
            case R.id.tech4 : title = getResources().getString(R.string.technique4);
                msg = getResources().getString(R.string.tech4_detail);break;
            case R.id.tech5 : title = getResources().getString(R.string.technique5);
                msg = getResources().getString(R.string.tech5_detail);break;
            case R.id.tech6 : title = getResources().getString(R.string.technique6);
                msg = getResources().getString(R.string.tech6_detail);break;
        }
        DetailedCard(title, msg);
    }

    private void DetailedCard(String title, String msg){
        TextView cardTitle, cardMsg;
        View view = LayoutInflater.from(this).inflate(R.layout.technique_detail_card, null, false);
        cardTitle = view.findViewById(R.id.card_title);
        cardMsg = view.findViewById(R.id.card_msg);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(view);
        cardTitle.setText(title);
        cardMsg.setText(msg);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
