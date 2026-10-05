package com.github.rudroid.settings;

@c71.e(c = "com.github.rudroid.settings.SettingsViewModel$observeStaff$1", f = "SettingsViewModel.kt", l = {101, 103}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class z2 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ t2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(t2 t2Var, a71.c cVar) {
        super(2, cVar);
        this.w = t2Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new z2(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (((y71.i) r8).b(r1, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r8 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        t2 t2Var = this.w;
        if (i == 0) {
            sy.y.j(obj);
            mm.f fVar = t2Var.u;
            oa.j d = t2Var.z.d();
            com.github.rudroid.searchandfilter.complexfilter.explore.a0 a0Var = new com.github.rudroid.searchandfilter.complexfilter.explore.a0(19);
            this.v = 1;
            obj = fVar.a(d, a0Var, this);
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
        y2 y2Var = new y2(t2Var);
        this.v = 2;
    }
}
