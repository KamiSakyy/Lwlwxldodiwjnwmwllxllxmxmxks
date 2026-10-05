package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.SubIssuesViewModel$onExpandSubIssues$2$2", f = "SubIssuesViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class d8 extends c71.j implements j71.e {
    public final /* synthetic */ g8 v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(g8 g8Var, String str, a71.c cVar) {
        super(2, cVar);
        this.v = g8Var;
        this.w = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new d8(this.v, this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        d8 r = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        Object value;
        y7 y7Var;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        y71.y1 y1Var = this.v.x;
        do {
            value = y1Var.getValue();
            y7Var = (y7) value;
        } while (!y1Var.i(value, y7.a(y7Var, null, false, null, sy.f0.n(y7Var.d, this.w), 7)));
        return w61.a0.a;
    }
}
