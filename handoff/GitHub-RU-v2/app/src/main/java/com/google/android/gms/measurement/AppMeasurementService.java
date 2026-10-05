package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.o1;
import com.google.android.gms.measurement.internal.o4;
import com.google.android.gms.measurement.internal.s0;
import com.google.android.gms.measurement.internal.s3;
import com.google.android.gms.measurement.internal.v1;
import com.google.common.util.concurrent.b;
import q6.a;
import y51.c;

/* loaded from: /home/user/work/p/classes4.dex */
public final class AppMeasurementService extends Service implements s3 {
    public c r;

    @Override // com.google.android.gms.measurement.internal.s3
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void b(Intent intent) {
        SparseArray sparseArray = a.a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = a.a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final c d() {
        if (this.r == null) {
            this.r = new c(29, this);
        }
        return this.r;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        c d = d();
        d.getClass();
        if (intent == null) {
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new v1(o4.C((Service) d.s));
        }
        "onBind received unknown action: ".concat(String.valueOf(action));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((Service) d().s).getClass().getSimpleName().concat(" is starting up.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((Service) d().s).getClass().getSimpleName().concat(" is shutting down.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            return;
        }
        "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final c d = d();
        if (intent == null) {
            d.getClass();
            return 2;
        }
        Service service = (Service) d.s;
        final s0 s0Var = o1.s(service, null, null).w;
        o1.m(s0Var);
        String action = intent.getAction();
        s0Var.F.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.measurement.internal.t3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = (Service) y51.c.this.s;
                s3 s3Var = (s3) service2;
                int i3 = i2;
                if (s3Var.a(i3)) {
                    s0Var.F.b(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    s0 s0Var2 = o1.s(service2, null, null).w;
                    o1.m(s0Var2);
                    s0Var2.F.a("Completed wakeful intent.");
                    s3Var.b(intent);
                }
            }
        };
        o4 C = o4.C(service);
        C.b().I(new b(d, C, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            return true;
        }
        "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
        return true;
    }
}
