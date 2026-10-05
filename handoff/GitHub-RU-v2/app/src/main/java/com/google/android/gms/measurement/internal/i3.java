package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i3 extends com.google.android.gms.internal.measurement.y implements j0 {
    public final /* synthetic */ AtomicReference f;
    public final /* synthetic */ p3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(p3 p3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f = atomicReference;
        this.g = p3Var;
    }

    @Override // com.google.android.gms.measurement.internal.j0
    public final void B(h4 h4Var) {
        AtomicReference atomicReference = this.f;
        synchronized (atomicReference) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.g).s).w;
            o1.m(s0Var);
            s0Var.F.b(Integer.valueOf(h4Var.r.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(h4Var);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean e(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        h4 h4Var = (h4) com.google.android.gms.internal.measurement.z.a(parcel, h4.CREATOR);
        com.google.android.gms.internal.measurement.z.d(parcel);
        B(h4Var);
        return true;
    }
}
