package y61;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import k71.k;
import x61.h;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g extends h implements Serializable {
    public static final g s;
    public e r;

    static {
        e eVar = e.E;
        s = new g(e.E);
    }

    public g(e eVar) {
        k.g(eVar, "backing");
        this.r = eVar;
    }

    @Override // x61.h
    public final int a() {
        return this.r.z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.r.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        k.g(collection, "elements");
        this.r.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.r.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.r.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.r.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        e eVar = this.r;
        eVar.getClass();
        return new c(eVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        e eVar = this.r;
        eVar.c();
        int h = eVar.h(obj);
        if (h < 0) {
            return false;
        }
        eVar.l(h);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        k.g(collection, "elements");
        this.r.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        k.g(collection, "elements");
        this.r.c();
        return super.retainAll(collection);
    }

    public g() {
        this(new e());
    }
}
