package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o0 extends c21.e {
    @Override // c21.e
    public final int h() {
        return 12451000;
    }

    @Override // c21.e
    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof f0 ? (f0) queryLocalInterface : new d0(iBinder);
    }

    @Override // c21.e
    public final String v() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // c21.e
    public final String w() {
        return "com.google.android.gms.measurement.START";
    }
}
