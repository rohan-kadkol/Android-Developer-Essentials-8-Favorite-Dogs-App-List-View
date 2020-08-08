package com.rohankadkol.favoritedogsapplistview8;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {
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

        mIvDog = findViewById(R.id.iv_dog);
        mTvName = findViewById(R.id.tv_name);
        mTvBreed = findViewById(R.id.tv_breed);
        mTvLikes = findViewById(R.id.tv_likes);
        mTvDislikes = findViewById(R.id.tv_dislikes);

        mIntent = getIntent();
        if (mIntent != null) {
            setupActionBar();
            populateUi();
        }
    }

    private void setupActionBar() {
        setTitle(getIntent().getStringExtra("dog_name"));
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    private void populateUi() {
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
