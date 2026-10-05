package com.github.rudroid.support;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h0;
import y71.y1;

@c71.e(c = "com.github.rudroid.support.SupportViewModel$isEligible$1", f = "SupportViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class t extends c71.j implements j71.e {
    public final /* synthetic */ s v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, a71.c cVar) {
        super(2, cVar);
        this.v = sVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new t(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        t r = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        s sVar = this.v;
        y1 y1Var = sVar.u;
        oa.j d = sVar.s.d();
        if (d.f.d(d, oa.j.p[2]).contains(com.github.rudroid.common.a.u)) {
            g1.a aVar2 = g1.Companion;
            h hVar = (h) ((g1) y1Var.getValue()).getData();
            h a = hVar != null ? h.a(hVar, null, true, false, null, null, 29) : null;
            aVar2.getClass();
            h0 h0Var = new h0(a);
            y1Var.getClass();
            y1Var.k((Object) null, h0Var);
        } else {
            g1.a aVar3 = g1.Companion;
            h hVar2 = (h) ((g1) y1Var.getValue()).getData();
            h a2 = hVar2 != null ? h.a(hVar2, null, false, false, null, null, 29) : null;
            aVar3.getClass();
            h0 h0Var2 = new h0(a2);
            y1Var.getClass();
            y1Var.k((Object) null, h0Var2);
        }
        return w61.a0.a;
    }
}
