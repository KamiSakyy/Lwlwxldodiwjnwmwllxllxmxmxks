package com.github.rudroid.fragments.onboarding.notifications.usecase;

@c71.e(c = "com.github.rudroid.fragments.onboarding.notifications.usecase.SetNotificationsOnboardingShownUseCase$execute$2", f = "SetNotificationsOnboardingShownUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class r extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f14238v;

    public final a71.c r(a71.c cVar, Object obj) {
        r rVar = new r(2, cVar);
        rVar.f14238v = obj;
        return rVar;
    }

    public final Object s(Object obj, Object obj2) {
        r r10 = r((a71.c) obj2, (s5.b) obj);
        w61.a0 a0Var = w61.a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        s5.b bVar = (s5.b) this.f14238v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        s5.e eVar = com.github.rudroid.settings.notifications.a.a;
        bVar.f(com.github.rudroid.settings.notifications.a.a, Boolean.TRUE);
        return w61.a0.a;
    }
}
