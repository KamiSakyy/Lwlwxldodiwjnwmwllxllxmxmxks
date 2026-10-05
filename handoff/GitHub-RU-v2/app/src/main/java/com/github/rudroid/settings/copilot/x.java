package com.github.rudroid.settings.copilot;

@c71.e(c = "com.github.rudroid.settings.copilot.CopilotChatSettingsViewModel$observeUserChange$1", f = "CopilotChatSettingsViewModel.kt", l = {105}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class x extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ o w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(o oVar, a71.c cVar) {
        super(2, cVar);
        this.w = oVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new x(this.w, cVar);
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
            y00.l lVar = oVar.y.b;
            w wVar = new w(oVar);
            this.v = 1;
            if (lVar.b(wVar, this) == aVar) {
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
