package com.github.rudroid.copilot.preferences;

import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.copilot.preferences.SetLastActiveThreadIdUseCase$execute$2", f = "SetLastActiveThreadIdUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class r extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f9971v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f9972w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, a71.c cVar) {
        super(2, cVar);
        this.f9972w = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        r rVar = new r(this.f9972w, cVar);
        rVar.f9971v = obj;
        return rVar;
    }

    public final Object s(Object obj, Object obj2) {
        r r10 = r((a71.c) obj2, (s5.b) obj);
        a0 a0Var = a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        s5.b bVar = (s5.b) this.f9971v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        String str = this.f9972w;
        if (str != null) {
            bVar.f(e.f9961a, str);
        } else {
            s5.e eVar = e.f9961a;
            bVar.getClass();
            k71.k.g(eVar, "key");
            bVar.b();
            bVar.e(eVar);
        }
        return a0.a;
    }
}
