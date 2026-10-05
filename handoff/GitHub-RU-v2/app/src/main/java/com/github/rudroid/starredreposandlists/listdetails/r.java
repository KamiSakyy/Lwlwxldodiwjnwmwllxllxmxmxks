package com.github.rudroid.starredreposandlists.listdetails;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class r implements j71.f {
    public final /* synthetic */ com.github.rudroid.interfaces.m0 r;
    public final /* synthetic */ com.github.rudroid.html.b s;

    public /* synthetic */ r(com.github.rudroid.interfaces.m0 m0Var, com.github.rudroid.html.b bVar) {
        this.r = m0Var;
        this.s = bVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        m0.f fVar = (m0.f) obj;
        List list = (List) obj2;
        k71.k.g(fVar, "$this$StateLazyList");
        k71.k.g(list, "data");
        fVar.r(list.size(), (j71.c) null, new u(list), new r1.d(new v(list, this.r, this.s), true, 802480018));
        return w61.a0.a;
    }
}
