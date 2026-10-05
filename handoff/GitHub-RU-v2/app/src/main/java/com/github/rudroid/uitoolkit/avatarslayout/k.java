package com.github.rudroid.uitoolkit.avatarslayout;

import d3.c0;
import d3.z;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class k implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ h s;

    public /* synthetic */ k(h hVar, int i) {
        this.r = i;
        this.s = hVar;
    }

    public final Object k(Object obj) {
        switch (this.r) {
            case 0:
                w1.r rVar = (w1.r) obj;
                k71.k.g(rVar, "$this$applyIf");
                return d3.q.b(rVar, false, new k(this.s, 2));
            case 1:
                w1.r rVar2 = (w1.r) obj;
                k71.k.g(rVar2, "$this$applyIf");
                return f0.o.m(rVar2, false, (String) null, (d3.k) null, new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(this.s), 15);
            default:
                c0 c0Var = (c0) obj;
                k71.k.g(c0Var, "$this$semantics");
                String str = this.s.c;
                if (str == null) {
                    str = "";
                }
                z.g(c0Var, str);
                return a0.a;
        }
    }
}
