package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import c21.uShadow;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.measurement.internal.o4;
import com.google.android.gms.measurement.internal.s0;
import com.google.android.gms.measurement.internal.s3;
import com.google.common.util.concurrent.b;
import java.util.Objects;
import w80.w3;
import y51.c;

@TargetApi(24)
/* loaded from: /home/user/work/p/classes4.dex */
public final class AppMeasurementJobService extends JobService implements s3 {
    public c r;

    @Override // com.google.android.gms.measurement.internal.s3
    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void b(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final c d() {
        if (this.r == null) {
            this.r = new c(29, this);
        }
        return this.r;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        JobParameters jobParameters2;
        c d = d();
        Service service = (Service) d.s;
        String string = jobParameters.getExtras().getString("action");
        "onStartJob received action: ".concat(String.valueOf(string));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            uShadow.g(string);
            o4 C = o4.C(service);
            s0 a = C.a();
            w3 w3Var = C.C.t;
            a.F.b(string, "Local AppMeasurementJobService called. action");
            jobParameters2 = jobParameters;
            C.b().I(new b(d, C, new c51.c(9, d, a, jobParameters2, false)));
        } else {
            jobParameters2 = jobParameters;
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        uShadow.g(string);
        k1 c = k1.c(service, null);
        b bVar = new b(17, d, jobParameters2);
        c.getClass();
        c.a(new x0(c, bVar, 2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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
