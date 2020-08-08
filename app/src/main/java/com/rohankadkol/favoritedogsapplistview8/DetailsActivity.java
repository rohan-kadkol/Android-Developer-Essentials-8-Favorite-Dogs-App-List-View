package com.rohankadkol.favoritedogsapplistview8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {
    // TODO (1): Add 5 variables for tv_name, tv_breed, tv_likes, tv_dislikes and iv_dog

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // TODO (2): Initialize the variables using findViewById

        // TODO (3): If getIntent() != null, call populateUi()
    }

    private void setupActionBar() {
        
    }

    private void populateUi() {
        // TODO (4): Populate the 5 variables with the extras from the passed intent
    }
}
