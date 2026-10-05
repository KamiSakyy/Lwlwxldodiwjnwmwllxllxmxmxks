package com.github.rudroid.settings;

@c71.e(c = "com.github.rudroid.settings.SettingsNotificationSchedulesViewModel$enableSchedules$2", f = "SettingsNotificationSchedulesViewModel.kt", l = {172}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class s0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ r0 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ j71.c y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(r0 r0Var, boolean z, j71.c cVar, a71.c cVar2) {
        super(2, cVar2);
        this.w = r0Var;
        this.x = z;
        this.y = cVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new s0(this.w, this.x, this.y, cVar);
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
            sm.g gVar = r0Var.v;
            oa.j d = r0Var.w.d();
            ak.a aVar2 = ak.a.s;
            this.v = 1;
            if (gVar.a(d, this.x, aVar2, this.y, this) == aVar) {
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
