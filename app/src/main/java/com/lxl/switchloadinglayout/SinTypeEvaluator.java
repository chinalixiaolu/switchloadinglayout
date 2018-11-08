package com.lxl.switchloadinglayout;

import android.animation.TypeEvaluator;

/**
 * Date: 2018年11月7日
 * github: https://github.com/chinalixiaolu/switchloadinglayout
 *
 * @Author: marcus.lee
 * Email: chinalixiaolu@163.com
 * Description:
 */
public class SinTypeEvaluator implements TypeEvaluator<Number> {
    @Override
    public Number evaluate(float fraction, Number from, Number to) {
        return Math.max(0, Math.sin(fraction * Math.PI * 2)) * (to.floatValue() - from.floatValue());
    }
}
