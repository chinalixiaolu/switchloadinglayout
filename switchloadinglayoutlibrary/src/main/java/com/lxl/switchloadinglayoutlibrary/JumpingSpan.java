package com.lxl.switchloadinglayoutlibrary;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.style.ReplacementSpan;

/**
 * Date: 2018年11月7日
 * github: https://github.com/chinalixiaolu/switchloadinglayout
 *
 * @Author: marcus.lee
 * Email: chinalixiaolu@163.com
 * Description:
 */
public class JumpingSpan extends ReplacementSpan {

    private float translationX = 0;
    private float translationY = 0;

    @Override
    public int getSize(Paint paint, CharSequence text, int start, int end, FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(text, start, end);
    }

    @Override
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        canvas.drawText(text, start, end, x + translationX, y + translationY, paint);
    }

    public void setTranslationX(float translationX) {
        this.translationX = translationX;
    }

    public void setTranslationY(float translationY) {
        this.translationY = translationY;
    }
}
