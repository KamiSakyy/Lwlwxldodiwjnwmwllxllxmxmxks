package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s5 extends t4 implements RandomAccess, l5, c6 {
    public static final long[] u;
    public static final s5 v;
    public long[] s;
    public int t;

    static {
        long[] jArr = new long[0];
        u = jArr;
        v = new s5(jArr, 0, false);
    }

    public s5(long[] jArr, int i, boolean z) {
        super(z);
        this.s = jArr;
        this.t = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i2 = this.t)) {
            throw new IndexOutOfBoundsException(androidx.glance.appwidget.protobuf.d.a(this.t, i, (byte) 13, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        long[] jArr = this.s;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[com.github.rudroid.copilot.h1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.s, 0, jArr2, 0, i);
            System.arraycopy(this.s, i, jArr2, i3, this.t - i);
            this.s = jArr2;
        }
        this.s[i] = longValue;
        this.t++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = n5.a;
        collection.getClass();
        if (!(collection instanceof s5)) {
            return super.addAll(collection);
        }
        s5 s5Var = (s5) collection;
        int i = s5Var.t;
        if (i == 0) {
            return false;
        }
        int i2 = this.t;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.s;
        if (i3 > jArr.length) {
            this.s = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(s5Var.s, 0, this.s, this.t, s5Var.t);
        this.t = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long b(int i) {
        f(i);
        return this.s[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.m5
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final s5 E(int i) {
        if (i >= this.t) {
            return new s5(i == 0 ? u : Arrays.copyOf(this.s, i), this.t, true);
        }
        throw new IllegalArgumentException();
    }

    public final void e(long j) {
        a();
        int i = this.t;
        int length = this.s.length;
        if (i == length) {
            long[] jArr = new long[com.github.rudroid.copilot.h1.g(length, 3, 2, 1, 10)];
            System.arraycopy(this.s, 0, jArr, 0, this.t);
            this.s = jArr;
        }
        long[] jArr2 = this.s;
        int i2 = this.t;
        this.t = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5)) {
            return super.equals(obj);
        }
        s5 s5Var = (s5) obj;
        if (this.t != s5Var.t) {
            return false;
        }
        long[] jArr = s5Var.s;
        for (int i = 0; i < this.t; i++) {
            if (this.s[i] != jArr[i]) {
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
        return Long.valueOf(this.s[i]);
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.t; i2++) {
            long j = this.s[i2];
            Charset charset = n5.a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.t;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.s[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.t4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        f(i);
        long[] jArr = this.s;
        long j = jArr[i];
        if (i < this.t - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.t--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.s;
        System.arraycopy(jArr, i2, jArr, i, this.t - i2);
        this.t -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        f(i);
        long[] jArr = this.s;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
