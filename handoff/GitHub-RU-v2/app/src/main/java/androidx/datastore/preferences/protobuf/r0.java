package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: /home/user/work/p/classes.dex */
public final class r0 extends b implements RandomAccess {

    /* renamed from: u, reason: collision with root package name */
    public static final r0 f2371u = new r0(new Object[0], 0, false);

    /* renamed from: s, reason: collision with root package name */
    public Object[] f2372s;

    /* renamed from: t, reason: collision with root package name */
    public int f2373t;

    public r0(Object[] objArr, int i, boolean z10) {
        this.f2259r = z10;
        this.f2372s = objArr;
        this.f2373t = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f2373t;
        Object[] objArr = this.f2372s;
        if (i == objArr.length) {
            this.f2372s = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f2372s;
        int i10 = this.f2373t;
        this.f2373t = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.f2373t) {
            StringBuilder o5 = x.i.o("Index:", i, ", Size:");
            o5.append(this.f2373t);
            throw new IndexOutOfBoundsException(o5.toString());
        }
    }

    public final r0 d(int i) {
        if (i >= this.f2373t) {
            return new r0(Arrays.copyOf(this.f2372s, i), this.f2373t, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.f2372s[i];
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        Object[] objArr = this.f2372s;
        Object obj = objArr[i];
        if (i < this.f2373t - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f2373t--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        b(i);
        Object[] objArr = this.f2372s;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2373t;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i10;
        a();
        if (i >= 0 && i <= (i10 = this.f2373t)) {
            Object[] objArr = this.f2372s;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i10 - i);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f2372s, i, objArr2, i + 1, this.f2373t - i);
                this.f2372s = objArr2;
            }
            this.f2372s[i] = obj;
            this.f2373t++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder o5 = x.i.o("Index:", i, ", Size:");
        o5.append(this.f2373t);
        throw new IndexOutOfBoundsException(o5.toString());
    }
}
