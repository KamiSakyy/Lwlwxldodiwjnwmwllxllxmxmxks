package com.github.rudroid.searchandfilter.complexfilter;

import com.github.rudroid.utilities.m2;
import java.util.ArrayList;
import l7.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e0<T> extends m0 {
    public final ArrayList d = new ArrayList();
    public final m2 e = new m2();

    public e0() {
        D(true);
    }

    public abstract String F(Object obj);

    public final int k() {
        return this.d.size();
    }

    public final long l(int i) {
        return this.e.a(F(this.d.get(i)));
    }
    public Object n() { return null; }
}
