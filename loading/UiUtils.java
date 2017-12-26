package com.customize_view.example.loading;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 *
 * Created by 15848 on 2017/12/12.
 */

public class UiUtils {
    //获得屏幕宽度像素
    static public int getScreenWidthPixels (Context context){
        DisplayMetrics dm = new DisplayMetrics();
        ((WindowManager)context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getMetrics(dm);
        return dm.widthPixels;
    }

    static public int dipToPx(Context context,int dip){
        return (int)(dip*getScreenDensity(context)+0.5f);
    }

    static public float getScreenDensity(Context context){
        try {
            DisplayMetrics dm = new DisplayMetrics();
            ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getMetrics(dm);
            return dm.density;
        }catch (Exception ex){
            return DisplayMetrics.DENSITY_DEFAULT;
        }
    }
}
