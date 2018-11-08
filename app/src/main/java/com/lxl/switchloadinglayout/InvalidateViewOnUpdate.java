package com.lxl.switchloadinglayout;

import android.animation.ValueAnimator;
import android.view.View;

import java.lang.ref.WeakReference;

/**
 * Date: 2018年11月7日
 * github: https://github.com/chinalixiaolu/switchloadinglayout
 *
 * @Author: marcus.lee
 * Email: chinalixiaolu@163.com
 * Description:
 */
public class InvalidateViewOnUpdate implements ValueAnimator.AnimatorUpdateListener {
    private final WeakReference<View> viewRef;

    public InvalidateViewOnUpdate(View view) {
        this.viewRef = new WeakReference<>(view);
    }

    @Override
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        final View view = viewRef.get();
        if (view == null) {
            return;
        }
        view.invalidate();
    }
}
