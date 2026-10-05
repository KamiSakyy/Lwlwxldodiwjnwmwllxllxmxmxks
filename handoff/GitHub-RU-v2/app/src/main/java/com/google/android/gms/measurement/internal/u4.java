package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u4 implements d2 {
    public final com.google.android.gms.internal.measurement.r0 a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public u4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.r0 r0Var) {
        this.b = appMeasurementDynamiteService;
        this.a = r0Var;
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final void a(long j, Bundle bundle, String str, String str2) {
        try {
            this.a.m(j, bundle, str, str2);
        } catch (RemoteException e) {
            o1 o1Var = this.b.f;
            if (o1Var != null) {
                s0 s0Var = o1Var.w;
                o1.m(s0Var);
                s0Var.A.b(e, "Event listener threw exception");
            }
        }
    }
}
