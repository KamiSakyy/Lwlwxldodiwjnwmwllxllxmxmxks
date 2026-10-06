package com.github.rudroid.fragments.onboarding.notifications.viewmodel;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

@c71.e(c = "com.github.rudroid.fragments.onboarding.notifications.viewmodel.SystemNotificationsViewModel$askedForPermission$1", f = "SystemNotificationsViewModel.kt", l = {109}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class s0 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public int f14326v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f14327w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(u0 u0Var, a71.c cVar) {
        super(2, cVar);
        this.f14327w = u0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new s0(this.f14327w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.f14326v;
        w61.a0 a0Var = w61.a0.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            return a0Var;
        }
        sy.y.j(obj);
        com.github.rudroid.fragments.onboarding.notifications.usecase.u uVar = this.f14327w.f14343v;
        this.f14326v = 1;
        Object d10 = uVar.f14242a.d(this, new Long(ZonedDateTime.now(ZoneOffset.UTC).toInstant().toEpochMilli()), gi.d.f);
        if (d10 != aVar) {
            d10 = a0Var;
        }
        return d10 == aVar ? aVar : a0Var;
    }
    public static Object b(Object p1, Object p2, Object p3) { return null; }
    public static Object l(Object p1, Object p2, Object p3) { return null; }
}
