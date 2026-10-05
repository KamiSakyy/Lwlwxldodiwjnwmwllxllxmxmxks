package com.github.rudroid.settings.applock;

@c71.e(c = "com.github.rudroid.settings.applock.AppLockFragment$onCreateView$1$1$1$3$1", f = "AppLockFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class p extends c71.j implements j71.e {
    public final /* synthetic */ AppLockFragment v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(AppLockFragment appLockFragment, a71.c cVar) {
        super(2, cVar);
        this.v = appLockFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new p(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        p r = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        AppLockFragment.C4(this.v);
        return w61.a0.a;
    }
}
