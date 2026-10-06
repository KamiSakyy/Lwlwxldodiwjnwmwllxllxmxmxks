package com.google.common.collect;

import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l extends d {
    public transient Object[] t;
    public transient int u;
    public transient int v;

    public l(Object[] objArr, int i, int i2) {
        this.t = objArr;
        this.u = i;
        this.v = i2;
    }

    @Override // com.google.common.collect.a
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        aa1.b.q(i, this.v);
        Object obj = this.t[(i * 2) + this.u];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.v;
    }
}
