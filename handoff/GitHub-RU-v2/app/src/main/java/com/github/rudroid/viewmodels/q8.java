package com.github.rudroid.viewmodels;

import java.util.ArrayList;

@c71.e(c = "com.github.rudroid.viewmodels.TriageLegacyProjectsViewModel$loadHead$1$5", f = "TriageLegacyProjectsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class q8 extends c71.j implements j71.e {
    public final /* synthetic */ m8 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(m8 m8Var, a71.c cVar) {
        super(2, cVar);
        this.v = m8Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new q8(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        q8 r = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        m8 m8Var = this.v;
        androidx.lifecycle.p0 p0Var = m8Var.z;
        fl.e eVar = fl.f.Companion;
        ArrayList Q = m8Var.Q(true);
        eVar.getClass();
        p0Var.j(fl.e.b(Q));
        return w61.a0.a;
    }
}
