package y61;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k71.k;
import sy.a0;
import sy.pShadow;
import v1.v;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b extends x61.g implements RandomAccess, Serializable {
    public static final b u;
    public Object[] r;
    public int s;
    public boolean t;

    static {
        b bVar = new b(0);
        bVar.t = true;
        u = bVar;
    }

    public b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.r = new Object[i];
    }

    @Override // x61.g
    public final int a() {
        return this.s;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i = this.s;
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.r[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        k.g(collection, "elements");
        g();
        int size = collection.size();
        e(this.s, collection, size);
        return size > 0;
    }

    @Override // x61.g
    public final Object b(int i) {
        g();
        int i2 = this.s;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
        }
        return j(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        k(0, this.s);
    }

    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        i(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.r[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.r;
            int i = this.s;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (k.b(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.r[i] = obj;
    }

    public final void g() {
        if (this.t) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.s;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
        }
        return this.r[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.r;
        int i = this.s;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final void i(int i, int i2) {
        int i3 = this.s + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.r;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i4);
            k.f(copyOf, "copyOf(...)");
            this.r = copyOf;
        }
        Object[] objArr2 = this.r;
        l.x(i + i2, i, this.s, objArr2, objArr2);
        this.s += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.s; i++) {
            if (k.b(this.r[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.s == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.r;
        Object obj = objArr[i];
        l.x(i, i + 1, this.s, objArr, objArr);
        Object[] objArr2 = this.r;
        int i2 = this.s - 1;
        k.g(objArr2, "<this>");
        objArr2[i2] = null;
        this.s--;
        return obj;
    }

    public final void k(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.r;
        l.x(i, i + i2, this.s, objArr, objArr);
        Object[] objArr2 = this.r;
        int i3 = this.s;
        pShadow.q(objArr2, i3 - i2, i3);
        this.s -= i2;
    }

    public final int l(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.r[i5]) == z) {
                Object[] objArr = this.r;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.r;
        l.x(i + i4, i2 + i, this.s, objArr2, objArr2);
        Object[] objArr3 = this.r;
        int i7 = this.s;
        pShadow.q(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.s -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.s - 1; i >= 0; i--) {
            if (k.b(this.r[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        k.g(collection, "elements");
        g();
        return l(0, this.s, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        k.g(collection, "elements");
        g();
        return l(0, this.s, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        int i2 = this.s;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.r;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        a0.g(i, i2, this.s);
        return new a(this.r, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        k.g(objArr, "array");
        int length = objArr.length;
        int i = this.s;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.r, 0, i, objArr.getClass());
            k.f(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        l.x(0, 0, i, this.r, objArr);
        int i2 = this.s;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return pShadow.a(this.r, 0, this.s, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.s;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
        }
        return new v(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        k.g(collection, "elements");
        g();
        int i2 = this.s;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            e(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        int i2 = this.s;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            i(i, 1);
            this.r[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return l.D(this.r, 0, this.s);
    }
    public Object f = null;
}
