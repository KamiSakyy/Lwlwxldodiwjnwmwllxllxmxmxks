package com.github.rudroid.settings;

@c71.e(c = "com.github.rudroid.settings.SettingsViewModel$setUpsellBannerDismissed$1", f = "SettingsViewModel.kt", l = {127}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class a3 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ t2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(t2 t2Var, a71.c cVar) {
        super(2, cVar);
        this.w = t2Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new a3(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        if (i == 0) {
            sy.y.j(obj);
            com.github.rudroid.copilot.preferences.p pVar = this.w.x;
            this.v = 1;
            Object d = pVar.a.d(this, Boolean.TRUE, gi.d.a);
            if (d != aVar) {
                d = a0Var;
            }
            if (d == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return a0Var;
    }
}
