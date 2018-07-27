package com.moas.adam.androidsort.bubblesort;

import com.moas.adam.androidsort.BasePresenter;
import com.moas.adam.androidsort.BaseView;

public interface BubbleSortContract {

    interface View extends BaseView<Presenter> {
    }

    interface Presenter extends BasePresenter {

    }

}
