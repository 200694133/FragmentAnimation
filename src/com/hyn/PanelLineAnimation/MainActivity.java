package com.hyn.PanelLineAnimation;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {
    private static final String TAG = MainActivity.class.getSimpleName();
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    int index = 0;

    public void moveToLeft(View view){
        Log.d(TAG, "moveToLeft onClick");
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.animator.from_right, R.animator.to_left, R.animator.pop_enter, R.animator.pop_exit);

        Fragment1 newCustomFragment = new Fragment1();
        Bundle data = new Bundle();
        data.putString("data","Fragment Test "+index++);
        newCustomFragment.setArguments(data);

        transaction.replace(R.id.fragment_tag, newCustomFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void moveToRight(View view){
        Log.d(TAG, "moveToLeft onClick");
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.animator.from_left, R.animator.to_right, R.animator.pop_enter, R.animator.pop_exit);

        Fragment1 newCustomFragment = new Fragment1();Bundle data = new Bundle();
        data.putString("data","Fragment Test "+index++);
        newCustomFragment.setArguments(data);

        transaction.replace(R.id.fragment_tag, newCustomFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
