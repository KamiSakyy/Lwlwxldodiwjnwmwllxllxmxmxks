package com.github.rudroid.settings;

@c71.e(c = "com.github.rudroid.settings.SettingsNotificationSchedulesViewModel$observeSchedules$1", f = "SettingsNotificationSchedulesViewModel.kt", l = {84}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class y0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ r0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(r0 r0Var, a71.c cVar) {
        super(2, cVar);
        this.w = r0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new y0(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            r0 r0Var = this.w;
            x0 x0Var = new x0(new y71.u(new t0(2, null), r0Var.t.B(r0Var.w.d())));
            u0 u0Var = new u0(r0Var);
            this.v = 1;
            if (x0Var.b(u0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
