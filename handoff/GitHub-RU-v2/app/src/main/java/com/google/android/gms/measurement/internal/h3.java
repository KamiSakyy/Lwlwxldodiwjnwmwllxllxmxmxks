package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h3 extends com.google.android.gms.internal.measurement.y implements h0 {
    public final /* synthetic */ AtomicReference f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(p3 p3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f = atomicReference;
    }

    @Override // com.google.android.gms.measurement.internal.h0
    public final void E(List list) {
        AtomicReference atomicReference = this.f;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean e(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(c4.CREATOR);
        com.google.android.gms.internal.measurement.z.d(parcel);
        E(createTypedArrayList);
        return true;
    }
}
