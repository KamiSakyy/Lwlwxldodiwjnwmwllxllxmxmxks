package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d4 extends i4 {
    public final AlarmManager v;
    public w3 w;
    public Integer x;

    public d4(o4 o4Var) {
        super(o4Var);
        this.v = (AlarmManager) ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).r.getSystemService("alarm");
    }

    @Override // com.google.android.gms.measurement.internal.i4
    public final void C() {
        AlarmManager alarmManager = this.v;
        if (alarmManager != null) {
            Context context = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).r;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.f0.a));
        }
        F();
    }

    public final void D() {
        A();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        s0 s0Var = o1Var.w;
        o1.m(s0Var);
        s0Var.F.a("Unscheduling upload");
        AlarmManager alarmManager = this.v;
        if (alarmManager != null) {
            Context context = o1Var.r;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.f0.a));
        }
        E().c();
        F();
    }

    public final p E() {
        if (this.w == null) {
            this.w = new w3(this, this.t.C, 1);
        }
        return this.w;
    }

    public final void F() {
        JobScheduler jobScheduler = (JobScheduler) ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).r.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(G());
        }
    }

    public final int G() {
        if (this.x == null) {
            this.x = Integer.valueOf("measurement".concat(String.valueOf(((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).r.getPackageName())).hashCode());
        }
        return this.x.intValue();
    }
}
