package com.tianshaokai.common.utils;

import android.content.Context;
import android.util.DisplayMetrics;

public class DisplayUtil {

    /**
     * @param context 上下文
     * @return DisplayMetrics对象
     */
    public static DisplayMetrics getDisplayMetrics(Context context) {
        if(context == null) return null;
        return context.getResources().getDisplayMetrics();
    }

    /**
     * 获取屏幕分辨率-宽
     *
     * @param context 上下文
     * @return 宽
     */
    public static int getScreenWidth(Context context) {
        if(context == null) return 0;
        DisplayMetrics metrics = getDisplayMetrics(context);
        return metrics.widthPixels;
    }

    /**
     * 获取屏幕分辨率-高
     *
     * @param context 上下文
     * @return 高
     */
    public static int getScreenHeight(Context context) {
        if(context == null) return 0;
        DisplayMetrics metrics = getDisplayMetrics(context);
        return metrics.heightPixels;
    }

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     *
     * @param context 上下文
     * @param dpValue 值
     * @return 转换结果
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     *
     * @param context 上下文
     * @param pxValue 值
     * @return 转换结果
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    /**
     * sp转px
     *
     * @param context 上下文
     * @param spValue 值
     * @return 转换结果
     */
    public static int sp2px(Context context, float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }

    /**
     * px转sp
     *
     * @param context 上下文
     * @param pxValue 值
     * @return 转换结果
     */
    public static int px2sp(Context context, float pxValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }
}
