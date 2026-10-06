package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p extends b0 implements ListIterator {
    public final int s;
    public int t;
    public final r u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, int i) {
        super(0);
        int size = rVar.size();
        y41.t1.V(i, size);
        this.s = size;
        this.t = i;
        this.u = rVar;
    }

    public final Object a(int i) {
        return this.u.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.t < this.s;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.t > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.t;
        this.t = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.t;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.t - 1;
        this.t = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.t - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
