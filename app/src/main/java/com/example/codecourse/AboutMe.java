package com.example.codecourse;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class AboutMe extends AppCompatActivity implements View.OnClickListener {

    public static final String USER_NAME = "user_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("About Me");
        }

        Button btnEmail = findViewById(R.id.btn_email);
        btnEmail.setOnClickListener(this);

        Button btnPhone = findViewById(R.id.btn_phone);
        btnPhone.setOnClickListener(this);

    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id == android.R.id.home)
        {
            onBackPressed();
            return true;
        }
        else
        {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_email:
                String myEmail = "fahmi243alfath@gmail.com";
                Intent myEmailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto",myEmail, null));
                startActivity(myEmailIntent);
                break;
            case R.id.btn_phone:
                String myPhone = "+6285759905991";
                Intent myPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+myPhone));
                startActivity(myPhoneIntent);
                break;
        }
    }

}
