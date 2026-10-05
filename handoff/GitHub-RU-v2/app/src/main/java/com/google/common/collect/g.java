package com.google.common.collect;

import com.google.android.gms.internal.play_billing.b0;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g extends b0 {
    public boolean s;
    public final /* synthetic */ Object t;

    public g(Object obj) {
        super(1);
        this.t = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.s;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.s) {
            throw new NoSuchElementException();
        }
        this.s = true;
        return this.t;
    }
}
