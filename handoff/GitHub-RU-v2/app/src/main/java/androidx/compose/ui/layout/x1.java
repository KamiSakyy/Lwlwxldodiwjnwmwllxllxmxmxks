package androidx.compose.ui.layout;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* loaded from: /home/user/work/p/classes.dex */
public final class x1 implements Collection, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2085r = 0;

    /* renamed from: s, reason: collision with root package name */
    public Object f2086s;

    public x1() {
        int i = x.n0.f33601a;
        this.f2086s = new x.e0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f2085r) {
            case k5.f.J:
                return ((x.e0) this.f2086s).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f2085r) {
            case k5.f.J:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f2085r) {
            case k5.f.J:
                ((x.e0) this.f2086s).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f2085r) {
            case k5.f.J:
                return ((x.e0) this.f2086s).c(obj);
            default:
                return ((x.h0) this.f2086s).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f2085r) {
            case k5.f.J:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((x.e0) this.f2086s).c(it.next())) {
                        break;
                    }
                }
                break;
            default:
                k71.k.g(collection, "elements");
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((x.h0) this.f2086s).d(it2.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f2085r) {
            case k5.f.J:
                return ((x.e0) this.f2086s).f33552g == 0;
            default:
                return ((x.h0) this.f2086s).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2085r) {
            case k5.f.J:
                x.e0 e0Var = (x.e0) this.f2086s;
                e0Var.getClass();
                return new p1.c(new x.g0(e0Var));
            default:
                return i21.a.z(new l1.g(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f2085r) {
            case k5.f.J:
                return ((x.e0) this.f2086s).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f2085r) {
            case k5.f.J:
                return ((x.e0) this.f2086s).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f2085r) {
            case k5.f.J:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f2085r) {
            case k5.f.J:
                return ((x.e0) this.f2086s).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f2085r) {
            case k5.f.J:
                return ((x.e0) this.f2086s).f33552g;
            default:
                return ((x.h0) this.f2086s).f33573e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f2085r) {
        }
        return k71.j.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f2085r) {
            case k5.f.J:
                break;
            default:
                k71.k.g(objArr, "array");
                break;
        }
        return k71.j.b(this, objArr);
    }

    public x1(x.h0 h0Var) {
        k71.k.g(h0Var, "parent");
        this.f2086s = h0Var;
    }
}
