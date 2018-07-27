package com.moas.adam.androidsort.bubblesort;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.moas.adam.androidsort.R;
import com.moas.adam.androidsort.utils.ActivityUtils;

public class MainActivity extends AppCompatActivity {

    private static final String ARGUMENT_BUBBLE_SORT_ID = "BUBBLE_SORT_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String bubbleSortId = getIntent().getStringExtra(ARGUMENT_BUBBLE_SORT_ID);

        BubbleSortFragment bubbleSortFragment = (BubbleSortFragment) getSupportFragmentManager()
                .findFragmentById(R.id.contentFrame);

        if (bubbleSortFragment == null) {
            bubbleSortFragment = BubbleSortFragment.newInstance(bubbleSortId);

            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    bubbleSortFragment, R.id.contentFrame);
        }

        new BubbleSortPresenter(
                bubbleSortFragment);

    }


}
