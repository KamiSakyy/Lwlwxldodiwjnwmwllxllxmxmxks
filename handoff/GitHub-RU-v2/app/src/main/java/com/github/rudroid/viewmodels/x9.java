package com.github.rudroid.viewmodels;

import com.github.rudroid.viewmodels.t9;
import kotlin.NoWhenBranchMatchedException;

@c71.e(c = "com.github.rudroid.viewmodels.TriageReviewersViewModel$loadHead$1", f = "TriageReviewersViewModel.kt", l = {296, 325}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class x9 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ t9 w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(t9 t9Var, String str, a71.c cVar) {
        super(2, cVar);
        this.w = t9Var;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new x9(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r14.b(r1, r13) == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (r14.b(r1, r13) == r2) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        t9 t9Var = this.w;
        com.github.rudroid.activities.util.c cVar = t9Var.w;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            t9.b bVar = t9Var.y;
            if (k71.k.b(bVar, t9.b.C0017b.b)) {
                y71.y a = t9Var.u.a(cVar.d(), t9Var.L, this.x, null, new u9(t9Var, 0));
                v9 v9Var = new v9(t9Var);
                this.v = 1;
            } else {
                if (!k71.k.b(bVar, t9.b.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                y71.y a2 = t9Var.v.a(cVar.d(), t9Var.L, t9Var.K, t9Var.M, this.x, null, new u9(t9Var, 1));
                w9 w9Var = new w9(t9Var);
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
