package androidx.glance.appwidget.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: /home/user/work/p/classes.dex */
public final class x0 extends b implements RandomAccess {

    /* renamed from: u, reason: collision with root package name */
    public static final x0 f2806u = new x0(new Object[0], 0, false);

    /* renamed from: s, reason: collision with root package name */
    public Object[] f2807s;

    /* renamed from: t, reason: collision with root package name */
    public int f2808t;

    public x0(Object[] objArr, int i, boolean z10) {
        super(z10);
        this.f2807s = objArr;
        this.f2808t = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f2808t;
        Object[] objArr = this.f2807s;
        if (i == objArr.length) {
            this.f2807s = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f2807s;
        int i10 = this.f2808t;
        this.f2808t = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.f2808t) {
            StringBuilder o5 = x.i.o("Index:", i, ", Size:");
            o5.append(this.f2808t);
            throw new IndexOutOfBoundsException(o5.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.f2807s[i];
    }

    @Override // androidx.glance.appwidget.protobuf.d0
    public final d0 r(int i) {
        if (i >= this.f2808t) {
            return new x0(Arrays.copyOf(this.f2807s, i), this.f2808t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.glance.appwidget.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        Object[] objArr = this.f2807s;
        Object obj = objArr[i];
        if (i < this.f2808t - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f2808t--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        b(i);
        Object[] objArr = this.f2807s;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2808t;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        a();
        if (i >= 0 && i <= (i10 = this.f2808t)) {
            Object[] objArr = this.f2807s;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i10 - i);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f2807s, i, objArr2, i + 1, this.f2808t - i);
                this.f2807s = objArr2;
            }
            this.f2807s[i] = obj;
            this.f2808t++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder o5 = x.i.o("Index:", i, ", Size:");
        o5.append(this.f2808t);
        throw new IndexOutOfBoundsException(o5.toString());
    }
}
