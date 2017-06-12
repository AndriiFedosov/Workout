package com.example.andry.workout;

import android.app.Activity;
import android.os.Bundle;



/**
 * Created by Andry on 12.06.2017.
 */

public class DetailActivity extends Activity {

    public static final String EXTRA_WORKOUT_ID = "id";

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        WorkoutDetailFragment fragment = (WorkoutDetailFragment)getFragmentManager()
                .findFragmentById(R.id.detail_frag);
        int workoutId = (int)getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        fragment.setWorkoutID(workoutId);
    }
}
