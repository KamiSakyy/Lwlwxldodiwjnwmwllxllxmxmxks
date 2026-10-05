package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y extends u {
    public final transient a0 t;
    public final transient z u;

    public y(a0 a0Var, z zVar) {
        this.t = a0Var;
        this.u = zVar;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int a(Object[] objArr) {
        return this.u.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.t.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.u, com.google.android.gms.internal.play_billing.o
    public final r e() {
        return this.u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.u.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.t.w;
    }
}
