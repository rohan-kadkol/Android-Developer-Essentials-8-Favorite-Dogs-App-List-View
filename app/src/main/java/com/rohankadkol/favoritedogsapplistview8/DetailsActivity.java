package com.rohankadkol.favoritedogsapplistview8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {
    // TODO (1): Add 5 variables for tv_name, tv_breed, tv_likes, tv_dislikes and iv_dog
    ImageView mIvDog;
    TextView mTvName;
    TextView mTvBreed;
    TextView mTvLikes;
    TextView mTvDislikes;

    Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // TODO (2): Initialize the variables using findViewById
        mIvDog = findViewById(R.id.iv_dog);
        mTvName = findViewById(R.id.tv_name);
        mTvBreed = findViewById(R.id.tv_breed);
        mTvLikes = findViewById(R.id.tv_likes);
        mTvDislikes = findViewById(R.id.tv_dislikes);

        // TODO (3): If getIntent() != null, call populateUi()
        mIntent = getIntent();
        if (mIntent != null) {
            setupActionBar();
            populateUi();
        }
    }

    private void setupActionBar() {

    }

    private void populateUi() {
        // TODO (4): Populate the 5 variables with the extras from the passed intent
        String name = getIntent().getStringExtra("dog_name");
        String breed = getIntent().getStringExtra("dog_breed");
        String likes = getIntent().getStringExtra("dog_likes");
        String dislikes = getIntent().getStringExtra("dog_dislikes");
        String imageUrl = getIntent().getStringExtra("dog_image_url");

        mTvName.setText(name);
        mTvBreed.setText(breed);
        mTvLikes.setText(likes);
        mTvDislikes.setText(dislikes);
        Picasso.get().load(imageUrl).into(mIvDog);
    }
}
