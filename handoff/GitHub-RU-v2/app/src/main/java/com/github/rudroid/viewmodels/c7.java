package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.RepositorySearchViewModel$loadNextPage$1", f = "RepositorySearchViewModel.kt", l = {68, 77}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class c7 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ v6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(v6 v6Var, a71.c cVar) {
        super(2, cVar);
        this.w = v6Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new c7(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (r3.b(r13, r12) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r13 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        c7 c7Var;
        b71.a aVar = b71.a.r;
        int i = this.v;
        v6 v6Var = this.w;
        if (i == 0) {
            sy.y.j(obj);
            kj.n nVar = v6Var.u;
            oa.j d = v6Var.v.d();
            String str = v6Var.s;
            String str2 = v6Var.x.b;
            com.github.rudroid.common.i0 i0Var = com.github.rudroid.common.i0.r;
            w6 w6Var = new w6(v6Var, 1);
            this.v = 1;
            c7Var = this;
            obj = nVar.a(d, str, str2, i0Var, w6Var, c7Var);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            c7Var = this;
        }
        y71.y yVar = new y71.y(new a7(v6Var, null), (y71.i) obj);
        b7 b7Var = new b7(v6Var);
        c7Var.v = 2;
    }
}
