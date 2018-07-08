package com.moas.adam.androidsort;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.moas.adam.lib.BubbleSort;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView navigation;

    private TextView unsortedMessage;
    private TextView bubbleSortMessage;

    private TextView unsortedTextView;
    private TextView sortedTextView;

    private BubbleSort bubbleSort;

    private TextView position0, position1, position2;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] exampleNumbers = {1, 4, 2, 7, 5, 3, 9, 8, 6, 0};
        int[] numbers = {1, 4, 2, 7, 5, 3, 9, 8, 6, 0};
        bubbleSort = new BubbleSort(numbers);

        unsortedMessage = findViewById(R.id.tvBeforeSort);
        bubbleSortMessage = findViewById(R.id.tvAfterSort);
        unsortedTextView = findViewById(R.id.tvUnsortedOutput);
        sortedTextView = findViewById(R.id.tvBubbleSortOutput);

        position0 = findViewById(R.id.position0);
        position1 = findViewById(R.id.position1);
        position2 = findViewById(R.id.position2);

        navigation = findViewById(R.id.navigation);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        unsortedMessage.setText(R.string.before_sort);
        bubbleSortMessage.setText(R.string.after_sort);

        unsortedTextView.setText(Arrays.toString(exampleNumbers));
        sortedTextView.setText(Arrays.toString(bubbleSort.getSortedOutput()));

        Animation swapAnimation = AnimationUtils.loadAnimation(this, R.anim.swap);
        position0.startAnimation(swapAnimation);

    }

}
