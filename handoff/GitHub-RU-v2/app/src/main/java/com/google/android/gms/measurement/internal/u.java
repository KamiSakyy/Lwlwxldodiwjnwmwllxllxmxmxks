package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u implements Iterator {
    public final Iterator r;

    public u(v vVar) {
        this.r = vVar.r.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.r.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.r.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e {
        public e() {
        }
    }
    public Object a(Object p1) { return null; }
    public Object b(Object p1, Object p2, Object p3, Object p4) { return null; }
    public Object c(Object p1) { return null; }
}
