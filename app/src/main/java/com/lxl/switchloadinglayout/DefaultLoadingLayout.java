package com.lxl.switchloadinglayout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Date: 2018年11月7日
 * github: https://github.com/chinalixiaolu/switchloadinglayout
 *
 * @Author: marcus.lee
 * Email: chinalixiaolu@163.com
 * Description:
 */
public class DefaultLoadingLayout extends SwitchLoadingLayout {
    private LayoutInflater mInflater;
    private Context mContext;
    private RelativeLayout rlAddedView;
    private boolean mAnyAdded;
    private RelativeLayout.LayoutParams mLayoutParams;

    private TextView tvLoadingDescription;
    private TextView tvEmptyDescription;
    private TextView tvErrorDescription;
    private Button btnErrorHandle;
    private DotsTextView dtvLoading;
    private LinearLayout mLoadingContent;
    private ImageView emptyIconImage;
    private ImageView errorIconImageView;
    private LinearLayout errorLinearLayout;

    DefaultLoadingLayout(Context context, View contentView) {
        this.mContext = context;
        this.mContentView = contentView;
        this.mInflater = LayoutInflater.from(context);
        {
            mLoadingView = mInflater.inflate(R.layout.switchloadinglayout_view_on_loading, null);
            mEmptyView = mInflater.inflate(R.layout.switchloadinglayout_view_on_empty, null);
            mErrorView = mInflater.inflate(R.layout.switchloadinglayout_view_on_error, null);
            dtvLoading = (DotsTextView) mLoadingView.findViewById(R.id.dots);
            mLayoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
            mLayoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        }
    }

    /**
     * ------------------------------------------------loading 状态设置-----------------------------------------------------------------------------------------
     */
    public void setLoadingDescriptionColor(int color) {
        if (tvLoadingDescription == null) {
            tvLoadingDescription = (TextView) mLoadingView.findViewById(R.id.tv_loading_message);
        }
        tvLoadingDescription.setTextColor(color);
        dtvLoading.setTextColor(color);
    }

    public void setLoadingDescriptionTextSize(float size) {
        if (tvLoadingDescription == null) {
            tvLoadingDescription = (TextView) mLoadingView.findViewById(R.id.tv_loading_message);
        }
        tvLoadingDescription.setTextSize(size);
    }

    public void setLoadingDescription(String loadingDescription) {
        if (tvLoadingDescription == null) {
            tvLoadingDescription = (TextView) mLoadingView.findViewById(R.id.tv_loading_message);
        }
        tvLoadingDescription.setText(loadingDescription);
    }

    public void setLoadingDescription(int resID) {
        if (tvLoadingDescription == null) {
            tvLoadingDescription = (TextView) mLoadingView.findViewById(R.id.tv_loading_message);
        }
        tvLoadingDescription.setText(resID);
    }

    public void replaceLoadingProgress(View view) {
        if (mLoadingContent == null) {
            mLoadingContent = (LinearLayout) mLoadingView.findViewById(R.id.ll_loading);
        }
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        lp.addRule(RelativeLayout.CENTER_IN_PARENT);
        ((RelativeLayout) mLoadingView).addView(view, lp);
        ((RelativeLayout) mLoadingView).removeView(mLoadingContent);
    }
    /**
     * ------------------------------------------------loading 状态设置结束-----------------------------------------------------------------------------------------
     */

    /**
     * ------------------------------------------------empty 状态设置-----------------------------------------------------------------------------------------
     */
    public void setEmptyDescriptionColor(int color) {
        if (tvEmptyDescription == null) {
            tvEmptyDescription = (TextView) mEmptyView.findViewById(R.id.emptyMessageTextView);
        }
        tvEmptyDescription.setTextColor(color);
    }

    public void setEmptyDescriptionTextSize(float size) {
        if (tvEmptyDescription == null) {
            tvEmptyDescription = (TextView) mEmptyView.findViewById(R.id.emptyMessageTextView);
        }
        tvEmptyDescription.setTextSize(size);
    }

    public void setEmptyDescription(String emptyDescription) {
        if (tvEmptyDescription == null) {
            tvEmptyDescription = (TextView) mEmptyView.findViewById(R.id.emptyMessageTextView);
        }
        tvEmptyDescription.setText(emptyDescription);
    }

    public void setEmptyDescription(int resID) {
        if (tvEmptyDescription == null) {
            tvEmptyDescription = (TextView) mEmptyView.findViewById(R.id.emptyMessageTextView);
        }
        tvEmptyDescription.setText(resID);
    }

    public void replaceEmptyIcon(Drawable newIcon) {
        if (emptyIconImage == null) {
            emptyIconImage = (ImageView) mEmptyView.findViewById(R.id.emptyIconImage);
        }
        emptyIconImage.setImageDrawable(newIcon);
    }

    public void replaceEmptyIcon(int resId) {
        if (emptyIconImage == null) {
            emptyIconImage = (ImageView) mEmptyView.findViewById(R.id.emptyIconImage);
        }
        emptyIconImage.setImageResource(resId);
    }

    public void setEmptyIconSize(int width, int height) {
        ViewGroup.MarginLayoutParams margin9 = new ViewGroup.MarginLayoutParams(
                emptyIconImage.getLayoutParams());
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(margin9);
        layoutParams9.height = height;
        layoutParams9.width = width;
        emptyIconImage.setLayoutParams(layoutParams9);
    }

    /**
     * ------------------------------------------------empty状态设置结束-----------------------------------------------------------------------------------------
     */


    /**
     * ------------------------------------------------error 状态设置-----------------------------------------------------------------------------------------
     */
    public void setErrorDescriptionColor(int color) {
        if (tvErrorDescription == null) {
            tvErrorDescription = (TextView) mErrorView.findViewById(R.id.errorMessageTextView);
        }
        tvErrorDescription.setTextColor(color);
    }

    public void setErrorDescriptionTextSize(float size) {
        if (tvErrorDescription == null) {
            tvErrorDescription = (TextView) mErrorView.findViewById(R.id.errorMessageTextView);
        }
        tvErrorDescription.setTextSize(size);
    }

    public void setErrorDescription(String errorDescription) {
        if (tvErrorDescription == null) {
            tvErrorDescription = (TextView) mErrorView.findViewById(R.id.errorMessageTextView);
        }
        tvErrorDescription.setText(errorDescription);
    }

    public void setErrorDescription(int resID) {
        if (tvErrorDescription == null) {
            tvErrorDescription = (TextView) mErrorView.findViewById(R.id.errorMessageTextView);
        }
        tvErrorDescription.setText(resID);
    }

    public void setErrorViewClickListener(View.OnClickListener listener) {
        if (errorLinearLayout == null) {
            errorLinearLayout = (LinearLayout) mErrorView.findViewById(R.id.errorLinearLayout);
        }
        errorLinearLayout.setOnClickListener(listener);
    }

    public void setErrorIconSize(int width, int height) {
        ViewGroup.MarginLayoutParams margin9 = new ViewGroup.MarginLayoutParams(
                errorIconImageView.getLayoutParams());
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(margin9);
        layoutParams9.height = height;
        layoutParams9.width = width;
        errorIconImageView.setLayoutParams(layoutParams9);
    }

    public void replaceErrorIcon(Drawable newIcon) {
        if (errorIconImageView == null) {
            errorIconImageView = (ImageView) mErrorView.findViewById(R.id.emptyIconImage);
        }
        errorIconImageView.setImageDrawable(newIcon);
    }

    public void replaceErrorIcon(int resId) {
        if (errorIconImageView == null) {
            errorIconImageView = (ImageView) mErrorView.findViewById(R.id.emptyIconImage);
        }
        errorIconImageView.setImageResource(resId);
    }

    /**
     * ------------------------------------------------error 状态设置结束-----------------------------------------------------------------------------------------
     */

    public void setLayoutBackgroundColor(int color) {
        initAddedLayout();
        rlAddedView.setBackgroundColor(color);
    }

    public void setLayoutBackground(int resID) {
        initAddedLayout();
        rlAddedView.setBackgroundResource(resID);
    }

    @Override
    public void onLoading() {
        checkContentView();
        if (!mLoadingAdded) {
            initAddedLayout();

            if (mLoadingView != null) {
                rlAddedView.addView(mLoadingView, mLayoutParams);
                mLoadingAdded = true;
            }
        }
        dtvLoading.showAndPlay();
        showViewWithStatus(LayoutStatus.Loading);
    }

    @Override
    public void onDone() {
        checkContentView();
        dtvLoading.hideAndStop();
        showViewWithStatus(LayoutStatus.Done);
    }

    @Override
    public void onEmpty() {
        checkContentView();
        if (!mEmptyAdded) {
            initAddedLayout();

            if (mEmptyView != null) {
                rlAddedView.addView(mEmptyView, mLayoutParams);
                mEmptyAdded = true;
            }
        }
        dtvLoading.hideAndStop();
        showViewWithStatus(LayoutStatus.Empty);
    }

    @Override
    public void onError() {
        checkContentView();
        if (!mErrorAdded) {
            initAddedLayout();

            if (mErrorView != null) {
                rlAddedView.addView(mErrorView, mLayoutParams);
                mErrorAdded = true;
            }
        }
        dtvLoading.hideAndStop();
        showViewWithStatus(LayoutStatus.Error);
    }


    private void checkContentView() {
        if (mContentView == null) {
            throw new NullPointerException("The content view not set..");
        }
    }

    private void initAddedLayout() {
        if (!mAnyAdded) {
            rlAddedView = new RelativeLayout(mContext);
            rlAddedView.setLayoutParams(mLayoutParams);
            ViewGroup parent = (ViewGroup) mContentView.getParent();
            parent.addView(rlAddedView);
            mAnyAdded = true;
        }
    }
}
