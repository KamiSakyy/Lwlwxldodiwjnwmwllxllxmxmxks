package com.github.rudroid.agents.copilothome.ui;

import androidx.compose.runtime.f1;

@c71.e(c = "com.github.rudroid.agents.copilothome.ui.CopilotHomeFabMenuKt$CopilotHomeFabMenu$2$1", f = "CopilotHomeFabMenu.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class c0 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f1 f6865v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f6866w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f1 f1Var, boolean z10, a71.c cVar) {
        super(2, cVar);
        this.f6865v = f1Var;
        this.f6866w = z10;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new c0(this.f6865v, this.f6866w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        c0 r10 = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        this.f6865v.setValue(Boolean.valueOf(this.f6866w));
        return w61.a0.a;
    }
}
