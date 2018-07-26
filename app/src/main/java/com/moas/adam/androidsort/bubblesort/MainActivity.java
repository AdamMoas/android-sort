package com.moas.adam.androidsort.bubblesort;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.moas.adam.androidsort.R;
import com.moas.adam.lib.BubbleSort;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.navigation)
    BottomNavigationView navigation;
    @BindView(R.id.tvBeforeSort)
    TextView unsortedMessage;
    @BindView(R.id.tvAfterSort)
    TextView bubbleSortMessage;
    @BindView(R.id.tvUnsortedOutput)
    TextView unsortedTextView;
    @BindView(R.id.tvBubbleSortOutput)
    TextView sortedTextView;
    @BindViews({R.id.position0, R.id.position1, R.id.position2})
    List<TextView> positions;

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
        ButterKnife.bind(this);

        int[] exampleNumbers = {1, 4, 2, 7, 5, 3, 9, 8, 6, 0};
        int[] numbers = {1, 4, 2, 7, 5, 3, 9, 8, 6, 0};
        BubbleSort bubbleSort = new BubbleSort(numbers);

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        unsortedMessage.setText(R.string.before_sort);
        bubbleSortMessage.setText(R.string.after_sort);

        unsortedTextView.setText(Arrays.toString(exampleNumbers));
        sortedTextView.setText(Arrays.toString(bubbleSort.getSortedOutput()));

        swapElements(positions.get(0), positions.get(1));

    }

    private void swapElements(View leftView, View rightView) {
        Animation swapLeft = AnimationUtils.loadAnimation(this, R.anim.swap_left);
        leftView.startAnimation(swapLeft);

        Animation swapRight = AnimationUtils.loadAnimation(this, R.anim.swap_right);
        rightView.startAnimation(swapRight);
    }


}
