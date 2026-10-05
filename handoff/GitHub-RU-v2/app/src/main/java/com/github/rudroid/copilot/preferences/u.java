package com.github.rudroid.copilot.preferences;

import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.copilot.preferences.SetLastSelectedAgentTaskRepositoryUseCase$execute$2", f = "SetLastSelectedAgentTaskRepositoryUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class u extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f9974v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f9975w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f9976x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, String str2, a71.c cVar) {
        super(2, cVar);
        this.f9975w = str;
        this.f9976x = str2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        u uVar = new u(this.f9975w, this.f9976x, cVar);
        uVar.f9974v = obj;
        return uVar;
    }

    public final Object s(Object obj, Object obj2) {
        u r10 = r((a71.c) obj2, (s5.b) obj);
        a0 a0Var = a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        String str;
        s5.b bVar = (s5.b) this.f9974v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        String str2 = this.f9975w;
        if (str2 == null || (str = this.f9976x) == null) {
            s5.e eVar = a.f9957a;
            bVar.getClass();
            k71.k.g(eVar, "key");
            bVar.b();
            bVar.e(eVar);
            s5.e eVar2 = a.f9958b;
            k71.k.g(eVar2, "key");
            bVar.b();
            bVar.e(eVar2);
        } else {
            bVar.f(a.f9957a, str);
            bVar.f(a.f9958b, str2);
        }
        return a0.a;
    }
}
