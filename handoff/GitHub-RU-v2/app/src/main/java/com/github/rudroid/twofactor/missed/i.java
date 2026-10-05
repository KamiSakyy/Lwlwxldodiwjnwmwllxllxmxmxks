package com.github.rudroid.twofactor.missed;

import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.twofactor.missed.SetTwoFactorRequestUseCase$execute$2", f = "SetTwoFactorRequestUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class i extends c71.j implements j71.e {
    public /* synthetic */ Object v;

    public final a71.c r(a71.c cVar, Object obj) {
        i iVar = new i(2, cVar);
        iVar.v = obj;
        return iVar;
    }

    public final Object s(Object obj, Object obj2) {
        i r = r((a71.c) obj2, (s5.b) obj);
        a0 a0Var = a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        s5.b bVar = (s5.b) this.v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        s5.e eVar = l.a;
        bVar.f(l.a, new Long(System.currentTimeMillis()));
        bVar.f(l.b, Boolean.FALSE);
        return a0.a;
    }
}
