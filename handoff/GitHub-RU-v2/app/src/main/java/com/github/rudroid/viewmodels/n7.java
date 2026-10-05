package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.SavedRepliesViewModel$loadHead$1", f = "SavedRepliesViewModel.kt", l = {64}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class n7 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ k7 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(k7 k7Var, a71.c cVar) {
        super(2, cVar);
        this.w = k7Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new n7(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            k7 k7Var = this.w;
            zk.s0 s0Var = k7Var.s;
            oa.j d = k7Var.u.d();
            j7 j7Var = new j7(k7Var, 1);
            s0Var.getClass();
            y71.y yVar = new y71.y(new l7(k7Var, null), b31.b.J(((z01.i1) s0Var.a.a(d)).b(), d, j7Var));
            m7 m7Var = new m7(k7Var);
            this.v = 1;
            if (yVar.b(m7Var, this) == aVar) {
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
