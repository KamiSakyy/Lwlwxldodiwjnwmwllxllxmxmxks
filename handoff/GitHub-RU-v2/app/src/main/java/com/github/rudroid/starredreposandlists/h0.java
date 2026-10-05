package com.github.rudroid.starredreposandlists;

import com.github.rudroid.starredreposandlists.navigation.StarredReposAndListsRoute;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.viewmodels.v3;
import java.util.concurrent.CancellationException;
import v71.q1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 extends androidx.lifecycle.k1 implements v3 {
    public static final /* synthetic */ r71.e[] C;
    public final y1 A;
    public final y71.i1 B;
    public final ll.d s;
    public final lm.m t;
    public final com.github.rudroid.activities.util.c u;
    public final w v;
    public final StarredReposAndListsRoute w;
    public x01.i x;
    public final g0 y;
    public q1 z;

    static {
        r71.e mVar = new k71.m(h0.class, "searchQuery", "getSearchQuery()Ljava/lang/String;", 0);
        k71.x.a.getClass();
        C = new r71.e[]{mVar};
    }

    public h0(ll.d dVar, lm.m mVar, com.github.rudroid.activities.util.c cVar, w wVar, androidx.lifecycle.a1 a1Var) {
        k71.k.g(dVar, "fetchStarredRepositoriesUseCase");
        k71.k.g(mVar, "watchUserListsUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.s = dVar;
        this.t = mVar;
        this.u = cVar;
        this.v = wVar;
        this.w = (StarredReposAndListsRoute) sy.y.m(a1Var, k71.x.a(StarredReposAndListsRoute.class), x61.s.r);
        x01.i.Companion.getClass();
        this.x = x01.i.d;
        this.y = new g0(this);
        y1 c = n1.c(g1.a.c(com.github.rudroid.utilities.ui.g1.Companion));
        this.A = c;
        this.B = com.github.rudroid.utilities.w0.f(c, androidx.lifecycle.d1.k(this), new y(this, 0));
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final void D() {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new f0(this, null), 3);
    }

    public final void P(com.github.rudroid.utilities.ui.s0 s0Var) {
        q1 q1Var = this.z;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.z = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new c0(this, s0Var, null), 3);
    }

    public final void Q(xz0.h hVar) {
        k71.k.g(hVar, "newListData");
        y1 y1Var = this.A;
        com.github.rudroid.utilities.ui.g1 h = com.github.rudroid.utilities.ui.h1.h((com.github.rudroid.utilities.ui.g1) y1Var.getValue(), new com.github.rudroid.fragments.onboarding.notifications.viewmodel.z(29, hVar));
        y1Var.getClass();
        y1Var.k((Object) null, h);
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final boolean a() {
        return com.github.rudroid.utilities.ui.h1.g((com.github.rudroid.utilities.ui.g1) this.A.getValue()) && this.x.a();
    }
}
