package org.smartregister.client.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import java.util.Map;

/**
 * Created by Ephraim Kigamba - nek.eam@gmail.com on 25-06-2020.
 */
class SampleClass {

    public SampleClass() {

    }


    public static boolean isEmptyMap(Map map) {
        return map == null || map.isEmpty();
    }

    public static String getVersion(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        return packageInfo.versionName;
    }

    public static long getVersionCode(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        return packageInfo.versionCode;
    }
}
