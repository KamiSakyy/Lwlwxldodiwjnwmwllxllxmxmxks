package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h5 extends t4 implements RandomAccess, k5, c6 {
    public static final int[] u;
    public static final h5 v;
    public int[] s;
    public int t;

    static {
        int[] iArr = new int[0];
        u = iArr;
        v = new h5(iArr, 0, false);
    }

    public h5(int[] iArr, int i, boolean z) {
        super(z);
        this.s = iArr;
        this.t = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.t)) {
            throw new IndexOutOfBoundsException(androidx.glance.appwidget.protobuf.d.a(this.t, i, (byte) 13, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        int[] iArr = this.s;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[com.github.rudroid.copilot.h1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.s, 0, iArr2, 0, i);
            System.arraycopy(this.s, i, iArr2, i3, this.t - i);
            this.s = iArr2;
        }
        this.s[i] = intValue;
        this.t++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = n5.a;
        collection.getClass();
        if (!(collection instanceof h5)) {
            return super.addAll(collection);
        }
        h5 h5Var = (h5) collection;
        int i = h5Var.t;
        if (i == 0) {
            return false;
        }
        int i2 = this.t;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.s;
        if (i3 > iArr.length) {
            this.s = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(h5Var.s, 0, this.s, this.t, h5Var.t);
        this.t = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h5 E(int i) {
        if (i >= this.t) {
            return new h5(i == 0 ? u : Arrays.copyOf(this.s, i), this.t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        f(i);
        return this.s[i];
    }

    public final void e(int i) {
        a();
        int i2 = this.t;
        int length = this.s.length;
        if (i2 == length) {
            int[] iArr = new int[com.github.rudroid.copilot.h1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.s, 0, iArr, 0, this.t);
            this.s = iArr;
        }
        int[] iArr2 = this.s;
        int i3 = this.t;
        this.t = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return super.equals(obj);
        }
        h5 h5Var = (h5) obj;
        if (this.t != h5Var.t) {
            return false;
        }
        int[] iArr = h5Var.s;
        for (int i = 0; i < this.t; i++) {
            if (this.s[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.t) {
            throw new IndexOutOfBoundsException(androidx.glance.appwidget.protobuf.d.a(this.t, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        f(i);
        return Integer.valueOf(this.s[i]);
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.t; i2++) {
            i = (i * 31) + this.s[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.t;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.s[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        f(i);
        int[] iArr = this.s;
        int i2 = iArr[i];
        if (i < this.t - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.t--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.s;
        System.arraycopy(iArr, i2, iArr, i, this.t - i2);
        this.t -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        f(i);
        int[] iArr = this.s;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
