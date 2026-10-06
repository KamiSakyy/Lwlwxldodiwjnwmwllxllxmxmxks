package z11;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.a1;
import c21.u;
import com.google.android.gms.common.SupportErrorDialogFragment;
import com.google.android.gms.common.api.GoogleApiActivity;
import n4.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e extends f {
    public static final Object c = new Object();
    public static final e d = new e();

    public static AlertDialog d(Activity activity, int i, c21.o oVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(c21.n.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(2131951944) : resources.getString(2131951954) : resources.getString(2131951947);
        if (string != null) {
            builder.setPositiveButton(string, oVar);
        }
        String c2 = c21.n.c(activity, i);
        if (c2 != null) {
            builder.setTitle(c2);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof kShadow.i) {
                a1 H = ((k.i) activity).H();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                u.h(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                supportErrorDialogFragment.J0 = alertDialog;
                if (onCancelListener != null) {
                    supportErrorDialogFragment.K0 = onCancelListener;
                }
                supportErrorDialogFragment.z4(H, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        u.h(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.r = alertDialog;
        if (onCancelListener != null) {
            cVar.s = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog d2 = d(googleApiActivity, i, new c21.o(super.a(i, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (d2 == null) {
            return;
        }
        e(googleApiActivity, d2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        new IllegalArgumentException();
        if (i == 18) {
            new i(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String e = i == 6 ? c21.n.e(context, "common_google_play_services_resolution_required_title") : c21.n.c(context, i);
        if (e == null) {
            e = context.getResources().getString(2131951951);
        }
        String d2 = (i == 6 || i == 19) ? c21.n.d(context, "common_google_play_services_resolution_required_text", c21.n.a(context)) : c21.n.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        u.g(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        n4.p pVar = new n4.p(context, (String) null);
        pVar.p = true;
        pVar.c(16, true);
        pVar.e = n4.p.b(e);
        n4.n nVar = new n4.n(0);
        nVar.u = n4.p.b(d2);
        pVar.e(nVar);
        PackageManager packageManager = context.getPackageManager();
        if (g21.b.c == null) {
            g21.b.c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (g21.b.c.booleanValue()) {
            pVar.v.icon = context.getApplicationInfo().icon;
            pVar.j = 2;
            if (g21.b.a(context)) {
                pVar.b.add(new n4.j(IconCompat.a(2131231029), resources.getString(2131951959), pendingIntent, new Bundle(), (d0[]) null, (d0[]) null, true, true));
            } else {
                pVar.g = pendingIntent;
            }
        } else {
            pVar.v.icon = R.drawable.stat_sys_warning;
            pVar.v.tickerText = n4.p.b(resources.getString(2131951951));
            pVar.v.when = System.currentTimeMillis();
            pVar.g = pendingIntent;
            pVar.f = n4.p.b(d2);
        }
        synchronized (c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(2131951950);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        pVar.t = "com.google.android.gms.availability";
        Notification a = pVar.a();
        if (i == 1 || i == 2 || i == 3) {
            g.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, a);
    }

    public final void g(Activity activity, b21.e eVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d2 = d(activity, i, new c21.o(super.a(i, activity, "d"), eVar, 1), onCancelListener);
        if (d2 == null) {
            return;
        }
        e(activity, d2, "GooglePlayServicesErrorDialog", onCancelListener);
    }
    public Object z(Object p1, Object p2, Object p3) { return null; }
}
