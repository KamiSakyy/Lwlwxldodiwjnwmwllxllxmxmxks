package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.PullRequestReviewViewModel$removeReaction$1", f = "PullRequestReviewViewModel.kt", l = {278, 286}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class u4 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ c5 w;
    public final /* synthetic */ yz0.r3 x;
    public final /* synthetic */ y71.y1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(c5 c5Var, yz0.r3 r3Var, y71.y1 y1Var, a71.c cVar) {
        super(2, cVar);
        this.w = c5Var;
        this.x = r3Var;
        this.y = y1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new u4(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if (r2.b(r13, r12) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r13 == r0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        u4 u4Var;
        b71.a aVar = b71.a.r;
        int i = this.v;
        y71.y1 y1Var = this.y;
        if (i == 0) {
            sy.y.j(obj);
            c5 c5Var = this.w;
            kj.g0 g0Var = c5Var.z;
            oa.j d = c5Var.D.d();
            yz0.l3 l3Var = (yz0.l3) c5Var.I.getValue();
            String str = l3Var != null ? l3Var.a : null;
            com.github.rudroid.favorites.viewmodels.d dVar = new com.github.rudroid.favorites.viewmodels.d(y1Var, 9);
            this.v = 1;
            u4Var = this;
            obj = g0Var.a(d, str, this.x, dVar, u4Var);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            u4Var = this;
        }
        y71.y yVar = new y71.y(new s4(y1Var, null), (y71.i) obj);
        t4 t4Var = new t4(y1Var);
        u4Var.v = 2;
    }
}
