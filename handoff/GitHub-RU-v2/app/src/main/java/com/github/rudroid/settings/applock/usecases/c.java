package com.github.rudroid.settings.applock.usecases;

import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.settings.applock.usecases.SetAppLockEnabledUseCase$execute$2", f = "SetAppLockEnabledUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class c extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z, a71.c cVar) {
        super(2, cVar);
        this.w = z;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        c cVar2 = new c(this.w, cVar);
        cVar2.v = obj;
        return cVar2;
    }

    public final Object s(Object obj, Object obj2) {
        c r = r((a71.c) obj2, (s5.b) obj);
        a0 a0Var = a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        s5.b bVar = (s5.b) this.v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        s5.e eVar = yf.a.a;
        bVar.f(yf.a.a, Boolean.valueOf(this.w));
        return a0.a;
    }
}
