package com.example.codecourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailCode extends AppCompatActivity {

    public static final String EXTRA_TEXT = "text";
    public static final String EXTRA_PHOTO = "photo";
    public static final String EXTRA_RELEASE = "release";
    public static final String EXTRA_EXTENSION = "extension";
    public static final String EXTRA_SOURCE = "source";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_code);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail");
        }

        String title = getIntent().getStringExtra("key").toString();

        getSupportActionBar().setTitle(title);

        TextView tvDetailText = findViewById(R.id.detail_text);
        ImageView ivDetailPhoto = findViewById(R.id.detail_image);
        TextView tvDetailRelease = findViewById(R.id.detail_release);
        TextView tvDetailExtension = findViewById(R.id.detail_extension);
        TextView tvDetailSource = findViewById(R.id.detail_source);

        String text = getIntent().getStringExtra(EXTRA_TEXT);
        int photo = getIntent().getIntExtra(EXTRA_PHOTO, 0);
        String release = getIntent().getStringExtra(EXTRA_RELEASE);
        String extension = getIntent().getStringExtra(EXTRA_EXTENSION);
        String source = getIntent().getStringExtra(EXTRA_SOURCE);

        tvDetailText.setText(text);
        ivDetailPhoto.setImageResource(photo);
        tvDetailRelease.setText(release);
        tvDetailExtension.setText(extension);
        tvDetailSource.setText(source);

        Button btnDetail = findViewById(R.id.btn_detail);
        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCourse(getIntent().getStringExtra("key").toString());
            }
        });
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


    private void showCourse(String name) {
        Toast.makeText(this, "Start Learning : " + name, Toast.LENGTH_SHORT).show();
    }
}
