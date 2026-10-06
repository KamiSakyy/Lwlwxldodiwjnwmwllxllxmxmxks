package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a3 extends com.google.android.gms.internal.measurement.b4 {
    public AtomicReferenceFieldUpdater A;
    public AtomicReferenceFieldUpdater B;
    public AtomicReferenceFieldUpdater x;
    public AtomicReferenceFieldUpdater y;
    public AtomicReferenceFieldUpdater z;

    public a3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.x = atomicReferenceFieldUpdater;
        this.y = atomicReferenceFieldUpdater2;
        this.z = atomicReferenceFieldUpdater3;
        this.A = atomicReferenceFieldUpdater4;
        this.B = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final boolean A0(z3 z3Var, Object obj, Object obj2) {
        return i21.a.V(this.B, z3Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final boolean B0(z3 z3Var, y3 y3Var, y3 y3Var2) {
        return i21.a.V(this.z, z3Var, y3Var, y3Var2);
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final void w0(y3 y3Var, y3 y3Var2) {
        this.y.lazySet(y3Var, y3Var2);
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final void y0(y3 y3Var, Thread thread) {
        this.x.lazySet(y3Var, thread);
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final boolean z0(z3 z3Var, g2 g2Var, g2 g2Var2) {
        return i21.a.V(this.A, z3Var, g2Var, g2Var2);
    }
}
