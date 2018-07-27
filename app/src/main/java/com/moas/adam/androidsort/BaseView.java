package com.moas.adam.androidsort;

public interface BaseView<T extends BasePresenter> {
    void setPresenter(T presenter);
}
