package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v extends r {
    public static final v v = new v(0, new Object[0]);
    public transient Object[] t;
    public transient int u;

    public v(int i, Object[] objArr) {
        this.t = objArr;
        this.u = i;
    }

    @Override // com.google.android.gms.internal.play_billing.r, com.google.android.gms.internal.play_billing.o
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.t;
        int i = this.u;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int b() {
        return this.u;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Object[] g() {
        return this.t;
    }

    @Override // java.util.List
    public final Object get(int i) {
        y41.t1.U(i, this.u);
        Object obj = this.t[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.u;
    }
}
