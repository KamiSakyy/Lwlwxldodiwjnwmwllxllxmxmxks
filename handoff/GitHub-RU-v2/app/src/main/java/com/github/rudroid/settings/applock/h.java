package com.github.rudroid.settings.applock;

import y71.y1;

@c71.e(c = "com.github.rudroid.settings.applock.AppLockAuthenticationStore$observeAppState$1", f = "AppLockAuthenticationStore.kt", l = {38}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class h extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ k w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, a71.c cVar) {
        super(2, cVar);
        this.w = kVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new h(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            return w61.a0.a;
        }
        sy.y.j(obj);
        k kVar = this.w;
        y1 y1Var = kVar.d.s;
        g gVar = new g(kVar);
        this.v = 1;
        y1Var.b(gVar, this);
        return aVar;
    }
}
