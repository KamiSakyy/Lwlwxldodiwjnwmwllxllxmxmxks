package com.github.rudroid.discussions;

import com.github.rudroid.utilities.ui.g1;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends com.github.rudroid.comment.b {
    public static final C0026a Companion = new C0026a();

    /* renamed from: s, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f11147s;

    /* renamed from: t, reason: collision with root package name */
    public ik.b f11148t;

    /* renamed from: u, reason: collision with root package name */
    public lk.a f11149u;

    /* renamed from: v, reason: collision with root package name */
    public ik.t0 f11150v;

    /* renamed from: w, reason: collision with root package name */
    public ik.p0 f11151w;

    /* renamed from: x, reason: collision with root package name */
    public y71.y1 f11152x;

    /* renamed from: y, reason: collision with root package name */
    public y71.i1 f11153y;

    /* renamed from: com.github.rudroid.discussions.a$a, reason: collision with other inner class name */
    public static final class C0026a {
    }

    public a(com.github.rudroid.activities.util.c cVar, ik.b bVar, lk.a aVar, ik.t0 t0Var, ik.p0 p0Var) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(bVar, "addDiscussionCommentUseCase");
        k71.k.g(aVar, "addReplyToDiscussionCommentUseCase");
        k71.k.g(t0Var, "updateDiscussionCommentUseCase");
        k71.k.g(p0Var, "updateDiscussionBodyUseCase");
        this.f11147s = cVar;
        this.f11148t = bVar;
        this.f11149u = aVar;
        this.f11150v = t0Var;
        this.f11151w = p0Var;
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        y71.y1 c10 = y71.n1.c(g1.a.a());
        this.f11152x = c10;
        this.f11153y = new y71.i1(c10);
    }

    @Override // com.github.rudroid.comment.b
    public final void P(String str, yz0.q0 q0Var) {
        k71.k.g(q0Var, "commentType");
        k71.k.g(str, "body");
        if (q0Var instanceof yz0.x) {
            String str2 = ((yz0.x) q0Var).s;
            k71.k.g(str2, "discussionId");
            v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new e(this, str2, str, q0Var, null), 3);
            return;
        }
        if (q0Var instanceof yz0.y) {
            yz0.y yVar = (yz0.y) q0Var;
            String str3 = yVar.s;
            String str4 = yVar.t;
            k71.k.g(str3, "discussionId");
            k71.k.g(str4, "parentCommentId");
            v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new h(this, str3, str, str4, q0Var, null), 3);
            return;
        }
        if (q0Var instanceof yz0.u) {
            Q(((yz0.u) q0Var).s, str, q0Var);
            return;
        }
        if (q0Var instanceof yz0.t) {
            String str5 = ((yz0.t) q0Var).s;
            k71.k.g(str5, "discussionId");
            v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new n(this, str5, str, q0Var, null), 3);
        } else if (q0Var instanceof yz0.w) {
            Q(((yz0.w) q0Var).u, str, q0Var);
        } else if (q0Var instanceof yz0.v) {
            Q(((yz0.v) q0Var).s, str, q0Var);
        } else {
            throw new IllegalStateException(("Unsupported comment type for discussion: " + q0Var).toString());
        }
    }

    public final void Q(String str, String str2, yz0.q0 q0Var) {
        k71.k.g(str, "commentId");
        k71.k.g(str2, "commentBody");
        k71.k.g(q0Var, "commentType");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new k(this, str, str2, q0Var, null), 3);
    }

    @Override // com.github.rudroid.comment.b
    public final y71.w1 x() {
        return this.f11153y;
    }
}
