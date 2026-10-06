package y61;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k71.k;
import sy.a0;
import sy.p;
import v1.v;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends x61.g implements RandomAccess, Serializable {
    public Object[] r;
    public int s;
    public int t;
    public a u;
    public b v;

    public a(Object[] objArr, int i, int i2, a aVar, b bVar) {
        int i3;
        k.g(objArr, "backing");
        k.g(bVar, "root");
        this.r = objArr;
        this.s = i;
        this.t = i2;
        this.u = aVar;
        this.v = bVar;
        i3 = ((AbstractList) bVar).modCount;
        ((AbstractList) this).modCount = i3;
    }

    @Override // x61.g
    public final int a() {
        g();
        return this.t;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        g();
        f(this.s + this.t, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        k.g(collection, "elements");
        i();
        g();
        int size = collection.size();
        e(this.s + this.t, collection, size);
        return size > 0;
    }

    @Override // x61.g
    public final Object b(int i) {
        i();
        g();
        int i2 = this.t;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
        }
        return j(this.s + i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        g();
        k(this.s, this.t);
    }

    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        b bVar = this.v;
        a aVar = this.u;
        if (aVar != null) {
            aVar.e(i, collection, i2);
        } else {
            b bVar2 = b.u;
            bVar.e(i, collection, i2);
        }
        this.r = bVar.r;
        this.t += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.r;
            int i = this.t;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (k.b(objArr[this.s + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.v;
        a aVar = this.u;
        if (aVar != null) {
            aVar.f(i, obj);
        } else {
            b bVar2 = b.u;
            bVar.f(i, obj);
        }
        this.r = bVar.r;
        this.t++;
    }

    public final void g() {
        int i;
        i = ((AbstractList) this.v).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g();
        int i2 = this.t;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
        }
        return this.r[this.s + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.r;
        int i = this.t;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[this.s + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    public final void i() {
        if (this.v.t) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i = 0; i < this.t; i++) {
            if (k.b(this.r[this.s + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.t == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i) {
        Object j;
        ((AbstractList) this).modCount++;
        a aVar = this.u;
        if (aVar != null) {
            j = aVar.j(i);
        } else {
            b bVar = b.u;
            j = this.v.j(i);
        }
        this.t--;
        return j;
    }

    public final void k(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        a aVar = this.u;
        if (aVar != null) {
            aVar.k(i, i2);
        } else {
            b bVar = b.u;
            this.v.k(i, i2);
        }
        this.t -= i2;
    }

    public final int l(int i, int i2, Collection collection, boolean z) {
        int l;
        a aVar = this.u;
        if (aVar != null) {
            l = aVar.l(i, i2, collection, z);
        } else {
            b bVar = b.u;
            l = this.v.l(i, i2, collection, z);
        }
        if (l > 0) {
            ((AbstractList) this).modCount++;
        }
        this.t -= l;
        return l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i = this.t - 1; i >= 0; i--) {
            if (k.b(this.r[this.s + i], obj)) {
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
        i();
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
        i();
        g();
        return l(this.s, this.t, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        k.g(collection, "elements");
        i();
        g();
        return l(this.s, this.t, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        i();
        g();
        int i2 = this.t;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.r;
        int i3 = this.s;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        a0.g(i, i2, this.t);
        return new a(this.r, this.s + i, i2 - i, this, this.v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        k.g(objArr, "array");
        g();
        int length = objArr.length;
        int i = this.t;
        int i2 = this.s;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.r, i2, i + i2, objArr.getClass());
            k.f(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        l.x(0, i2, i + i2, this.r, objArr);
        int i3 = this.t;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return p.a(this.r, this.s, this.t, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g();
        int i2 = this.t;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
        }
        return new v(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        i();
        g();
        int i2 = this.t;
        if (i >= 0 && i <= i2) {
            f(this.s + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        k.g(collection, "elements");
        i();
        g();
        int i2 = this.t;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            e(this.s + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.r;
        int i = this.t;
        int i2 = this.s;
        return l.D(objArr, i2, i + i2);
    }
}
