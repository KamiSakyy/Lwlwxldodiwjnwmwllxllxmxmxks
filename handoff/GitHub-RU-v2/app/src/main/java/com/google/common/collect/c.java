package com.google.common.collect;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c extends d {
    public transient int t;
    public transient int u;
    public final /* synthetic */ d v;

    public c(d dVar, int i, int i2) {
        this.v = dVar;
        this.t = i;
        this.u = i2;
    }

    @Override // com.google.common.collect.a
    public final Object[] d() {
        return this.v.d();
    }

    @Override // com.google.common.collect.a
    public final int e() {
        return this.v.f() + this.t + this.u;
    }

    @Override // com.google.common.collect.a
    public final int f() {
        return this.v.f() + this.t;
    }

    @Override // com.google.common.collect.a
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        aa1.b.q(i, this.u);
        return this.v.get(i + this.t);
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.d, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final d subList(int i, int i2) {
        aa1.b.s(i, i2, this.u);
        int i3 = this.t;
        return this.v.subList(i + i3, i2 + i3);
    }

    @Override // com.google.common.collect.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.u;
    }

    @Override // com.google.common.collect.d, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
