package y61;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import k71.k;
import x61.h;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f extends h {
    public final /* synthetic */ int r;
    public e s;

    public /* synthetic */ f(e eVar, int i) {
        this.r = i;
        this.s = eVar;
    }

    @Override // x61.h
    public final int a() {
        switch (this.r) {
        }
        return this.s.z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.r) {
            case 0:
                k.g((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.r) {
            case 0:
                k.g(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                k.g(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.r) {
            case 0:
                this.s.clear();
                break;
            default:
                this.s.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.r) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.s.f((Map.Entry) obj);
            default:
                return this.s.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.r) {
            case 0:
                k.g(collection, "elements");
                return this.s.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.r) {
        }
        return this.s.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.r) {
            case 0:
                e eVar = this.s;
                eVar.getClass();
                return new c(eVar, 0);
            default:
                e eVar2 = this.s;
                eVar2.getClass();
                return new c(eVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.r) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    e eVar = this.s;
                    eVar.getClass();
                    eVar.c();
                    int h = eVar.h(entry.getKey());
                    if (h >= 0) {
                        Object[] objArr = eVar.s;
                        k.d(objArr);
                        if (k.b(objArr[h], entry.getValue())) {
                            eVar.l(h);
                            break;
                        }
                    }
                }
                break;
            default:
                e eVar2 = this.s;
                eVar2.c();
                int h2 = eVar2.h(obj);
                if (h2 >= 0) {
                    eVar2.l(h2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.r) {
            case 0:
                k.g(collection, "elements");
                this.s.c();
                break;
            default:
                k.g(collection, "elements");
                this.s.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.r) {
            case 0:
                k.g(collection, "elements");
                this.s.c();
                break;
            default:
                k.g(collection, "elements");
                this.s.c();
                break;
        }
        return super.retainAll(collection);
    }
}
