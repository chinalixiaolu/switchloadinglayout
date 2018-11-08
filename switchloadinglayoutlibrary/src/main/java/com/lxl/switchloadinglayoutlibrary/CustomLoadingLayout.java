package com.lxl.switchloadinglayoutlibrary;

import android.app.Activity;
import android.view.View;


/**
 * Date: 2018年11月7日
 * github: https://github.com/chinalixiaolu/switchloadinglayout
 *
 * @Author: marcus.lee
 * Email: chinalixiaolu@163.com
 * Description:
 */
public class CustomLoadingLayout extends SwitchLoadingLayout {
    private Activity mHostActivity;

    CustomLoadingLayout(Activity activity) {
        mHostActivity = activity;
    }

    public void setLoadingView(int viewID) {
        mLoadingView = mHostActivity.findViewById(viewID);
        mLoadingView.setVisibility(View.GONE);
    }

    public void setContentView(int viewID) {
        mContentView = mHostActivity.findViewById(viewID);
        mContentView.setVisibility(View.VISIBLE);
    }

    public void setEmptyView(int viewID) {
        mEmptyView = mHostActivity.findViewById(viewID);
        mEmptyView.setVisibility(View.GONE);
    }

    public void setErrorView(int viewID) {
        mErrorView = mHostActivity.findViewById(viewID);
        mErrorView.setVisibility(View.GONE);
    }

    @Override
    public void onLoading() {
        showViewWithStatus(LayoutStatus.Loading);
    }

    @Override
    public void onDone() {
        showViewWithStatus(LayoutStatus.Done);
    }

    @Override
    public void onEmpty() {
        showViewWithStatus(LayoutStatus.Empty);
    }

    @Override
    public void onError() {
        showViewWithStatus(LayoutStatus.Error);
    }

}
