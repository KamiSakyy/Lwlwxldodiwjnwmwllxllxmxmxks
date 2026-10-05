package b6;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.contentcapture.ContentCaptureSession;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a2 {
    public static void a() {
        Trace.beginAsyncSection("GlanceAppWidget::update", 0);
    }

    public static void b() {
        Trace.endAsyncSection("GlanceAppWidget::update", 0);
    }

    public static ColorStateList c(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    public static ContentCaptureSession d(View view) {
        return view.getContentCaptureSession();
    }

    public static float e(View view) {
        return view.getTransitionAlpha();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(Context context) {
        boolean z10;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (sy.t.k(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z10 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            if (Build.VERSION.SDK_INT >= 29) {
                t.q.k(null);
                return;
            }
            w21.o oVar = new w21.o();
            try {
                if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                    SharedPreferences.Editor edit = sy.t.k(context).edit();
                    edit.putBoolean("proxy_notification_initialized", true);
                    edit.apply();
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                    if (z10) {
                        notificationManager.setNotificationDelegate("com.google.android.gms");
                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                        notificationManager.setNotificationDelegate(null);
                    }
                } else {
                    context.getPackageName();
                }
                oVar.o((Object) null);
                return;
            } catch (Throwable th) {
                oVar.o((Object) null);
                throw th;
            }
        }
        z10 = true;
        if (Build.VERSION.SDK_INT >= 29) {
        }
    }

    public static boolean g() {
        return Trace.isEnabled();
    }

    public static boolean h(Context context) {
        if (Build.VERSION.SDK_INT < 29) {
            Log.isLoggable("FirebaseMessaging", 3);
            return false;
        }
        if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
            context.getPackageName();
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        Log.isLoggable("FirebaseMessaging", 3);
        return true;
    }

    public static Insets i(int i, int i10, int i11, int i12) {
        return Insets.of(i, i10, i11, i12);
    }

    public static void j(View view, int i, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i, i10, i11, i12);
    }

    public static void k(View view, float f6) {
        view.setTransitionAlpha(f6);
    }

    public static void l(View view, int i) {
        view.setTransitionVisibility(i);
    }

    public static void m(SystemForegroundService systemForegroundService, int i, Notification notification, int i10) {
        systemForegroundService.startForeground(i, notification, i10);
    }

    public static void n(SystemForegroundService systemForegroundService, int i, Notification notification, int i10) {
        try {
            systemForegroundService.startForeground(i, notification, i10);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            v8.x a10 = v8.x.a();
            int i11 = SystemForegroundService.f3235v;
            a10.getClass();
        } catch (SecurityException unused2) {
            v8.x a11 = v8.x.a();
            int i12 = SystemForegroundService.f3235v;
            a11.getClass();
        }
    }

    public static void o(ViewGroup viewGroup, boolean z10) {
        viewGroup.suppressLayout(z10);
    }

    public static final void p(String str, long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j10);
        }
    }

    public static void q(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void r(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }


}
