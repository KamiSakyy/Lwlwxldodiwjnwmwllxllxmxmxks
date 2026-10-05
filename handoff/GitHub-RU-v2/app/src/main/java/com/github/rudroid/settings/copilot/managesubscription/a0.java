package com.github.rudroid.settings.copilot.managesubscription;

import com.github.rudroid.utilities.w0;

@c71.e(c = "com.github.rudroid.settings.copilot.managesubscription.CopilotManageSubscriptionViewModel$observeViewerCopilotPermissions$1", f = "CopilotManageSubscriptionViewModel.kt", l = {58}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class a0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ b0 w;
    public final /* synthetic */ oa.j x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, oa.j jVar, a71.c cVar) {
        super(2, cVar);
        this.w = b0Var;
        this.x = jVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new a0(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            final b0 b0Var = this.w;
            nj.d0 d0Var = b0Var.t;
            j71.c cVar = new j71.c() { // from class: com.github.rudroid.settings.copilot.managesubscription.w
                public final Object k(Object obj2) {
                    w0.m(b0.this.v, (fl.b) obj2);
                    return w61.a0.a;
                }
            };
            oa.j jVar = this.x;
            y71.y yVar = new y71.y(new x(b0Var, null), d0Var.a(jVar, cVar));
            z zVar = new z(b0Var, jVar);
            this.v = 1;
            if (yVar.b(zVar, this) == aVar) {
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
