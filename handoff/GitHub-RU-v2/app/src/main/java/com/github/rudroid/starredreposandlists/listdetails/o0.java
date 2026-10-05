package com.github.rudroid.starredreposandlists.listdetails;

@c71.e(c = "com.github.rudroid.starredreposandlists.listdetails.ListDetailViewModel$loadHead$1", f = "ListDetailViewModel.kt", l = {101}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class o0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ s0 w;
    public final /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(a71.c cVar, s0 s0Var, boolean z) {
        super(2, cVar);
        this.w = s0Var;
        this.x = z;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new o0(cVar, this.w, this.x);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            s0 s0Var = this.w;
            y71.y yVar = new y71.y(new m0(null, s0Var, this.x), s0Var.s.a(s0Var.u.d(), s0Var.w.a, (String) s0Var.z.r.getValue(), null, new l0(s0Var, 0)));
            n0 n0Var = new n0(s0Var);
            this.v = 1;
            if (yVar.b(n0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
