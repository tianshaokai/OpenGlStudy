package com.tianshaokai.app.canvasdemo.handwritting;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 *  圆框
 * Created by tianshaokai on 16-3-13.
 */
public class MyCircle extends Action {
    float startX;
    float startY;
    float stopX;
    float stopY;
    float radius;
    int size;

    MyCircle() {
        startX = 0;
        startY = 0;
        stopX = 0;
        stopY = 0;
        radius = 0;
    }

    MyCircle(float x, float y, int size, int color) {
        super(color);
        startX = x;
        startY = y;
        stopX = x;
        stopY = y;
        radius = 0;
        this.size = size;
    }

    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(color);
        paint.setStrokeWidth(size);
        canvas.drawCircle((startX + stopX) / 2, (startY + stopY) / 2, radius,
                paint);
    }

    public void move(float mx, float my) {
        stopX = mx;
        stopY = my;
        radius = (float) ((Math.sqrt((mx - startX) * (mx - startX)
                + (my - startY) * (my - startY))) / 2);
    }
}