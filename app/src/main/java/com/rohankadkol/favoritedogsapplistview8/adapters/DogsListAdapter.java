package com.rohankadkol.favoritedogsapplistview8.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.rohankadkol.favoritedogsapplistview8.R;
import com.rohankadkol.favoritedogsapplistview8.pojos.Dog;

public class DogsListAdapter extends ArrayAdapter<Dog> {
    private static final String TAG = DogsListAdapter.class.getSimpleName();

    private Context mContext;

    private Dog[] mDogs = {new Dog("Ace", "Affenpinscher", 2, "Walks", "Bathing"),
            new Dog("Batman", "Bat", 1, "Saving humans", "Light"),
            new Dog("Camaro", "Greyhound", 5, "Running", "Confinement of any sort"),
            new Dog("Dimitri", "Black Russian Terrier", .5, "Small strolls in the morning", "Vodka"),
            new Dog("Electro", "Saluki", 7, "Long runs", "Being called Electro"),
            new Dog("Feather", "Pomeranian", .25, "Charlie the owner", "Charlie the owner when he is mad"),
            new Dog("Gallop", "Border Collie", 2, "Jumping in the grass", "Being told to get off the grass"),
            new Dog("Halloumi", "Saluki", 1, "Being compared with cheese", "Being specifically compared with Halloumi cheese"),
            new Dog("Icarus", "Unicorn", 100, "Flying high in the sky with its wax wings", "Falling to the ground when the wax wings melt"),
            new Dog("Joker", "Rottweiler", 7, "Chasing after Batman", "Life without Batman"),
            new Dog("Kilo", "Great Dane", 4, "Watching TV and eating potato chips", "When the owner stock of potato chips gets over."),
            new Dog("Larry", "Border Collie", 2, "Wearing spectacles", "When people say he looks like an accountant with his spectacles"),
            new Dog("Monotone", "Basset Hound", 5, "Keeping silent and coercing noisy people to keep silent", "Being told to stiff out the owner's sock just becuase he is a hound dog"),
            new Dog("Nike", "Weimaraner ", 10, "Brisk morning runs", "Being told he can't run just because he's 10 years old."),
            new Dog("Ostrich", "German Shorthaired Pointer", 3, "Using its long neck to point at a point of interest", "People making fun of its long neck"),
            new Dog("Papa", "Pit Bull", 2, "Caring for his 3 litters of dogs, each with a different female dog", "Practising monogamy"),
            new Dog("Quebec", "Canadian Eskimo Dog", 5, "Playing in a mountain of maple leaves", "Being told that that she can't watch the Hockey game on the family TV."),
            new Dog("Rohan", "Doberman", 20, "Being compared to man unanimously loved by all women - Rohan Kadkol", "Being told that no matter how hard he tries, he can never be like Rohan Kadkol."),
            new Dog("Sabine", "Hot dog", 3, "Being compared to Mr. Bean's girlfriend- Sabine", "Not finding the Mr. Bean of her life. Lonely indeed."),
            new Dog("Tara", "Siberian Husky", 1, "рыыв фьб ыффг фсдфсдфсд дфмлксд", "и шент то тче сторе тодаы. Карен диднжт шеар чер маск"),
            new Dog("Ursula", "Pug", 8, "Her twin sister — Phoebe Buffay", "Phoebe Buffay's fame"),
            new Dog("Victoria", "Chinese Crested Dog", 4, "The fact that she doesn't shed hair", "When she realizes that the reason she doesn't shed hair is because she's bald"),
            new Dog("Wolfgang", "German Shepherd", 10, "The music of the rock band — Wolfgang", "The fact that Wolfgang did not pay him any money for naming their band name after him."),
            new Dog("X-ray", "Superdog", 199023, "Seeing through people's clothes using his X-Ray vision", "When people tell him he is not as good as his master — Superman"),
            new Dog("Yasmine", "Yorkshire Yerrier", 2, "Yong Yalks Yn Yhe Yark", "Yverything Yhat Ytarts Yith Yhe Yetter \"Y\""),
            new Dog("Zaxby's", "Beagle", 9, "Chicken", "Whatever the hell KFC calls chicken"),
    };

    public DogsListAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Log.d(TAG, "getView: " + position);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.dog_item, parent, false);

        TextView tvName = view.findViewById(R.id.tv_name);
        TextView tvBreed = view.findViewById(R.id.tv_breed);

        tvName.setText(mDogs[position].getName());
        tvBreed.setText(mDogs[position].getBreed());

        return view;
    }

    @Override
    public int getCount() {
        return mDogs.length;
    }
}
