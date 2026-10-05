package com.google.common.collect;

import java.util.Iterator;
import w8.s;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o extends f {
    public final transient Object u;

    public o(Object obj) {
        this.u = obj;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.a
    public final d a() {
        b bVar = d.s;
        Object[] objArr = {this.u};
        s.i(1, objArr);
        return d.i(1, objArr);
    }

    @Override // com.google.common.collect.a
    public final int b(Object[] objArr) {
        objArr[0] = this.u;
        return 1;
    }

    @Override // com.google.common.collect.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.u.equals(obj);
    }

    @Override // com.google.common.collect.a
    public final boolean g() {
        return false;
    }

    @Override // com.google.common.collect.f, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.u.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new g(this.u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.u.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
