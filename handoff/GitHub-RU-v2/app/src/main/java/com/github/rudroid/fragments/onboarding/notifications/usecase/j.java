package com.github.rudroid.fragments.onboarding.notifications.usecase;

@c71.e(c = "com.github.rudroid.fragments.onboarding.notifications.usecase.SetNotificationsContinueSetupBannerDismissedUseCase$execute$2", f = "SetNotificationsContinueSetupBannerDismissedUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class j extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f14219v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f14220w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f14221x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j10, boolean z10, a71.c cVar) {
        super(2, cVar);
        this.f14220w = j10;
        this.f14221x = z10;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        j jVar = new j(this.f14220w, this.f14221x, cVar);
        jVar.f14219v = obj;
        return jVar;
    }

    public final Object s(Object obj, Object obj2) {
        j r10 = r((a71.c) obj2, (s5.b) obj);
        w61.a0 a0Var = w61.a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        s5.b bVar = (s5.b) this.f14219v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        bVar.f(com.github.rudroid.settings.notifications.a.e, new Long(this.f14220w));
        s5.e eVar = com.github.rudroid.settings.notifications.a.f;
        Integer num = (Integer) bVar.d(eVar);
        bVar.g(eVar, new Integer(this.f14221x ? 99 : (num != null ? num.intValue() : 0) + 1));
        return w61.a0.a;
    }
    public Object ordinal() { return null; }
}
