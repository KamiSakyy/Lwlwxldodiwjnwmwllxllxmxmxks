package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements Iterator {
    public final /* synthetic */ Iterator r;

    public i(Iterator it) {
        this.r = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.r.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new q((String) this.r.next());
    }
}
