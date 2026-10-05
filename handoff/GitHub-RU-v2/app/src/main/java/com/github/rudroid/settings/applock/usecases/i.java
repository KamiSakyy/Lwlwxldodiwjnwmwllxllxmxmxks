package com.github.rudroid.settings.applock.usecases;

import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.settings.applock.usecases.SetAutomaticLockDurationUseCase$execute$2", f = "SetAutomaticLockDurationUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class i extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i, a71.c cVar) {
        super(2, cVar);
        this.w = i;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        i iVar = new i(this.w, cVar);
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
        s5.e eVar = yf.a.a;
        bVar.f(yf.a.b, new Integer(this.w));
        return a0.a;
    }
}
