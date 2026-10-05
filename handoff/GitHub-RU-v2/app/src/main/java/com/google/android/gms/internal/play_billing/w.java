package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w extends r {
    public final /* synthetic */ x t;

    public w(x xVar) {
        this.t = xVar;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        x xVar = this.t;
        y41.t1.U(i, xVar.v);
        Object[] objArr = xVar.u;
        int i2 = i + i;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.t.v;
    }
}
