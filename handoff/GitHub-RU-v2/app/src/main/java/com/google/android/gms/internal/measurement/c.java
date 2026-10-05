package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements Iterator {
    public final /* synthetic */ Iterator r;
    public final /* synthetic */ Iterator s;

    public c(d dVar, Iterator it, Iterator it2) {
        this.r = it;
        this.s = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.r.hasNext()) {
            return true;
        }
        return this.s.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.r;
        if (it.hasNext()) {
            return new q(((Integer) it.next()).toString());
        }
        Iterator it2 = this.s;
        if (it2.hasNext()) {
            return new q((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
