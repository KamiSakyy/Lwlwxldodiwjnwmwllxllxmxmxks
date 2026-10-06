package com.github.rudroid.common.flow;

import c71.j;
import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.common.flow.FlowExtensionRetryUntilKt$retryUntil$4", f = "FlowExtensionRetryUntil.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
class e extends j implements j71.f {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Throwable f9313v;

    public final Object f(Object obj, Object obj2, Object obj3) {
        e eVar = new e(3, (a71.c) obj3);
        eVar.f9313v = (Throwable) obj2;
        a0 a0Var = a0.a;
        eVar.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        Throwable th = this.f9313v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        if (th instanceof g) {
            return a0.a;
        }
        throw th;
    }
}
