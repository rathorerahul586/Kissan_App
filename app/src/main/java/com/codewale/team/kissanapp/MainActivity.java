package com.codewale.team.kissanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cropInsurance (View view){
        CustomTabsIntent builder = new CustomTabsIntent.Builder().build();
        builder.launchUrl(this, Uri.parse("https://pmfby.gov.in/"));
    }

    public void helplineCenter(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:18001801551"));
        startActivity(intent);
    }

    public void cropProtection (View view){
        CustomTabsIntent builder = new CustomTabsIntent.Builder().build();
        builder.launchUrl(this, Uri.parse("http://www.agritech.tnau.ac.in/crop_protection/crop_prot.html"));
    }

    public void commoditiesRate (View view){
        CustomTabsIntent builder = new CustomTabsIntent.Builder().build();
        builder.launchUrl(this, Uri.parse("https://enam.gov.in/web/dashboard/trade-data"));
    }
}
