package com.github.rudroid.searchandfilter;

@c71.e(c = "com.github.rudroid.searchandfilter.FilterBarViewModel$8", f = "FilterBarViewModel.kt", l = {370}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class p extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ q w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a71.c cVar, q qVar) {
        super(2, cVar);
        this.w = qVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new p(cVar, this.w);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            q qVar = this.w;
            o oVar = new o(qVar.G);
            l lVar = new l(qVar);
            this.v = 1;
            if (oVar.b(lVar, this) == aVar) {
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
