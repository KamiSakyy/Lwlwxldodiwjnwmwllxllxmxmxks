package com.github.rudroid.searchandfilter;

@c71.e(c = "com.github.rudroid.searchandfilter.RepositoryMergeQueueViewModel$1", f = "RepositoryMergeQueueViewModel.kt", l = {47}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class p0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ q0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, a71.c cVar) {
        super(2, cVar);
        this.w = q0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new p0(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            return a0Var;
        }
        sy.y.j(obj);
        q0 q0Var = this.w;
        if (q0Var.u != null && q0Var.v != null) {
            y00.l lVar = q0Var.s.b;
            o0 o0Var = new o0(q0Var);
            this.v = 1;
            if (lVar.b(o0Var, this) == aVar) {
                return aVar;
            }
        }
        return a0Var;
    }
}
