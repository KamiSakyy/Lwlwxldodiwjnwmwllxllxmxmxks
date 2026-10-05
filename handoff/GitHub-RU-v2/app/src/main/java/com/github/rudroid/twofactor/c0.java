package com.github.rudroid.twofactor;

@c71.e(c = "com.github.rudroid.twofactor.TwoFactorRequestCheckViewModel$checkForRequests$1", f = "TwoFactorRequestCheckViewModel.kt", l = {76, 78}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class c0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ g0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g0 g0Var, a71.c cVar) {
        super(2, cVar);
        this.w = g0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new c0(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r1.b(r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r6 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        g0 g0Var = this.w;
        if (i == 0) {
            sy.y.j(obj);
            dn.p pVar = g0Var.s;
            this.v = 1;
            obj = pVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
        }
        y00.l lVar = new y00.l((y71.i) obj, 8);
        b0 b0Var = new b0(g0Var);
        this.v = 2;
    }
}
