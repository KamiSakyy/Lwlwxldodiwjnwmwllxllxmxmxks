package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.OrganizationSearchViewModel$loadHead$1", f = "OrganizationSearchViewModel.kt", l = {45, 47}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class n3 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ k3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(k3 k3Var, a71.c cVar) {
        super(2, cVar);
        this.w = k3Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new n3(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (((y71.i) r12).b(r1, r11) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r12 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        n3 n3Var;
        b71.a aVar = b71.a.r;
        int i = this.v;
        k3 k3Var = this.w;
        if (i == 0) {
            sy.y.j(obj);
            lm.l lVar = k3Var.u;
            oa.j d = k3Var.v.d();
            String str = k3Var.s;
            l3 l3Var = new l3(k3Var, 0);
            this.v = 1;
            n3Var = this;
            obj = lVar.a(d, str, null, l3Var, n3Var);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            n3Var = this;
        }
        m3 m3Var = new m3(k3Var);
        n3Var.v = 2;
    }
}
