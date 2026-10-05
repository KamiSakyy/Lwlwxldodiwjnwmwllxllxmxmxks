package com.github.rudroid.settings.applock.usecases;

import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.settings.applock.usecases.SetAppUnlockRequiredUseCase$execute$2", f = "SetAppUnlockRequiredUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z, a71.c cVar) {
        super(2, cVar);
        this.w = z;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        f fVar = new f(this.w, cVar);
        fVar.v = obj;
        return fVar;
    }

    public final Object s(Object obj, Object obj2) {
        f r = r((a71.c) obj2, (s5.b) obj);
        a0 a0Var = a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        s5.b bVar = (s5.b) this.v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        bVar.f(yf.a.d, Boolean.valueOf(this.w));
        return a0.a;
    }
}
