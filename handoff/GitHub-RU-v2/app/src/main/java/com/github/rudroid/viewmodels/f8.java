package com.github.rudroid.viewmodels;

import java.util.Set;

@c71.e(c = "com.github.rudroid.viewmodels.SubIssuesViewModel$onExpandSubIssues$2", f = "SubIssuesViewModel.kt", l = {146}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f8 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ g8 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ Set y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(g8 g8Var, String str, Set set, int i, a71.c cVar) {
        super(2, cVar);
        this.w = g8Var;
        this.x = str;
        this.y = set;
        this.z = i;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new f8(this.w, this.x, this.y, this.z, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            g8 g8Var = this.w;
            zk.c0 c0Var = g8Var.t;
            oa.j d = g8Var.v.d();
            z7 z7Var = new z7(g8Var, 3);
            c0Var.getClass();
            String str = this.x;
            k71.k.g(str, "issueId");
            y71.y yVar = new y71.y(new d8(g8Var, str, null), b31.b.J(((z01.h0) c0Var.a.a(d)).q(str), d, z7Var));
            e8 e8Var = new e8(g8Var, this.y, str, this.z);
            this.v = 1;
            if (yVar.b(e8Var, this) == aVar) {
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
