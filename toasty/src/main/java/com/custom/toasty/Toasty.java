package com.custom.toasty;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Toasty {

    public static final int LENGTH_SHORT = Toast.LENGTH_SHORT;
    public static final int LENGTH_LONG = Toast.LENGTH_LONG;

    /*defaults*/
    public static void defaults(Context context, String message){
        configToast(context, message, LENGTH_SHORT, R.drawable.default_shape, 0);
    }

    public static void defaults(Context context, String message, int lengthLong) {
        configToast(context, message, lengthLong, R.drawable.default_shape, 0);

    }

    /*success*/
    public static void success(Context context, String message){
        configToast(context, message, LENGTH_SHORT, R.drawable.success_shape, R.drawable.ic_done);
    }

    public static void success(Context context, String message, int lengthLong) {
        configToast(context, message, lengthLong, R.drawable.success_shape, R.drawable.ic_done);

    }

    /*warning*/
    public static void warning(Context context, String message){
        configToast(context, message, LENGTH_SHORT, R.drawable.warning_shape, R.drawable.ic_pan);
    }

    public static void warning(Context context, String message, int lengthLong) {
        configToast(context, message, lengthLong, R.drawable.warning_shape, R.drawable.ic_pan);

    }

    /*error*/
    public static void error(Context context, String message){
        configToast(context, message, LENGTH_SHORT, R.drawable.error_shape, R.drawable.ic_close);

    }

    public static void error(Context context, String message, int lengthLong) {
        configToast(context, message, lengthLong, R.drawable.error_shape, R.drawable.ic_close);

    }

    /*info*/
    public static void info(Context context, String message){
        configToast(context, message, LENGTH_SHORT, R.drawable.info_shape, R.drawable.ic_info);
    }

    public static void info(Context context, String message, int lengthLong) {
        configToast(context, message, lengthLong, R.drawable.info_shape, R.drawable.ic_info);

    }

    /*confusing*/
    public static void confusing(Context context, String message){
        configToast(context, message, LENGTH_SHORT, R.drawable.confusing_shape, R.drawable.ic_refresh);
    }

    public static void confusing(Context context, String message, int lengthLong) {
        configToast(context, message, lengthLong, R.drawable.confusing_shape, R.drawable.ic_refresh);

    }

    private static void configToast(Context context, String message, int lengthLong, int shape, int icon){
        Toast toast = new Toast(context);

        @SuppressLint("InflateParams")
        View layout = LayoutInflater.from(context).inflate(R.layout.toasty_layout, null, false);
        TextView l1 = layout.findViewById(R.id.toast_text);
        LinearLayout linearLayout = layout.findViewById(R.id.toast_type);
        ImageView img = layout.findViewById(R.id.toast_icon);
        linearLayout.setBackgroundResource(shape);
        if (icon == 0){
            img.setVisibility(View.GONE);
        }else {
            img.setImageResource(icon);
        }
        toast.setDuration(lengthLong);
        l1.setText(message);
        toast.setView(layout);
        toast.show();
    }
}
