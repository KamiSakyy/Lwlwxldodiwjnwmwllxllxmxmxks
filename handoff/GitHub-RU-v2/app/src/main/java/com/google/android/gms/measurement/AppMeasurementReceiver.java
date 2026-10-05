package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.o1;
import com.google.android.gms.measurement.internal.s0;
import q6.a;
import y51.c;

/* loaded from: /home/user/work/p/classes4.dex */
public final class AppMeasurementReceiver extends a {
    public c c;

    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new c(26, this);
        }
        c cVar = this.c;
        cVar.getClass();
        s0 s0Var = o1.s(context, null, null).w;
        o1.m(s0Var);
        if (intent == null) {
            s0Var.A.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        s0Var.F.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                s0Var.A.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        s0Var.F.a("Starting wakeful intent.");
        ((AppMeasurementReceiver) cVar.s).getClass();
        SparseArray sparseArray = a.a;
        synchronized (sparseArray) {
            try {
                int i = a.b;
                int i2 = i + 1;
                a.b = i2;
                if (i2 <= 0) {
                    a.b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName startService = context.startService(className);
                if (startService == null) {
                    return;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire(60000L);
                sparseArray.put(i, newWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
