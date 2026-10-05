package com.github.rudroid.fragments.onboarding.notifications.usecase;

@c71.e(c = "com.github.rudroid.fragments.onboarding.notifications.usecase.SetOnboardingPageVisitedUseCase$execute$2", f = "SetOnboardingPageVisitedUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class a0 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f14194v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.fragments.onboarding.notifications.viewmodel.j f14195w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.github.rudroid.fragments.onboarding.notifications.viewmodel.j jVar, a71.c cVar) {
        super(2, cVar);
        this.f14195w = jVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        a0 a0Var = new a0(this.f14195w, cVar);
        a0Var.f14194v = obj;
        return a0Var;
    }

    public final Object s(Object obj, Object obj2) {
        a0 r10 = r((a71.c) obj2, (s5.b) obj);
        w61.a0 a0Var = w61.a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        s5.b bVar = (s5.b) this.f14194v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        s5.e eVar = com.github.rudroid.settings.notifications.a.a;
        s5.e eVar2 = com.github.rudroid.settings.notifications.a.b;
        Integer num = (Integer) bVar.d(eVar2);
        int intValue = num != null ? num.intValue() : 0;
        int ordinal = this.f14195w.ordinal();
        if (ordinal > intValue) {
            bVar.f(eVar2, new Integer(ordinal));
        }
        return w61.a0.a;
    }
}
