package com.example.codecourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCode;
    private ArrayList<Code> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCode = findViewById(R.id.rv_code);
        rvCode.setHasFixedSize(true);

        list.addAll(CodeData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCode.setLayoutManager(new LinearLayoutManager(this));
        ListCodeAdapter listHeroAdapter = new ListCodeAdapter(list);
        rvCode.setAdapter(listHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.about_me:
                Intent AboutMe = new Intent(MainActivity.this, AboutMe.class);
                startActivity(AboutMe);
                break;
        }
    }

}
