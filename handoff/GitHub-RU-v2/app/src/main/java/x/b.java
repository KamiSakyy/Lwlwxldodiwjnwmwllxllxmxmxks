package x;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public class b implements Set {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f33523r;

    public b(e eVar) {
        this.f33523r = eVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f33523r.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f33523r.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f33523r.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        e eVar = this.f33523r;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (eVar.f33610t == set.size()) {
                return eVar.j(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        e eVar = this.f33523r;
        int i = 0;
        for (int i10 = eVar.f33610t - 1; i10 >= 0; i10--) {
            Object f6 = eVar.f(i10);
            i += f6 == null ? 0 : f6.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f33523r.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a(this.f33523r, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f33523r;
        int d10 = eVar.d(obj);
        if (d10 < 0) {
            return false;
        }
        eVar.g(d10);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f33523r.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f33523r;
        int i = eVar.f33610t;
        for (int i10 = i - 1; i10 >= 0; i10--) {
            if (!collection.contains(eVar.f(i10))) {
                eVar.g(i10);
            }
        }
        return i != eVar.f33610t;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f33523r.f33610t;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f33523r;
        int i = eVar.f33610t;
        Object[] objArr = new Object[i];
        for (int i10 = 0; i10 < i; i10++) {
            objArr[i10] = eVar.f(i10);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f33523r;
        int i = eVar.f33610t;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i10 = 0; i10 < i; i10++) {
            objArr[i10] = eVar.f(i10);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
