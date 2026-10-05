package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.EditIssueOrPullTitleViewModel$submit$1", f = "EditIssueOrPullTitleViewModel.kt", l = {46, 53}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class d0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ e0 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ y71.y1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, String str, y71.y1 y1Var, a71.c cVar) {
        super(2, cVar);
        this.w = e0Var;
        this.x = str;
        this.y = y1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new d0(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r9.b(r0, r8) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r9.b(r0, r8) == r3) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        e0 e0Var = this.w;
        String str = e0Var.v;
        com.github.rudroid.activities.util.c cVar = e0Var.u;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            boolean z = e0Var.w;
            String str2 = this.x;
            y71.y1 y1Var = this.y;
            if (z) {
                y71.y a = e0Var.t.a(cVar.d(), str, str2, new com.github.rudroid.favorites.viewmodels.d(y1Var, 5));
                b0 b0Var = new b0(y1Var);
                this.v = 1;
            } else {
                y71.y a2 = e0Var.s.a(cVar.d(), str, str2, new com.github.rudroid.favorites.viewmodels.d(y1Var, 6));
                c0 c0Var = new c0(y1Var);
                this.v = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
