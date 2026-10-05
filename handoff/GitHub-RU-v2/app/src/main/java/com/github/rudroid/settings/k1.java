package com.github.rudroid.settings;

@c71.e(c = "com.github.rudroid.settings.SettingsNotificationViewModel$observeDirectMentionsSettingForGHES$1", f = "SettingsNotificationViewModel.kt", l = {114, 118}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k1 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ i1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(i1 i1Var, a71.c cVar) {
        super(2, cVar);
        this.w = i1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new k1(this.w, cVar);
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
        i1 i1Var = this.w;
        if (i == 0) {
            sy.y.j(obj);
            l7.x1 x1Var = i1Var.u;
            oa.j d = i1Var.B.d();
            com.github.rudroid.searchandfilter.complexfilter.explore.a0 a0Var = new com.github.rudroid.searchandfilter.complexfilter.explore.a0(15);
            this.v = 1;
            obj = x1Var.y(d, a0Var, this);
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
        j1 j1Var = new j1(i1Var);
        this.v = 2;
    }
}
