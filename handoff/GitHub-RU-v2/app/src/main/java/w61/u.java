package w61;

import a5.g1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u implements Collection, l71.a {
    public int[] r;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
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
        if (!(obj instanceof t)) {
            return false;
        }
        return x61.l.s(this.r, ((t) obj).r);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        k71.k.g(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof t)) {
                return false;
            }
            if (!x61.l.s(this.r, ((t) obj).r)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return k71.k.b(this.r, ((u) obj).r);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.r);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.r.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g1(4, this.r);
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
    public final Object[] toArray() {
        return k71.j.a(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.r) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        k71.k.g(objArr, "array");
        return k71.j.b(this, objArr);
    }
}
