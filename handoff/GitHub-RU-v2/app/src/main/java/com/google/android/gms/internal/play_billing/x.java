package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x extends u {
    public final transient a0 t;
    public final transient Object[] u;
    public final transient int v;

    public x(a0 a0Var, Object[] objArr, int i) {
        this.t = a0Var;
        this.u = objArr;
        this.v = i;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int a(Object[] objArr) {
        return e().a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.t.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.u
    public final r i() {
        return new w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.v;
    }
}
