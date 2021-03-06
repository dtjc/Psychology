package com.dt.psychology.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.dt.psychology.ui.MyApplication;

/**
 * Created by dnnt9 on 2017/4/3.
 */

public class NetworkUtil {
    public static boolean isNetworkConnected(Context context){
        if (!(context instanceof MyApplication))
            context = context.getApplicationContext();
        ConnectivityManager manager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();
        if (networkInfo == null || !networkInfo.isConnected()) return false;
        return true;
    }
}
