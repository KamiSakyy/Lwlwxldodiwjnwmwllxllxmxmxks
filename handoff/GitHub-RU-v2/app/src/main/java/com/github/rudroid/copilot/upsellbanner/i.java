package com.github.rudroid.copilot.upsellbanner;

import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.copilot.upsellbanner.CopilotUpsellBannerDialogViewModel$setUpsellBannerDismissed$1", f = "CopilotUpsellBannerDialogViewModel.kt", l = {19}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class i extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public int f10192v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f10193w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, a71.c cVar) {
        super(2, cVar);
        this.f10193w = jVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new i(this.f10193w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.f10192v;
        a0 a0Var = a0.a;
        if (i == 0) {
            y.j(obj);
            com.github.rudroid.copilot.preferences.p pVar = this.f10193w.f10194s;
            this.f10192v = 1;
            Object d10 = pVar.f9970a.d(this, Boolean.TRUE, gi.d.a);
            if (d10 != aVar) {
                d10 = a0Var;
            }
            if (d10 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.j(obj);
        }
        return a0Var;
    }
}
