package com.rohankadkol.favoritedogsapplistview8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView mLvDogs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLvDogs = findViewById(R.id.lv_dogs);
    }

    // TODO (1): Add a package called adapters
    // TODO (2): Create a class called DogsAdapter
    // TODO (3): Create two global variables. Context mContext and Dog[] mDogs
    // TODO (4): Create a constructor to save the passed context to a global Context variable called mContext
    // TODO (5): Override getView()
    // TODO (6): Configure getView() to return the view populated with the correct dog information
    // TODO (7): Override getCount()
    // TODO (8): Configure getCount() to return mDogs.length
}
