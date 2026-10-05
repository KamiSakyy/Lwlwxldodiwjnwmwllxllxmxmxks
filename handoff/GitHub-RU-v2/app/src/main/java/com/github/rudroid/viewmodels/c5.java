package com.github.rudroid.viewmodels;

import android.app.Application;
import com.github.rudroid.navigation.PullRequestReviewRoute;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.viewmodel.d;
import com.github.service.models.ApiFailure;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c5 extends androidx.lifecycle.a implements com.github.rudroid.utilities.viewmodel.d {
    public final bj.g A;
    public final zk.d0 B;
    public final hj.e C;
    public final com.github.rudroid.activities.util.c D;
    public final a4 E;
    public final PullRequestReviewRoute F;
    public final y71.y1 G;
    public final y71.y1 H;
    public final y71.y1 I;
    public final LinkedHashSet J;
    public v71.q1 K;
    public v71.q1 L;
    public final /* synthetic */ d.a t;
    public final zk.q0 u;
    public final zk.e1 v;
    public final zk.l1 w;
    public final zk.t1 x;
    public final kj.g y;
    public final kj.g0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(Application application, zk.q0 q0Var, zk.e1 e1Var, zk.l1 l1Var, zk.t1 t1Var, kj.g gVar, kj.g0 g0Var, bj.g gVar2, zk.d0 d0Var, hj.e eVar, com.github.rudroid.activities.util.c cVar, a4 a4Var, androidx.lifecycle.a1 a1Var) {
        super(application);
        k71.k.g(q0Var, "observePullRequestReviewUseCase");
        k71.k.g(e1Var, "refreshPullRequestReviewUseCase");
        k71.k.g(l1Var, "resolveReviewThreadUseCase");
        k71.k.g(t1Var, "unResolveReviewThreadUseCase");
        k71.k.g(gVar, "addReactionUseCase");
        k71.k.g(g0Var, "removeReactionUseCase");
        k71.k.g(gVar2, "unblockFromOrgUseCase");
        k71.k.g(d0Var, "fetchTimelineItemIdUseCase");
        k71.k.g(eVar, "deleteReviewCommentUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.t = new d.a();
        this.u = q0Var;
        this.v = e1Var;
        this.w = l1Var;
        this.x = t1Var;
        this.y = gVar;
        this.z = g0Var;
        this.A = gVar2;
        this.B = d0Var;
        this.C = eVar;
        this.D = cVar;
        this.E = a4Var;
        k71.e a = k71.x.a(PullRequestReviewRoute.class);
        x61.s sVar = x61.s.r;
        this.F = (PullRequestReviewRoute) sy.y.m(a1Var, a, sVar);
        this.G = y71.n1.c(sVar);
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        this.H = y71.n1.c(new com.github.rudroid.utilities.ui.u0(null));
        this.I = y71.n1.c((Object) null);
        this.J = new LinkedHashSet();
    }

    public final y71.w1 Q(yz0.r3 r3Var) {
        k71.k.g(r3Var, "reaction");
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        y71.y1 c = y71.n1.c(new com.github.rudroid.utilities.ui.u0(w61.a0.a));
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new e4(this, r3Var, c, null), 3);
        return c;
    }

    public final void R(String str, String str2, boolean z) {
        k71.k.g(str, "commentId");
        k71.k.g(str2, "threadId");
        y71.y1 y1Var = this.G;
        Map y = x61.x.y((Map) y1Var.getValue(), new w61.k(str, Boolean.valueOf(z)));
        y1Var.getClass();
        y1Var.k((Object) null, y);
    }

    public final y71.y1 S(String str) {
        k71.k.g(str, "commentId");
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        y71.y1 c = y71.n1.c(new com.github.rudroid.utilities.ui.u0(w61.a0.a));
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new h4(this, str, c, null), 3);
        return c;
    }

    public final void T() {
        PullRequestReviewRoute pullRequestReviewRoute = this.F;
        String str = pullRequestReviewRoute.r;
        if (str != null) {
            U(str);
            return;
        }
        String str2 = pullRequestReviewRoute.s;
        if (str2 == null) {
            throw new IllegalStateException("Invalid State, no repositoryOwner.");
        }
        String str3 = pullRequestReviewRoute.t;
        if (str3 == null) {
            throw new IllegalStateException("Invalid State, no repositoryName.");
        }
        int i = pullRequestReviewRoute.u;
        String str4 = pullRequestReviewRoute.v;
        if (str4 == null) {
            throw new IllegalStateException("Invalid State, no deeplinkUrl.");
        }
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new l4(this, str2, str3, i, str4, null), 3);
    }

    public final void U(String str) {
        k71.k.g(str, "reviewId");
        v71.q1 q1Var = this.K;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.K = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new o4(this, str, null), 3);
    }

    public final void V() {
        v71.q1 q1Var = this.L;
        if (q1Var == null || !q1Var.f()) {
            this.L = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new r4(this, null), 3);
        }
    }

    public final y71.w1 W(yz0.r3 r3Var) {
        k71.k.g(r3Var, "reaction");
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        y71.y1 c = y71.n1.c(new com.github.rudroid.utilities.ui.u0(w61.a0.a));
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new u4(this, r3Var, c, null), 3);
        return c;
    }

    public final void X(String str) {
        k71.k.g(str, "threadId");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new w4(this, str, null), 3);
    }

    public final void Y(String str) {
        k71.k.g(str, "threadId");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new y4(this, str, null), 3);
    }

    public final y71.y1 Z(String str, String str2) {
        k71.k.g(str, "userId");
        k71.k.g(str2, "organizationId");
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        w61.a0 a0Var = w61.a0.a;
        y71.y1 c = y71.n1.c(new com.github.rudroid.utilities.ui.u0(a0Var));
        yz0.l3 l3Var = (yz0.l3) this.I.getValue();
        String str3 = l3Var != null ? l3Var.a : null;
        if (str3 != null) {
            v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new b5(this, str, str2, str3, c, null), 3);
            return c;
        }
        c.k((Object) null, g1.a.b(new fl.b(fl.c.D, (String) null, (Integer) 0, (Map) null, this.D.d(), (ApiFailure) null, 104), a0Var));
        return c;
    }
}
