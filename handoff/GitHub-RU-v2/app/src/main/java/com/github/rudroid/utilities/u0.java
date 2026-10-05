package com.github.rudroid.utilities;

@c71.e(c = "com.github.rudroid.utilities.FlowExtensionsKt$mapStateFlow$1", f = "FlowExtensions.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class u0 extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ j71.c w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(j71.c cVar, a71.c cVar2) {
        super(2, cVar2);
        this.w = cVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        u0 u0Var = new u0(this.w, cVar);
        u0Var.v = obj;
        return u0Var;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        Object obj2 = this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        return this.w.k(obj2);
    }
}
