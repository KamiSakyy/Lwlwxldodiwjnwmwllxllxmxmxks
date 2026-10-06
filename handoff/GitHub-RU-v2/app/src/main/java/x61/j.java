package x61;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements Collection, l71.a {
    public Object[] r;
    public boolean s;

    public j(Object[] objArr, boolean z) {
        k71.k.g(objArr, "values");
        this.r = objArr;
        this.s = z;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return l.t(this.r, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        k71.k.g(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!l.t(this.r, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.r.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return k71.k.k(this.r);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.r.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        k71.k.g(objArr, "array");
        return k71.j.b(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.r;
        k71.k.g(objArr, "<this>");
        if (this.s && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        k71.k.f(copyOf, "copyOf(...)");
        return copyOf;
    }
}
