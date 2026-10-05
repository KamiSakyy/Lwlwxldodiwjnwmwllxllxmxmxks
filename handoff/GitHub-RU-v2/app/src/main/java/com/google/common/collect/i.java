package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i extends d {
    public final /* synthetic */ j t;

    public i(j jVar) {
        this.t = jVar;
    }

    @Override // com.google.common.collect.a
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        j jVar = this.t;
        aa1.b.q(i, jVar.w);
        Object[] objArr = jVar.v;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.t.w;
    }
}
