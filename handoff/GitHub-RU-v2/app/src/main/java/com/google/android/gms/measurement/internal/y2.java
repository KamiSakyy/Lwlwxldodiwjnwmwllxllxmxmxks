package com.google.android.gms.measurement.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y2 extends e0 {
    public JobScheduler u;

    @Override // com.google.android.gms.measurement.internal.e0
    public final boolean C() {
        return true;
    }

    public final void D(long j) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        A();
        z();
        JobScheduler jobScheduler = this.u;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(o1Var.r.getPackageName())).hashCode()) != null) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.F.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int E = E();
        if (E != 2) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.F.b(com.github.rudroid.copilot.h1.F(E), "[sgtm] Not eligible for Scion upload");
            return;
        }
        s0 s0Var3 = o1Var.w;
        o1.m(s0Var3);
        s0Var3.F.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo build = new JobInfo.Builder("measurement-client".concat(String.valueOf(o1Var.r.getPackageName())).hashCode(), new ComponentName(o1Var.r, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.u;
        c21.u.g(jobScheduler2);
        int schedule = jobScheduler2.schedule(build);
        s0 s0Var4 = o1Var.w;
        o1.m(s0Var4);
        s0Var4.F.b(schedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int E() {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        A();
        z();
        if (this.u == null) {
            return 7;
        }
        Boolean L = o1Var.u.L("google_analytics_sgtm_upload_enabled");
        if (!(L == null ? false : L.booleanValue())) {
            return 8;
        }
        if (o1Var.r().B < 119000) {
            return 6;
        }
        if (t4.S(o1Var.r)) {
            return !o1Var.p().G() ? 5 : 2;
        }
        return 3;
    }
}
