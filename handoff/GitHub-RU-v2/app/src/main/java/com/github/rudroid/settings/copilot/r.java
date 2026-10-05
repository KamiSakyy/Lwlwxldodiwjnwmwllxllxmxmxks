package com.github.rudroid.settings.copilot;

import xn.e1;

@c71.e(c = "com.github.rudroid.settings.copilot.CopilotChatSettingsViewModel$fetchCopilotChatMonthlyLicenseDetails$1", f = "CopilotChatSettingsViewModel.kt", l = {126}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class r extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ o w;
    public final /* synthetic */ oa.j x;
    public final /* synthetic */ e1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(o oVar, oa.j jVar, e1 e1Var, a71.c cVar) {
        super(2, cVar);
        this.w = oVar;
        this.x = jVar;
        this.y = e1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new r(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            o oVar = this.w;
            c00.g a = oVar.v.a(this.x, this.y);
            q qVar = new q(oVar);
            this.v = 1;
            if (a.b(qVar, this) == aVar) {
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
