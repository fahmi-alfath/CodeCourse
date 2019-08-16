package com.example.codecourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailCode extends AppCompatActivity {

    public static final String EXTRA_NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_code);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail");
        }

        TextView tvDetailName = findViewById(R.id.detail_name);
        String name = getIntent().getStringExtra(EXTRA_NAME);

        tvDetailName.setText(name);
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
}
