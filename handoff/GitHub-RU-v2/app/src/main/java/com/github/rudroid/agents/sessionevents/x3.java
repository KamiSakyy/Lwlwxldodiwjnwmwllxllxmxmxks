package com.github.rudroid.agents.sessionevents;

import java.util.Map;

@c71.e(c = "com.github.rudroid.agents.sessionevents.SessionEventsViewModel$uiState$1", f = "SessionEventsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class x3 extends c71.j implements j71.h {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ com.github.rudroid.utilities.ui.g1 f8284v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ j4 f8285w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Map f8286x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ boolean f8287y;

    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        x3 x3Var = new x3(5, (a71.c) obj5);
        x3Var.f8284v = (com.github.rudroid.utilities.ui.g1) obj;
        x3Var.f8285w = (j4) obj2;
        x3Var.f8286x = (Map) obj3;
        x3Var.f8287y = booleanValue;
        return x3Var.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        com.github.rudroid.utilities.ui.g1 g1Var = this.f8284v;
        j4 j4Var = this.f8285w;
        Map map = this.f8286x;
        boolean z10 = this.f8287y;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        return new n4(g1Var, j4Var, map, z10);
    }
}
