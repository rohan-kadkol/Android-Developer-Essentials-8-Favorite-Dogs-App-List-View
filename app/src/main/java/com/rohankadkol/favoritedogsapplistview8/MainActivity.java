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

    // TODO (1): Add a new activity called DetailsActivity
    // TODO (2): In the activity_details.xml file, have a root LinearLayout with vertical orientation
    // TODO (3): Have an ImageView (iv_dog) with weight 4 and a ScrollView with weight 6
    // TODO (4): Within the ScrollView, add a vertical LinearLayout
    // TODO (5): Then add 6 TextViews in the following order: Name, Breed, Likes Label, Likes, Dislikes Label, Dislikes
    // TODO (6): Then add 6 TextViews in the following order: Name, Breed, Likes Label, Likes, Dislikes Label, Dislikes

}
