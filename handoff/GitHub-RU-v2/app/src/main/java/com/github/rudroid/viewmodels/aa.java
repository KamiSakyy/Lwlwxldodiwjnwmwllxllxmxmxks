package com.github.rudroid.viewmodels;

import com.github.rudroid.viewmodels.t9;
import kotlin.NoWhenBranchMatchedException;

@c71.e(c = "com.github.rudroid.viewmodels.TriageReviewersViewModel$loadNextPage$1", f = "TriageReviewersViewModel.kt", l = {363, 391}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class aa extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ t9 w;
    public final /* synthetic */ String x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(t9 t9Var, String str, a71.c cVar) {
        super(2, cVar);
        this.w = t9Var;
        this.x = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new aa(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r14.b(r1, r13) == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0085, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
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
                y71.y a = t9Var.u.a(cVar.d(), t9Var.L, this.x, t9Var.l().b, new u9(t9Var, 2));
                y9 y9Var = new y9(t9Var);
                this.v = 1;
            } else {
                if (!k71.k.b(bVar, t9.b.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                y71.y a2 = t9Var.v.a(cVar.d(), t9Var.L, t9Var.K, t9Var.M, this.x, t9Var.l().b, new u9(t9Var, 3));
                z9 z9Var = new z9(t9Var);
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
