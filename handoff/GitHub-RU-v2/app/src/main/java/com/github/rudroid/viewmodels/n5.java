package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.PullRequestSearchViewModel$loadNextPage$1", f = "PullRequestSearchViewModel.kt", l = {102, 112}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class n5 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ r5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(r5 r5Var, a71.c cVar) {
        super(2, cVar);
        this.w = r5Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new n5(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (r3.b(r14, r13) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r14 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        n5 n5Var;
        b71.a aVar = b71.a.r;
        int i = this.v;
        r5 r5Var = this.w;
        if (i == 0) {
            sy.y.j(obj);
            zk.x0 x0Var = r5Var.w;
            oa.j d = r5Var.x.d();
            String str = r5Var.s;
            String str2 = r5Var.z.b;
            i5 i5Var = new i5(r5Var, 1);
            this.v = 1;
            n5Var = this;
            obj = x0Var.a(d, str, str2, null, null, i5Var, n5Var);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            n5Var = this;
        }
        y71.y yVar = new y71.y(new l5(r5Var, null), (y71.i) obj);
        m5 m5Var = new m5(r5Var);
        n5Var.v = 2;
    }
}
