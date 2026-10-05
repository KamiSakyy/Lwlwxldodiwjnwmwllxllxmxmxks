package com.github.rudroid.fragments.onboarding.notifications.usecase;

import android.content.Context;

@c71.e(c = "com.github.rudroid.fragments.onboarding.notifications.usecase.ObserveNotificationsOnboardingStateUseCase$execute$1", f = "ObserveNotificationsOnboardingStateUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class b extends c71.j implements j71.f {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ gi.e f14196v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ com.github.rudroid.settings.notifications.b f14197w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f14198x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, a71.c cVar2) {
        super(3, cVar2);
        this.f14198x = cVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        b bVar = new b(this.f14198x, (a71.c) obj3);
        bVar.f14196v = (gi.e) obj;
        bVar.f14197w = (com.github.rudroid.settings.notifications.b) obj2;
        return bVar.v(w61.a0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        boolean z10;
        gi.e eVar = this.f14196v;
        com.github.rudroid.settings.notifications.b bVar = this.f14197w;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        boolean z11 = true;
        if (!eVar.d) {
            fi.c cVar = fi.d.Companion;
            Context context = this.f14198x.f14200a;
            cVar.getClass();
            if (!fi.c.b(context).getBoolean("swipe_onboarding_notification_settings_shown", false) && !bVar.a) {
                z10 = true;
                z11 = false;
                return new a(z11, eVar.e != null ? z10 : false, eVar.g, eVar.f, bVar);
            }
        }
        z10 = true;
        return new a(z11, eVar.e != null ? z10 : false, eVar.g, eVar.f, bVar);
    }
}
