package com.github.rudroid.repository.fork;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.h2;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.u0;
import java.util.concurrent.CancellationException;
import v71.a0;
import v71.b0;
import v71.q1;
import y71.i1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class j extends k1 implements com.github.rudroid.utilities.viewmodel.b {
    public static final a Companion = new a();
    public y1 A;
    public i1 B;
    public q1 C;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c f19727s;

    /* renamed from: t, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f19728t;

    /* renamed from: u, reason: collision with root package name */
    public ml.j f19729u;

    /* renamed from: v, reason: collision with root package name */
    public sl.a f19730v;

    /* renamed from: w, reason: collision with root package name */
    public String f19731w;

    /* renamed from: x, reason: collision with root package name */
    public String f19732x;

    /* renamed from: y, reason: collision with root package name */
    public y1 f19733y;

    /* renamed from: z, reason: collision with root package name */
    public y1 f19734z;

    public static final class a {
    }

    public j(com.github.rudroid.activities.util.c cVar, ml.j jVar, sl.a aVar, oa.m mVar, a1 a1Var) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(jVar, "fetchRepositoryIdUseCase");
        k71.k.g(aVar, "forkRepositoryUseCase");
        k71.k.g(mVar, "userManager");
        k71.k.g(a1Var, "savedStateHandle");
        this.f19727s = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar);
        this.f19728t = cVar;
        this.f19729u = jVar;
        this.f19730v = aVar;
        String str = (String) h2.a(a1Var, "EXTRA_PARENT_REPOSITORY_NAME");
        this.f19731w = str;
        String str2 = (String) h2.a(a1Var, "EXTRA_PARENT_REPOSITORY_OWNER");
        this.f19732x = str2;
        y1 c10 = n1.c(new of.a(str2, str, (String) h2.a(a1Var, "EXTRA_REPOSITORY_DEFAULT_BRANCH_NAME"), str, (String) h2.a(a1Var, "EXTRA_REPOSITORY_DESCRIPTION"), true));
        this.f19733y = c10;
        g1.Companion.getClass();
        y1 c11 = n1.c(g1.a.a());
        this.f19734z = c11;
        y1 c12 = n1.c(new u0((Object) null));
        this.A = c12;
        this.B = n1.G(n1.l(c10, c11, c12, new r(4, null)), d1.k(this), y71.q1.a(3), new of.b((of.a) c10.getValue(), g1.a.a(), new u0((Object) null)));
        q1 q1Var = this.C;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.C = b0.z(d1.k(this), (a71.h) null, (a0) null, new n(this, null), 3);
    }

    public final void P(y71.g1 g1Var, fl.b bVar, boolean z10) {
        k71.k.g(g1Var, "<this>");
        k71.k.g(bVar, "executionError");
        this.f19727s.a(g1Var, bVar, z10);
    }
}
