package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.RepositorySearchViewModel$loadHead$1", f = "RepositorySearchViewModel.kt", l = {42, 51}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class z6 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ v6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(v6 v6Var, a71.c cVar) {
        super(2, cVar);
        this.w = v6Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new z6(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r3.b(r13, r12) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r13 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        z6 z6Var;
        b71.a aVar = b71.a.r;
        int i = this.v;
        v6 v6Var = this.w;
        if (i == 0) {
            sy.y.j(obj);
            kj.n nVar = v6Var.u;
            oa.j d = v6Var.v.d();
            String str = v6Var.s;
            com.github.rudroid.common.i0 i0Var = com.github.rudroid.common.i0.r;
            w6 w6Var = new w6(v6Var, 0);
            this.v = 1;
            z6Var = this;
            obj = nVar.a(d, str, null, i0Var, w6Var, z6Var);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            z6Var = this;
        }
        y71.y yVar = new y71.y(new x6(v6Var, null), (y71.i) obj);
        y6 y6Var = new y6(v6Var);
        z6Var.v = 2;
    }
}
