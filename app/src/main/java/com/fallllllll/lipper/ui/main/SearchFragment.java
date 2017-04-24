package com.fallllllll.lipper.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fallllllll.lipper.R;
import com.fallllllll.lipper.core.fragment.BaseFragment;
import com.fallllllll.lipper.utils.LogUtils;

/**
 * Created by Administrator on 2017/4/21/021.
 */

public class SearchFragment extends BaseFragment {

    @Override
    protected void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    protected void inject() {

    }

    @Override
    protected View initView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView textView = new TextView(getContext());
        textView.setText("搜索");
        textView.setTextSize(20);
        textView.setTextColor(ContextCompat.getColor(getContext(), R.color.primary_text));
        return textView;
    }

    @Override
    public void initListeners() {

    }
}
