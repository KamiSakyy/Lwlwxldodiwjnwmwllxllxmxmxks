package com.github.rudroid.fragments.onboarding.notifications.usecase;

@c71.e(c = "com.github.rudroid.fragments.onboarding.notifications.usecase.SetNotificationsReviewSetupBannerDismissedUseCase$execute$2", f = "SetNotificationsReviewSetupBannerDismissedUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class x extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f14248v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f14249w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(long j10, a71.c cVar) {
        super(2, cVar);
        this.f14249w = j10;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        x xVar = new x(this.f14249w, cVar);
        xVar.f14248v = obj;
        return xVar;
    }

    public final Object s(Object obj, Object obj2) {
        x r10 = r((a71.c) obj2, (s5.b) obj);
        w61.a0 a0Var = w61.a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        s5.b bVar = (s5.b) this.f14248v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        s5.e eVar = com.github.rudroid.settings.notifications.a.a;
        bVar.f(com.github.rudroid.settings.notifications.a.g, new Long(this.f14249w));
        return w61.a0.a;
    }
}
