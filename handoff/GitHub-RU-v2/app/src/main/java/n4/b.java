package n4;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b extends o4.b {
    public static boolean e(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.POST_NOTIFICATIONS")) {
            return false;
        }
        if (i < 32 && i == 31) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), "android.permission.POST_NOTIFICATIONS")).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
            }
        }
        return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
    }
}
