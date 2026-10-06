package com.github.rudroid.comment;

import com.github.rudroid.utilities.ui.g1;
import y71.w1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class e0 extends b {

    /* renamed from: s, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f8909s;

    /* renamed from: t, reason: collision with root package name */
    public zk.o f8910t;

    /* renamed from: u, reason: collision with root package name */
    public y1 f8911u;

    /* renamed from: v, reason: collision with root package name */
    public y71.i1 f8912v;

    public e0(com.github.rudroid.activities.util.c cVar, zk.o oVar) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(oVar, "dismissPullRequestReviewUseCase");
        this.f8909s = cVar;
        this.f8910t = oVar;
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        y1 c10 = y71.n1.c(g1.a.a());
        this.f8911u = c10;
        this.f8912v = new y71.i1(c10);
    }

    @Override // com.github.rudroid.comment.b
    public final void P(String str, yz0.q0 q0Var) {
        k71.k.g(q0Var, "commentType");
        k71.k.g(str, "body");
        if (!(q0Var instanceof yz0.o0)) {
            throw new IllegalStateException(("Unsupported comment type for review dismissal: " + q0Var).toString());
        }
        yz0.o0 o0Var = (yz0.o0) q0Var;
        String str2 = o0Var.s;
        k71.k.g(str2, "reviewId");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new d0(this, str2, str, o0Var, null), 3);
    }

    @Override // com.github.rudroid.comment.b
    public final w1 x() {
        return this.f8912v;
    }
}
