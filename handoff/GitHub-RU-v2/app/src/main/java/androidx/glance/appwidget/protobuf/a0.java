package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /home/user/work/p/classes.dex */
public final class a0 extends b implements c0, RandomAccess, v0 {

    /* renamed from: u, reason: collision with root package name */
    public static final a0 f2686u = new a0(new int[0], 0, false);

    /* renamed from: s, reason: collision with root package name */
    public int[] f2687s;

    /* renamed from: t, reason: collision with root package name */
    public int f2688t;

    public a0(int[] iArr, int i, boolean z10) {
        super(z10);
        this.f2687s = iArr;
        this.f2688t = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i10 = this.f2688t)) {
            StringBuilder o5 = x.i.o("Index:", i, ", Size:");
            o5.append(this.f2688t);
            throw new IndexOutOfBoundsException(o5.toString());
        }
        int[] iArr = this.f2687s;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i10 - i);
        } else {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f2687s, i, iArr2, i + 1, this.f2688t - i);
            this.f2687s = iArr2;
        }
        this.f2687s[i] = intValue;
        this.f2688t++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.glance.appwidget.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = e0.f2705a;
        collection.getClass();
        if (!(collection instanceof a0)) {
            return super.addAll(collection);
        }
        a0 a0Var = (a0) collection;
        int i = a0Var.f2688t;
        if (i == 0) {
            return false;
        }
        int i10 = this.f2688t;
        if (Integer.MAX_VALUE - i10 < i) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i;
        int[] iArr = this.f2687s;
        if (i11 > iArr.length) {
            this.f2687s = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(a0Var.f2687s, 0, this.f2687s, this.f2688t, a0Var.f2688t);
        this.f2688t = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        a();
        int i10 = this.f2688t;
        int[] iArr = this.f2687s;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[((i10 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f2687s = iArr2;
        }
        int[] iArr3 = this.f2687s;
        int i11 = this.f2688t;
        this.f2688t = i11 + 1;
        iArr3[i11] = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.f2688t) {
            StringBuilder o5 = x.i.o("Index:", i, ", Size:");
            o5.append(this.f2688t);
            throw new IndexOutOfBoundsException(o5.toString());
        }
    }

    public final int e(int i) {
        d(i);
        return this.f2687s[i];
    }

    @Override // androidx.glance.appwidget.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return super.equals(obj);
        }
        a0 a0Var = (a0) obj;
        if (this.f2688t != a0Var.f2688t) {
            return false;
        }
        int[] iArr = a0Var.f2687s;
        for (int i = 0; i < this.f2688t; i++) {
            if (this.f2687s[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(e(i));
    }

    @Override // androidx.glance.appwidget.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i10 = 0; i10 < this.f2688t; i10++) {
            i = (i * 31) + this.f2687s[i10];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f2688t;
        for (int i10 = 0; i10 < i; i10++) {
            if (this.f2687s[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // androidx.glance.appwidget.protobuf.d0
    public final d0 r(int i) {
        if (i >= this.f2688t) {
            return new a0(Arrays.copyOf(this.f2687s, i), this.f2688t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.glance.appwidget.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        d(i);
        int[] iArr = this.f2687s;
        int i10 = iArr[i];
        if (i < this.f2688t - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f2688t--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i10) {
        a();
        if (i10 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f2687s;
        System.arraycopy(iArr, i10, iArr, i, this.f2688t - i10);
        this.f2688t -= i10 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        d(i);
        int[] iArr = this.f2687s;
        int i10 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2688t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(((Integer) obj).intValue());
        return true;
    }
}
