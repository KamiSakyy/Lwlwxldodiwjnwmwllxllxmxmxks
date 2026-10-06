package com.google.common.collect;

import com.google.android.gms.internal.play_billing.b0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k extends f {
    public transient m u;
    public transient l v;

    public k(m mVar, l lVar) {
        this.u = mVar;
        this.v = lVar;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.a
    public final d a() {
        return this.v;
    }

    @Override // com.google.common.collect.a
    public final int b(Object[] objArr) {
        return this.v.b(objArr);
    }

    @Override // com.google.common.collect.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.u.get(obj) != null;
    }

    @Override // com.google.common.collect.a
    public final boolean g() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final b0 iterator() {
        return this.v.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.u.w;
    }
}
