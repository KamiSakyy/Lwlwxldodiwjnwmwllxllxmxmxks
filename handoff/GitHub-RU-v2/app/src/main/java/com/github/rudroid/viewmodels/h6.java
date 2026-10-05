package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.PullRequestsViewModel$loadNextPage$1", f = "PullRequestsViewModel.kt", l = {247, 257}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class h6 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ a6 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(a6 a6Var, a71.c cVar) {
        super(2, cVar);
        this.w = a6Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new h6(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        if (r3.b(r14, r13) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r14 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        h6 h6Var;
        b71.a aVar = b71.a.r;
        int i = this.v;
        a6 a6Var = this.w;
        if (i == 0) {
            sy.y.j(obj);
            zk.x0 x0Var = a6Var.w;
            oa.j d = a6Var.y.d();
            String P = a6.P(a6Var, a6Var.S());
            String str = a6Var.E.b;
            String str2 = a6Var.G;
            String T = a6Var.T();
            x5 x5Var = new x5(a6Var, 4);
            this.v = 1;
            h6Var = this;
            obj = x0Var.a(d, P, str, str2, T, x5Var, h6Var);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            h6Var = this;
        }
        y71.y yVar = new y71.y(new f6(a6Var, null), (y71.i) obj);
        g6 g6Var = new g6(a6Var);
        h6Var.v = 2;
    }
}
