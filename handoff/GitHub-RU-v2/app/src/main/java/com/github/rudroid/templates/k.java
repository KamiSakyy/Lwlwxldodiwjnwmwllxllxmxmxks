package com.github.rudroid.templates;

import com.github.rudroid.starredreposandlists.u0;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;
import com.github.rudroid.utilities.w0;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class k implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ l s;

    public /* synthetic */ k(l lVar, int i) {
        this.r = i;
        this.s = lVar;
    }

    public final Object k(Object obj) {
        switch (this.r) {
            case 0:
                g1 g1Var = (g1) obj;
                k71.k.g(g1Var, "stateEvent");
                return h1.h(g1Var, new u0(3, this.s));
            default:
                w0.m(this.s.u, (fl.b) obj);
                return a0.a;
        }
    }
}
