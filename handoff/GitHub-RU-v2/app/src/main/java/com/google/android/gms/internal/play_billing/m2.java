package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m2 extends h1 implements RandomAccess {
    public static final Object[] u;
    public static final m2 v;
    public Object[] s;
    public int t;

    static {
        Object[] objArr = new Object[0];
        u = objArr;
        v = new m2(objArr, 0, false);
    }

    public m2(Object[] objArr, int i, boolean z) {
        super(z);
        this.s = objArr;
        this.t = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.t)) {
            throw new IndexOutOfBoundsException(no.a.j(i, this.t, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        Object[] objArr = this.s;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[com.github.rudroid.copilot.h1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.s, 0, objArr2, 0, i);
            System.arraycopy(this.s, i, objArr2, i3, this.t - i);
            this.s = objArr2;
        }
        this.s[i] = obj;
        this.t++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.t) {
            throw new IndexOutOfBoundsException(no.a.j(i, this.t, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.s[i];
    }

    @Override // com.google.android.gms.internal.play_billing.x1
    public final /* bridge */ /* synthetic */ x1 h(int i) {
        if (i >= this.t) {
            return new m2(i == 0 ? u : Arrays.copyOf(this.s, i), this.t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.h1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        Object[] objArr = this.s;
        Object obj = objArr[i];
        if (i < this.t - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.t--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        b(i);
        Object[] objArr = this.s;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.t;
        int length = this.s.length;
        if (i == length) {
            this.s = Arrays.copyOf(this.s, com.github.rudroid.copilot.h1.g(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.s;
        int i2 = this.t;
        this.t = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
