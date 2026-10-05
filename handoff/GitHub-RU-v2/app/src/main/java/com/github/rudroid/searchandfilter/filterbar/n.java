package com.github.rudroid.searchandfilter.filterbar;

import com.github.rudroid.searchandfilter.complexfilter.explore.a0;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements j71.c {
    public final /* synthetic */ a0 r;
    public final /* synthetic */ List s;

    public n(a0 a0Var, List list) {
        this.r = a0Var;
        this.s = list;
    }

    public final Object k(Object obj) {
        return this.r.k(this.s.get(((Number) obj).intValue()));
    }
}
