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

    // TODO (1): Create a new package called pojos.
    // TODO (2): Create a new class within pojos called Dog.
    // TODO (3): Dog must have the following fields: name, breed, likes, dislikes, imageUrl.
    // TODO (4): Add the getters, setters, and also a constructor.
}
