package com.github.rudroid.settings;

@c71.e(c = "com.github.rudroid.settings.SettingsViewModel$observeCopilotPermissions$1", f = "SettingsViewModel.kt", l = {114}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class v2 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ t2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(t2 t2Var, a71.c cVar) {
        super(2, cVar);
        this.w = t2Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new v2(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            t2 t2Var = this.w;
            y71.y a = t2Var.v.a(t2Var.z.d(), new com.github.rudroid.actions.checklog.t(4));
            u2 u2Var = new u2(t2Var);
            this.v = 1;
            if (a.b(u2Var, this) == aVar) {
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
