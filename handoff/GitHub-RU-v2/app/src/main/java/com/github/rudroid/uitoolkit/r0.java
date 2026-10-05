package com.github.rudroid.uitoolkit;

@c71.e(c = "com.github.rudroid.uitoolkit.InfiniteLoopingIconKt$InfiniteLoopingIcon$1$1", f = "InfiniteLoopingIcon.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class r0 extends c71.j implements j71.e {
    public final /* synthetic */ androidx.compose.runtime.f1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.compose.runtime.f1 f1Var, a71.c cVar) {
        super(2, cVar);
        this.v = f1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new r0(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        r0 r = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        this.v.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
        return w61.a0.a;
    }
}
