package com.github.rudroid.repositories.repositoryownerrepositories;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.profile.status.ui.y;
import com.github.rudroid.utilities.h2;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.w0;
import java.util.concurrent.CancellationException;
import v71.a0;
import v71.b0;
import v71.q1;
import y71.i1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class g extends k1 implements com.github.rudroid.utilities.viewmodel.b {
    public static final a Companion = new a();
    public q1 A;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c f19129s;

    /* renamed from: t, reason: collision with root package name */
    public final com.github.rudroid.activities.util.c f19130t;

    /* renamed from: u, reason: collision with root package name */
    public final ll.f f19131u;

    /* renamed from: v, reason: collision with root package name */
    public final String f19132v;

    /* renamed from: w, reason: collision with root package name */
    public final y1 f19133w;

    /* renamed from: x, reason: collision with root package name */
    public final y1 f19134x;

    /* renamed from: y, reason: collision with root package name */
    public final y1 f19135y;

    /* renamed from: z, reason: collision with root package name */
    public final i1 f19136z;

    public static final class a {
    }

    public g(com.github.rudroid.activities.util.c cVar, ll.f fVar, ll.e eVar, ll.g gVar, oa.m mVar, a1 a1Var) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(fVar, "observeRepositoryOwnerRepositoriesUseCase");
        k71.k.g(eVar, "loadRepositoryOwnerRepositoriesPageUseCase");
        k71.k.g(gVar, "refreshRepositoryOwnerRepositoriesUseCase");
        k71.k.g(mVar, "userManager");
        k71.k.g(a1Var, "savedStateHandle");
        this.f19129s = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar);
        this.f19130t = cVar;
        this.f19131u = fVar;
        this.f19132v = (String) h2.a(a1Var, "EXTRA_REPOSITORY_OWNER");
        y1 c10 = n1.c("");
        this.f19133w = c10;
        this.f19134x = n1.c("");
        y1 c11 = n1.c(g1.a.c(g1.Companion));
        this.f19135y = c11;
        this.f19136z = w0.f(c11, d1.k(this), new y(23));
        q1 q1Var = this.A;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.A = b0.z(d1.k(this), (a71.h) null, (a0) null, new n(this, null), 3);
        n1.A(new y71.y(new y00.l(n1.o(c10, 250L), 10), new h(this, null), 6), d1.k(this));
    }

    public final void P(String str) {
        k71.k.g(str, "query");
        y1 y1Var = this.f19133w;
        y1Var.getClass();
        y1Var.k((Object) null, str);
    }
}
