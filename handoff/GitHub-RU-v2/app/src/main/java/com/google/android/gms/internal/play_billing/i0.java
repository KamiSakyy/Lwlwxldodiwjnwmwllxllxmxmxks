package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 extends b91.g {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(l0.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(l0.class, l0.class, "b");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(m0.class, l0.class, "t");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(m0.class, g0.class, "s");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(m0.class, Object.class, "r");

    public final g0 c0(w0 w0Var) {
        return (g0) d.getAndSet(w0Var, g0.d);
    }

    public final l0 e0(w0 w0Var) {
        return (l0) c.getAndSet(w0Var, l0.c);
    }

    public final void f0(l0 l0Var, l0 l0Var2) {
        b.lazySet(l0Var, l0Var2);
    }

    public final void g0(l0 l0Var, Thread thread) {
        a.lazySet(l0Var, thread);
    }

    public final boolean h0(w0 w0Var, g0 g0Var, g0 g0Var2) {
        return com.google.android.gms.internal.measurement.z3.X(d, w0Var, g0Var, g0Var2);
    }

    public final boolean i0(m0 m0Var, Object obj, Object obj2) {
        return com.google.android.gms.internal.measurement.z3.X(e, m0Var, obj, obj2);
    }

    public final boolean j0(m0 m0Var, l0 l0Var, l0 l0Var2) {
        return com.google.android.gms.internal.measurement.z3.X(c, m0Var, l0Var, l0Var2);
    }
}
