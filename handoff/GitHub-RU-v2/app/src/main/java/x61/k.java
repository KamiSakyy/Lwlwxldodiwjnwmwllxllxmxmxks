package x61;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k extends g {
    public static final Object[] u = new Object[0];
    public int r;
    public Object[] s;
    public int t;

    public k() {
        this.s = u;
    }

    @Override // x61.g
    public final int a() {
        return this.t;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.t;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException(no.a.j(i, i3, "index: ", ", size: "));
        }
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m();
        e(this.t + 1);
        int l = l(this.r + i);
        int i4 = this.t;
        if (i < ((i4 + 1) >> 1)) {
            if (l == 0) {
                Object[] objArr = this.s;
                k71.k.g(objArr, "<this>");
                l = objArr.length;
            }
            int i5 = l - 1;
            int i6 = this.r;
            if (i6 == 0) {
                Object[] objArr2 = this.s;
                k71.k.g(objArr2, "<this>");
                i2 = objArr2.length - 1;
            } else {
                i2 = i6 - 1;
            }
            int i7 = this.r;
            if (i5 >= i7) {
                Object[] objArr3 = this.s;
                objArr3[i2] = objArr3[i7];
                l.x(i7, i7 + 1, i5 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.s;
                l.x(i7 - 1, i7, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.s;
                objArr5[objArr5.length - 1] = objArr5[0];
                l.x(0, 1, i5 + 1, objArr5, objArr5);
            }
            this.s[i5] = obj;
            this.r = i2;
        } else {
            int l2 = l(i4 + this.r);
            if (l < l2) {
                Object[] objArr6 = this.s;
                l.x(l + 1, l, l2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.s;
                l.x(1, 0, l2, objArr7, objArr7);
                Object[] objArr8 = this.s;
                objArr8[0] = objArr8[objArr8.length - 1];
                l.x(l + 1, l, objArr8.length - 1, objArr8, objArr8);
            }
            this.s[l] = obj;
        }
        this.t++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        k71.k.g(collection, "elements");
        int i2 = this.t;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.t) {
            return addAll(collection);
        }
        m();
        e(collection.size() + this.t);
        int l = l(this.t + this.r);
        int l2 = l(this.r + i);
        int size = collection.size();
        if (i >= ((this.t + 1) >> 1)) {
            int i3 = l2 + size;
            if (l2 < l) {
                int i4 = size + l;
                Object[] objArr = this.s;
                if (i4 <= objArr.length) {
                    l.x(i3, l2, l, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    l.x(i3 - objArr.length, l2, l, objArr, objArr);
                } else {
                    int length = l - (i4 - objArr.length);
                    l.x(0, length, l, objArr, objArr);
                    Object[] objArr2 = this.s;
                    l.x(i3, l2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.s;
                l.x(size, 0, l, objArr3, objArr3);
                Object[] objArr4 = this.s;
                if (i3 >= objArr4.length) {
                    l.x(i3 - objArr4.length, l2, objArr4.length, objArr4, objArr4);
                } else {
                    l.x(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.s;
                    l.x(i3, l2, objArr5.length - size, objArr5, objArr5);
                }
            }
            d(l2, collection);
            return true;
        }
        int i5 = this.r;
        int i6 = i5 - size;
        if (l2 < i5) {
            Object[] objArr6 = this.s;
            l.x(i6, i5, objArr6.length, objArr6, objArr6);
            if (size >= l2) {
                Object[] objArr7 = this.s;
                l.x(objArr7.length - size, 0, l2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.s;
                l.x(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.s;
                l.x(0, size, l2, objArr9, objArr9);
            }
        } else if (i6 >= 0) {
            Object[] objArr10 = this.s;
            l.x(i6, i5, l2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.s;
            i6 += objArr11.length;
            int i7 = l2 - i5;
            int length2 = objArr11.length - i6;
            if (length2 >= i7) {
                l.x(i6, i5, l2, objArr11, objArr11);
            } else {
                l.x(i6, i5, i5 + length2, objArr11, objArr11);
                Object[] objArr12 = this.s;
                l.x(0, this.r + length2, l2, objArr12, objArr12);
            }
        }
        this.r = i6;
        d(j(l2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m();
        e(this.t + 1);
        int i = this.r;
        if (i == 0) {
            Object[] objArr = this.s;
            k71.k.g(objArr, "<this>");
            i = objArr.length;
        }
        int i2 = i - 1;
        this.r = i2;
        this.s[i2] = obj;
        this.t++;
    }

    public final void addLast(Object obj) {
        m();
        e(a() + 1);
        this.s[l(a() + this.r)] = obj;
        this.t = a() + 1;
    }

    @Override // x61.g
    public final Object b(int i) {
        int i2 = this.t;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
        }
        if (i == d0.m(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m();
        int l = l(this.r + i);
        Object[] objArr = this.s;
        Object obj = objArr[l];
        if (i < (this.t >> 1)) {
            int i3 = this.r;
            if (l >= i3) {
                l.x(i3 + 1, i3, l, objArr, objArr);
            } else {
                l.x(1, 0, l, objArr, objArr);
                Object[] objArr2 = this.s;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.r;
                l.x(i4 + 1, i4, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.s;
            int i5 = this.r;
            objArr3[i5] = null;
            this.r = g(i5);
        } else {
            int l2 = l(d0.m(this) + this.r);
            if (l <= l2) {
                Object[] objArr4 = this.s;
                l.x(l, l + 1, l2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.s;
                l.x(l, l + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.s;
                objArr6[objArr6.length - 1] = objArr6[0];
                l.x(0, 1, l2 + 1, objArr6, objArr6);
            }
            this.s[l2] = null;
        }
        this.t--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m();
            k(this.r, l(a() + this.r));
        }
        this.r = 0;
        this.t = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.s.length;
        while (i < length && it.hasNext()) {
            this.s[i] = it.next();
            i++;
        }
        int i2 = this.r;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.s[i3] = it.next();
        }
        this.t = collection.size() + this.t;
    }

    public final void e(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.s;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == u) {
            if (i < 10) {
                i = 10;
            }
            this.s = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        l.x(0, this.r, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.s;
        int length2 = objArr3.length;
        int i3 = this.r;
        l.x(length2 - i3, 0, i3, objArr3, objArr2);
        this.r = 0;
        this.s = objArr2;
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.s[this.r];
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.s[this.r];
    }

    public final int g(int i) {
        k71.k.g(this.s, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int a = a();
        if (i < 0 || i >= a) {
            throw new IndexOutOfBoundsException(no.a.j(i, a, "index: ", ", size: "));
        }
        return this.s[l(this.r + i)];
    }

    public final Object i() {
        if (isEmpty()) {
            return null;
        }
        return this.s[l(d0.m(this) + this.r)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int l = l(a() + this.r);
        int i2 = this.r;
        if (i2 < l) {
            while (i2 < l) {
                if (k71.k.b(obj, this.s[i2])) {
                    i = this.r;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < l) {
            return -1;
        }
        int length = this.s.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < l; i3++) {
                    if (k71.k.b(obj, this.s[i3])) {
                        i2 = i3 + this.s.length;
                        i = this.r;
                    }
                }
                return -1;
            }
            if (k71.k.b(obj, this.s[i2])) {
                i = this.r;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final int j(int i) {
        return i < 0 ? i + this.s.length : i;
    }

    public final void k(int i, int i2) {
        if (i < i2) {
            l.G(i, i2, null, this.s);
            return;
        }
        Object[] objArr = this.s;
        l.G(i, objArr.length, null, objArr);
        l.G(0, i2, null, this.s);
    }

    public final int l(int i) {
        Object[] objArr = this.s;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.s[l(d0.m(this) + this.r)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int l = l(this.t + this.r);
        int i2 = this.r;
        if (i2 < l) {
            length = l - 1;
            if (i2 <= length) {
                while (!k71.k.b(obj, this.s[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.r;
                return length - i;
            }
            return -1;
        }
        if (i2 > l) {
            int i3 = l - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.s;
                    k71.k.g(objArr, "<this>");
                    length = objArr.length - 1;
                    int i4 = this.r;
                    if (i4 <= length) {
                        while (!k71.k.b(obj, this.s[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.r;
                    }
                } else {
                    if (k71.k.b(obj, this.s[i3])) {
                        length = i3 + this.s.length;
                        i = this.r;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    public final void m() {
        ((AbstractList) this).modCount++;
    }

    public final Object n() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int l;
        k71.k.g(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.s.length != 0) {
            int l2 = l(a() + this.r);
            int i = this.r;
            if (i < l2) {
                l = i;
                while (i < l2) {
                    Object obj = this.s[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.s[l] = obj;
                        l++;
                    }
                    i++;
                }
                l.G(l, l2, null, this.s);
            } else {
                int length = this.s.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.s;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.s[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                l = l(i2);
                for (int i3 = 0; i3 < l2; i3++) {
                    Object[] objArr2 = this.s;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.s[l] = obj3;
                        l = g(l);
                    }
                }
                z = z2;
            }
            if (z) {
                m();
                this.t = j(l - this.r);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m();
        Object[] objArr = this.s;
        int i = this.r;
        Object obj = objArr[i];
        objArr[i] = null;
        this.r = g(i);
        this.t = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m();
        int l = l(d0.m(this) + this.r);
        Object[] objArr = this.s;
        Object obj = objArr[l];
        objArr[l] = null;
        this.t = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        sy.a0.g(i, i2, this.t);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.t) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        m();
        if (i < this.t - i2) {
            int l = l(this.r + (i - 1));
            int l2 = l(this.r + (i2 - 1));
            while (i > 0) {
                int i4 = l + 1;
                int min = Math.min(i, Math.min(i4, l2 + 1));
                Object[] objArr = this.s;
                int i5 = l2 - min;
                int i6 = l - min;
                l.x(i5 + 1, i6 + 1, i4, objArr, objArr);
                l = j(i6);
                l2 = j(i5);
                i -= min;
            }
            int l3 = l(this.r + i3);
            k(this.r, l3);
            this.r = l3;
        } else {
            int l4 = l(this.r + i2);
            int l5 = l(this.r + i);
            int i7 = this.t;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.s;
                i2 = Math.min(i7, Math.min(objArr2.length - l4, objArr2.length - l5));
                Object[] objArr3 = this.s;
                int i8 = l4 + i2;
                l.x(l5, l4, i8, objArr3, objArr3);
                l4 = l(i8);
                l5 = l(l5 + i2);
            }
            int l6 = l(this.t + this.r);
            k(j(l6 - i3), l6);
        }
        this.t -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int l;
        k71.k.g(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.s.length != 0) {
            int l2 = l(a() + this.r);
            int i = this.r;
            if (i < l2) {
                l = i;
                while (i < l2) {
                    Object obj = this.s[i];
                    if (collection.contains(obj)) {
                        this.s[l] = obj;
                        l++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                l.G(l, l2, null, this.s);
            } else {
                int length = this.s.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.s;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.s[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                l = l(i2);
                for (int i3 = 0; i3 < l2; i3++) {
                    Object[] objArr2 = this.s;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.s[l] = obj3;
                        l = g(l);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m();
                this.t = j(l - this.r);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int a = a();
        if (i < 0 || i >= a) {
            throw new IndexOutOfBoundsException(no.a.j(i, a, "index: ", ", size: "));
        }
        int l = l(this.r + i);
        Object[] objArr = this.s;
        Object obj2 = objArr[l];
        objArr[l] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    public k(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = u;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(no.a.k("Illegal Capacity: ", i));
        }
        this.s = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        k71.k.g(objArr, "array");
        int length = objArr.length;
        int i = this.t;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            k71.k.e(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int l = l(this.t + this.r);
        int i2 = this.r;
        if (i2 < l) {
            l.B(i2, l, 2, this.s, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.s;
            l.x(0, this.r, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.s;
            l.x(objArr3.length - this.r, 0, l, objArr3, objArr);
        }
        int i3 = this.t;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public k(Collection collection) {
        Object[] array = collection.toArray(new Object[0]);
        this.s = array;
        this.t = array.length;
        if (array.length == 0) {
            this.s = u;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        k71.k.g(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m();
        e(collection.size() + a());
        d(l(a() + this.r), collection);
        return true;
    }
}
