package com.google.common.collect;

import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h extends d {
    public static final h v = new h(0, new Object[0]);
    public transient Object[] t;
    public transient int u;

    public h(int i, Object[] objArr) {
        this.t = objArr;
        this.u = i;
    }

    @Override // com.google.common.collect.d, com.google.common.collect.a
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.t;
        int i = this.u;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.common.collect.a
    public final Object[] d() {
        return this.t;
    }

    @Override // com.google.common.collect.a
    public final int e() {
        return this.u;
    }

    @Override // com.google.common.collect.a
    public final int f() {
        return 0;
    }

    @Override // com.google.common.collect.a
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        aa1.b.q(i, this.u);
        Object obj = this.t[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.u;
    }
}
