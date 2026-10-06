package com.github.rudroid.comment;

import com.github.rudroid.utilities.ui.g1;
import y71.w1;
import y71.y1;
import zk.b2;

/* loaded from: /home/user/work/p/classes.dex */
public final class n1 extends b {
    public y1 A;
    public y71.i1 B;

    /* renamed from: s, reason: collision with root package name */
    public hj.a f8967s;

    /* renamed from: t, reason: collision with root package name */
    public hj.c f8968t;

    /* renamed from: u, reason: collision with root package name */
    public hj.h f8969u;

    /* renamed from: v, reason: collision with root package name */
    public hj.i f8970v;

    /* renamed from: w, reason: collision with root package name */
    public hj.g f8971w;

    /* renamed from: x, reason: collision with root package name */
    public zk.y1 f8972x;

    /* renamed from: y, reason: collision with root package name */
    public b2 f8973y;

    /* renamed from: z, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f8974z;

    public n1(hj.a aVar, hj.c cVar, hj.h hVar, hj.i iVar, hj.g gVar, zk.y1 y1Var, b2 b2Var, com.github.rudroid.activities.util.c cVar2) {
        k71.k.g(aVar, "addCommentUseCase");
        k71.k.g(cVar, "addReviewThreadReplyUseCase");
        k71.k.g(hVar, "updateReviewCommentUseCase");
        k71.k.g(iVar, "updateReviewUseCase");
        k71.k.g(gVar, "updateCommentUseCase");
        k71.k.g(y1Var, "updateIssueUseCase");
        k71.k.g(b2Var, "updatePullRequestUseCase");
        k71.k.g(cVar2, "accountHolder");
        this.f8967s = aVar;
        this.f8968t = cVar;
        this.f8969u = hVar;
        this.f8970v = iVar;
        this.f8971w = gVar;
        this.f8972x = y1Var;
        this.f8973y = b2Var;
        this.f8974z = cVar2;
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        y1 c10 = y71.n1.c(g1.a.a());
        this.A = c10;
        this.B = new y71.i1(c10);
    }

    @Override // com.github.rudroid.comment.b
    public final void P(String str, yz0.q0 q0Var) {
        k71.k.g(q0Var, "commentType");
        k71.k.g(str, "body");
        if (q0Var instanceof yz0.e0) {
            Q(((yz0.e0) q0Var).s, str, q0Var);
            return;
        }
        if (q0Var instanceof yz0.d0) {
            String str2 = ((yz0.d0) q0Var).s;
            k71.k.g(str2, "commentId");
            v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new g1(this, str2, str, q0Var, null), 3);
            return;
        }
        if (q0Var instanceof yz0.a0) {
            S(((yz0.a0) q0Var).s, str, q0Var, false);
            return;
        }
        if (q0Var instanceof yz0.b0) {
            S(((yz0.b0) q0Var).s, str, q0Var, true);
            return;
        }
        if (q0Var instanceof yz0.m0) {
            R(((yz0.m0) q0Var).s, str, q0Var);
            return;
        }
        if (q0Var instanceof yz0.l0) {
            T(((yz0.l0) q0Var).s, str, q0Var);
            return;
        }
        if (q0Var instanceof yz0.k0) {
            String str3 = ((yz0.k0) q0Var).s;
            k71.k.g(str3, "commentId");
            v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new j1(this, str3, str, q0Var, null), 3);
        } else {
            if (q0Var instanceof yz0.g0) {
                T(((yz0.g0) q0Var).s, str, q0Var);
                return;
            }
            if (q0Var instanceof yz0.i0) {
                R(((yz0.i0) q0Var).s, str, q0Var);
            } else if (q0Var instanceof yz0.h0) {
                Q(((yz0.h0) q0Var).s, str, q0Var);
            } else {
                throw new IllegalStateException(("Unsupported comment type for triage: " + q0Var).toString());
            }
        }
    }

    public final void Q(String str, String str2, yz0.q0 q0Var) {
        k71.k.g(q0Var, "commentType");
        k71.k.g(str, "issueOrPullRequestId");
        k71.k.g(str2, "body");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new v0(this, str, str2, q0Var, null), 3);
    }

    public final void R(String str, String str2, yz0.q0 q0Var) {
        k71.k.g(q0Var, "commentType");
        k71.k.g(str, "threadId");
        k71.k.g(str2, "body");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new y0(this, str, str2, q0Var, null), 3);
    }

    public final void S(String str, String str2, yz0.q0 q0Var, boolean z10) {
        k71.k.g(q0Var, "commentType");
        k71.k.g(str, "issueOrPullRequestId");
        k71.k.g(str2, "body");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new d1(z10, this, str, str2, q0Var, null), 3);
    }

    public final void T(String str, String str2, yz0.q0 q0Var) {
        k71.k.g(q0Var, "commentType");
        k71.k.g(str, "commentId");
        k71.k.g(str2, "body");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new m1(this, str, str2, q0Var, null), 3);
    }

    @Override // com.github.rudroid.comment.b
    public final w1 x() {
        return this.B;
    }
}
