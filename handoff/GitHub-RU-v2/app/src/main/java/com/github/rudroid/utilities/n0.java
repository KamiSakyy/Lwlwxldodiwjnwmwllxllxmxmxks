package com.github.rudroid.utilities;

@c71.e(c = "com.github.rudroid.utilities.FlowExtensionsKt$collectIn$1", f = "FlowExtensions.kt", l = {44}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class n0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ androidx.lifecycle.c0 w;
    public final /* synthetic */ androidx.lifecycle.w x;
    public final /* synthetic */ y71.i y;
    public final /* synthetic */ j71.e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(androidx.lifecycle.c0 c0Var, androidx.lifecycle.w wVar, y71.i iVar, j71.e eVar, a71.c cVar) {
        super(2, cVar);
        this.w = c0Var;
        this.x = wVar;
        this.y = iVar;
        this.z = eVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new n0(this.w, this.x, this.y, this.z, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            androidx.compose.foundation.lazy.layout.s0 m3 = this.w.m3();
            m0 m0Var = new m0(this.y, this.z, null);
            this.v = 1;
            if (androidx.lifecycle.d1.m(m3, this.x, m0Var, this) == aVar) {
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
