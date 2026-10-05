package com.github.rudroid.settings;

import yz0.d5;

@c71.e(c = "com.github.rudroid.settings.SettingsViewModel$observeEnterpriseContact$1", f = "SettingsViewModel.kt", l = {87, 89}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class x2 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ t2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(t2 t2Var, a71.c cVar) {
        super(2, cVar);
        this.w = t2Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new x2(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (((y71.i) r8).b(r1, r7) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r8 == r2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        t2 t2Var = this.w;
        com.github.rudroid.activities.util.c cVar = t2Var.z;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            if (cVar.d().f(com.github.rudroid.common.a.u)) {
                t2Var.E.j(new d5("mobilefeedback+android@github.com", true));
                return w61.a0.a;
            }
            mm.c cVar2 = t2Var.t;
            oa.j d = cVar.d();
            com.github.rudroid.searchandfilter.complexfilter.explore.a0 a0Var = new com.github.rudroid.searchandfilter.complexfilter.explore.a0(18);
            this.v = 1;
            obj = cVar2.a(d, a0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
            w2 w2Var = new w2(t2Var);
            this.v = 2;
        }
    }
}
