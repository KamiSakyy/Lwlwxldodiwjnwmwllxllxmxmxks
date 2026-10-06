package com.google.common.collect;

import com.google.android.gms.internal.play_billing.b0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n extends f {
    public static final n A;
    public static final Object[] z;
    public transient Object[] u;
    public transient int v;
    public transient Object[] w;
    public transient int x;
    public transient int y;

    static {
        Object[] objArr = new Object[0];
        z = objArr;
        A = new n(0, 0, 0, objArr, objArr);
    }

    public n(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.u = objArr;
        this.v = i;
        this.w = objArr2;
        this.x = i2;
        this.y = i3;
    }

    @Override // com.google.common.collect.a
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.u;
        int i = this.y;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.common.collect.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.w;
            if (objArr.length != 0) {
                int d0 = m71.a.d0(obj.hashCode());
                while (true) {
                    int i = d0 & this.x;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    d0 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.a
    public final Object[] d() {
        return this.u;
    }

    @Override // com.google.common.collect.a
    public final int e() {
        return this.y;
    }

    @Override // com.google.common.collect.a
    public final int f() {
        return 0;
    }

    @Override // com.google.common.collect.a
    public final boolean g() {
        return false;
    }

    @Override // com.google.common.collect.f, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.v;
    }

    @Override // com.google.common.collect.f
    public final d k() {
        return d.i(this.y, this.u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final b0 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.y;
    }
}
