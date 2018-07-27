package com.moas.adam.androidsort.bubblesort;

import android.view.View;

import com.moas.adam.androidsort.BasePresenter;
import com.moas.adam.androidsort.BaseView;

public interface BubbleSortContract {

    interface MainView extends BaseView<Presenter> {
        void swapElements(View leftView, View rightView);
    }

    interface Presenter extends BasePresenter {

    }

}
