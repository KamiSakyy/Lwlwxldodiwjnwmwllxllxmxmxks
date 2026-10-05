package com.github.rudroid.settings.copilot;

import com.github.rudroid.settings.copilot.CopilotChatSettingsActivity;

@c71.e(c = "com.github.rudroid.settings.copilot.CopilotChatSettingsActivity$registerCopilotProPaywallLauncher$1$1", f = "CopilotChatSettingsActivity.kt", l = {171}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class l extends c71.j implements j71.e {
    public o v;
    public int w;
    public final /* synthetic */ CopilotChatSettingsActivity x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CopilotChatSettingsActivity copilotChatSettingsActivity, a71.c cVar) {
        super(2, cVar);
        this.x = copilotChatSettingsActivity;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new l(this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        o oVar;
        b71.a aVar = b71.a.r;
        int i = this.w;
        if (i == 0) {
            sy.y.j(obj);
            CopilotChatSettingsActivity.a aVar2 = CopilotChatSettingsActivity.Companion;
            CopilotChatSettingsActivity copilotChatSettingsActivity = this.x;
            o oVar2 = (o) copilotChatSettingsActivity.u0.getValue();
            com.github.rudroid.activities.util.c w0 = copilotChatSettingsActivity.w0();
            this.v = oVar2;
            this.w = 1;
            obj = com.github.rudroid.activities.util.a.c(w0, this);
            if (obj == aVar) {
                return aVar;
            }
            oVar = oVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.v;
            sy.y.j(obj);
        }
        oVar.P((oa.j) obj);
        return w61.a0.a;
    }
}
