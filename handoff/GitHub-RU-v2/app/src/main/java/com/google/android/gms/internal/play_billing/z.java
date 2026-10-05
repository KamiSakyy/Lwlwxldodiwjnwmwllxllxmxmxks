package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z extends r {
    public final transient Object[] t;
    public final transient int u;
    public final transient int v;

    public z(Object[] objArr, int i, int i2) {
        this.t = objArr;
        this.u = i;
        this.v = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        y41.t1.U(i, this.v);
        Object obj = this.t[i + i + this.u];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.v;
    }
}
