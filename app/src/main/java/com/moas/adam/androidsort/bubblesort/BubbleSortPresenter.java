package com.moas.adam.androidsort.bubblesort;

import android.support.annotation.NonNull;

import static com.google.common.base.Preconditions.checkNotNull;

public class BubbleSortPresenter implements BubbleSortContract.Presenter {

    private BubbleSortContract.MainView bubbleSortView;

    BubbleSortPresenter(@NonNull BubbleSortContract.MainView bubbleSortView) {
        this.bubbleSortView = checkNotNull(bubbleSortView);
        this.bubbleSortView.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
