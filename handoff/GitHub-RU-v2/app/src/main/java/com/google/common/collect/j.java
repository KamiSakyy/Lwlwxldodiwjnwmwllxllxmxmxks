package com.google.common.collect;

import com.google.android.gms.internal.play_billing.b0;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j extends f {
    public final transient m u;
    public final transient Object[] v;
    public final transient int w;

    public j(m mVar, Object[] objArr, int i) {
        this.u = mVar;
        this.v = objArr;
        this.w = i;
    }

    @Override // com.google.common.collect.a
    public final int b(Object[] objArr) {
        return a().b(objArr);
    }

    @Override // com.google.common.collect.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.u.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.a
    public final boolean g() {
        return true;
    }

    @Override // com.google.common.collect.f
    public final d k() {
        return new i(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final b0 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.w;
    }
}
