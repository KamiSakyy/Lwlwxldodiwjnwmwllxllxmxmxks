package com.github.rudroid.uitoolkit;

@c71.e(c = "com.github.rudroid.uitoolkit.ContentMissingOrNoAuthErrorScreenKt$ContentMissingOrNoAuthErrorScreen$1$1$1", f = "ContentMissingOrNoAuthErrorScreen.kt", l = {40}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class e0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ b2.a0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(b2.a0 a0Var, a71.c cVar) {
        super(2, cVar);
        this.w = a0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new e0(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            this.v = 1;
            if (v71.b0.l(1500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        b2.a0.a(this.w);
        return w61.a0.a;
    }
    public Object i = null;
}
