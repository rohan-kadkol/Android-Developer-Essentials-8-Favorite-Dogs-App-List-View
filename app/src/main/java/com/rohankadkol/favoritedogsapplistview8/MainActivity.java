package com.rohankadkol.favoritedogsapplistview8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    // TODO (4): Create a global variable for the ListView
    private ListView mLvDogs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (5): use findViewById to initialize the above global variable
        mLvDogs = findViewById(R.id.lv_dogs);
    }
}
