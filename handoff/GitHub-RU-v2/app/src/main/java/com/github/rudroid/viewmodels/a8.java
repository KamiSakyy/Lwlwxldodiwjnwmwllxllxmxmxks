package com.github.rudroid.viewmodels;

import com.github.rudroid.utilities.ui.g1;

@c71.e(c = "com.github.rudroid.viewmodels.SubIssuesViewModel$observe$1$2", f = "SubIssuesViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class a8 extends c71.j implements j71.e {
    public final /* synthetic */ g8 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(g8 g8Var, a71.c cVar) {
        super(2, cVar);
        this.v = g8Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new a8(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        a8 r = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        Object value;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        y71.y1 y1Var = this.v.x;
        do {
            value = y1Var.getValue();
        } while (!y1Var.i(value, y7.a((y7) value, g1.a.c(com.github.rudroid.utilities.ui.g1.Companion), false, null, null, 14)));
        return w61.a0.a;
    }
}
