package x;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements Iterator, Map.Entry {

    /* renamed from: r, reason: collision with root package name */
    public int f33529r;

    /* renamed from: s, reason: collision with root package name */
    public int f33530s = -1;

    /* renamed from: t, reason: collision with root package name */
    public boolean f33531t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f33532u;

    public c(e eVar) {
        this.f33532u = eVar;
        this.f33529r = eVar.f33610t - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f33531t) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f33530s;
        e eVar = this.f33532u;
        return k71.k.b(key, eVar.f(i)) && k71.k.b(entry.getValue(), eVar.i(this.f33530s));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f33531t) {
            return this.f33532u.f(this.f33530s);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f33531t) {
            return this.f33532u.i(this.f33530s);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33530s < this.f33529r;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f33531t) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f33530s;
        e eVar = this.f33532u;
        Object f6 = eVar.f(i);
        Object i10 = eVar.i(this.f33530s);
        return (f6 == null ? 0 : f6.hashCode()) ^ (i10 != null ? i10.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f33530s++;
        this.f33531t = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f33531t) {
            throw new IllegalStateException();
        }
        this.f33532u.g(this.f33530s);
        this.f33530s--;
        this.f33529r--;
        this.f33531t = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f33531t) {
            return this.f33532u.h(this.f33530s, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
