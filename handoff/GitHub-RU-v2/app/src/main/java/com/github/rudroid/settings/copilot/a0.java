package com.github.rudroid.settings.copilot;

@c71.e(c = "com.github.rudroid.settings.copilot.CopilotChatSettingsViewModel$observeViewerCopilotPermissions$1", f = "CopilotChatSettingsViewModel.kt", l = {144}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class a0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ o w;
    public final /* synthetic */ oa.j x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(o oVar, oa.j jVar, a71.c cVar) {
        super(2, cVar);
        this.w = oVar;
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
            o oVar = this.w;
            nj.d0 d0Var = oVar.t;
            y yVar = new y(0, oVar);
            oa.j jVar = this.x;
            y71.y a = d0Var.a(jVar, yVar);
            z zVar = new z(oVar, jVar);
            this.v = 1;
            if (a.b(zVar, this) == aVar) {
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
