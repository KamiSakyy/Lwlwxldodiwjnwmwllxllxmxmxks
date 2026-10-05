package com.github.rudroid.settings.copilot.managesubscription;

@c71.e(c = "com.github.rudroid.settings.copilot.managesubscription.CopilotManageSubscriptionViewModel$observeUserChange$1", f = "CopilotManageSubscriptionViewModel.kt", l = {44}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class v extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ b0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(b0 b0Var, a71.c cVar) {
        super(2, cVar);
        this.w = b0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new v(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            b0 b0Var = this.w;
            y00.l lVar = b0Var.s.b;
            u uVar = new u(b0Var);
            this.v = 1;
            if (lVar.b(uVar, this) == aVar) {
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
