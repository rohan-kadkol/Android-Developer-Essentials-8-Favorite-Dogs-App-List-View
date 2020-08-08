package com.rohankadkol.favoritedogsapplistview8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.rohankadkol.favoritedogsapplistview8.adapters.DogsListAdapter;

public class MainActivity extends AppCompatActivity {
    private ListView mLvDogs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLvDogs = findViewById(R.id.lv_dogs);

        DogsListAdapter adapter = new DogsListAdapter(this, 0);
        mLvDogs.setAdapter(adapter);
    }
}
