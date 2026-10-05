package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.OrganizationSearchViewModel$loadNextPage$1", f = "OrganizationSearchViewModel.kt", l = {66, 68}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class p3 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ k3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(k3 k3Var, a71.c cVar) {
        super(2, cVar);
        this.w = k3Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new p3(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (((y71.i) r12).b(r1, r11) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r12 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        p3 p3Var;
        b71.a aVar = b71.a.r;
        int i = this.v;
        k3 k3Var = this.w;
        if (i == 0) {
            sy.y.j(obj);
            lm.l lVar = k3Var.u;
            oa.j d = k3Var.v.d();
            String str = k3Var.s;
            String str2 = k3Var.x.b;
            l3 l3Var = new l3(k3Var, 1);
            this.v = 1;
            p3Var = this;
            obj = lVar.a(d, str, str2, l3Var, p3Var);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            p3Var = this;
        }
        o3 o3Var = new o3(k3Var);
        p3Var.v = 2;
    }
}
