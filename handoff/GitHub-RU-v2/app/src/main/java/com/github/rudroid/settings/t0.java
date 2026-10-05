package com.github.rudroid.settings;

@c71.e(c = "com.github.rudroid.settings.SettingsNotificationSchedulesViewModel$observeSchedules$1$1", f = "SettingsNotificationSchedulesViewModel.kt", l = {78}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class t0 extends c71.j implements j71.e {
    public int v;
    public /* synthetic */ Object w;

    public final a71.c r(a71.c cVar, Object obj) {
        t0 t0Var = new t0(2, cVar);
        t0Var.w = obj;
        return t0Var;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (y71.j) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        y71.j jVar = (y71.j) this.w;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            pm.c.Companion.getClass();
            pm.c cVar = pm.c.h;
            this.w = null;
            this.v = 1;
            if (jVar.c(cVar, this) == aVar) {
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
