package com.github.rudroid.copilot.preferences;

import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.copilot.preferences.SetIsCopilotEnabledByUserUseCase$execute$2", f = "SetIsCopilotEnabledByUserUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class m extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f9967v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f9968w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z10, a71.c cVar) {
        super(2, cVar);
        this.f9968w = z10;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        m mVar = new m(this.f9968w, cVar);
        mVar.f9967v = obj;
        return mVar;
    }

    public final Object s(Object obj, Object obj2) {
        m r10 = r((a71.c) obj2, (s5.b) obj);
        a0 a0Var = a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        s5.b bVar = (s5.b) this.f9967v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        s5.e eVar = e.f9961a;
        bVar.f(e.f9962b, Boolean.valueOf(this.f9968w));
        return a0.a;
    }
}
