package com.fallllllll.lipper.ui.main.home;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableInt;

import com.fallllllll.lipper.DribbbleApplication;
import com.fallllllll.lipper.utils.UIUtils;

/**
 * Created by Administrator on 2017/5/3/003.
 */

public class ShotsListItemViewModel {
    public static int GRID_LAYOUT = 0;
    public static int ONLY_IMAGE_LAYOUT = 1;
    public static int LINEAR_LAYOUT = 2;
    public ObservableInt currentLayout = new ObservableInt(LINEAR_LAYOUT);


    public ShotsListItemViewModel(int currentLayout) {
        this.currentLayout.set(currentLayout);
    }

    public void setLayout(int layout) {
        currentLayout.set(layout);

    }
}