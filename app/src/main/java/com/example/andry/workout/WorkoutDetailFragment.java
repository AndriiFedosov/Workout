package com.example.andry.workout;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class WorkoutDetailFragment extends Fragment {

    private long workoutID;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState!=null){
            workoutID = savedInstanceState.getLong("workoutId");
        }
        else {
            FragmentTransaction ft = getChildFragmentManager().beginTransaction();
            StopwatchFragment stopwatchFragment = new StopwatchFragment();
            ft.replace(R.id.stopwatch_container,stopwatchFragment);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }

        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view!=null){
            TextView titel = (TextView) view.findViewById(R.id.textTitle);
            Workout workouts = Workout.workout[(int) workoutID];
            titel.setText(workouts.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(workouts.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putLong("workoutId",workoutID);
    }

    public void setWorkoutID(long workoutID) {
        this.workoutID = workoutID;
    }
}
