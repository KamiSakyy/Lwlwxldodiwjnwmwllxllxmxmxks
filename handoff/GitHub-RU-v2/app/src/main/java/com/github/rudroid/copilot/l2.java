package com.github.rudroid.copilot;

@c71.e(c = "com.github.rudroid.copilot.CopilotChatViewModel$activeNavigationContext$1", f = "CopilotChatViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class l2 extends c71.j implements j71.f {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ com.github.rudroid.agents.copilothome.navigation.e f9881v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f9882w;

    public final Object f(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        l2 l2Var = new l2(3, (a71.c) obj3);
        l2Var.f9881v = (com.github.rudroid.agents.copilothome.navigation.e) obj;
        l2Var.f9882w = booleanValue;
        return l2Var.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        com.github.rudroid.agents.copilothome.navigation.e eVar = this.f9881v;
        boolean z10 = this.f9882w;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        if (z10) {
            return null;
        }
        return eVar;
    }
}
