package com.github.rudroid.settings.applock.usecases;

import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.settings.applock.usecases.SetLastActiveTimeMillisUseCase$execute$2", f = "SetLastActiveTimeMillisUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class l extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ Long w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Long l, a71.c cVar) {
        super(2, cVar);
        this.w = l;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        l lVar = new l(this.w, cVar);
        lVar.v = obj;
        return lVar;
    }

    public final Object s(Object obj, Object obj2) {
        l r = r((a71.c) obj2, (s5.b) obj);
        a0 a0Var = a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        s5.b bVar = (s5.b) this.v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        boolean b = k71.k.b(bVar.d(yf.a.a), Boolean.FALSE);
        a0 a0Var = a0.a;
        if (b) {
            return a0Var;
        }
        Long l = this.w;
        if (l == null) {
            bVar.e(yf.a.c);
            return a0Var;
        }
        bVar.f(yf.a.c, l);
        return a0Var;
    }
}
