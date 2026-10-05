package com.github.rudroid.support;

import y71.n1;

@c71.e(c = "com.github.rudroid.support.SupportViewModel$2", f = "SupportViewModel.kt", l = {102}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class p extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ s w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, a71.c cVar) {
        super(2, cVar);
        this.w = sVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new p(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            s sVar = this.w;
            y71.i o = n1.o(sVar.w, 300L);
            o oVar = new o(sVar);
            this.v = 1;
            if (o.b(oVar, this) == aVar) {
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
