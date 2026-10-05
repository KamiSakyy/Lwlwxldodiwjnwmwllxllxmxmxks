package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.TriageLegacyProjectsViewModel$observeChannel$2", f = "TriageLegacyProjectsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class x8 extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ m8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(m8 m8Var, a71.c cVar) {
        super(2, cVar);
        this.w = m8Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        x8 x8Var = new x8(this.w, cVar);
        x8Var.v = obj;
        return x8Var;
    }

    public final Object s(Object obj, Object obj2) {
        x8 r = r((a71.c) obj2, (String) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        String str = (String) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        if (!t71.p.T(str)) {
            m8 m8Var = this.w;
            m8Var.I = str;
            m8Var.P();
        }
        return w61.a0.a;
    }
}
