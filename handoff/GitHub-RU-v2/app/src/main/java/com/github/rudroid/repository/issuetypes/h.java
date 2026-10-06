package com.github.rudroid.repository.issuetypes;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.h2;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.u0;
import com.github.rudroid.utilities.w0;
import com.github.service.models.response.issueorpullrequest.IssueType;
import java.util.concurrent.CancellationException;
import v71.a0Shadow;
import v71.b0;
import v71.q1;
import y71.i1;
import y71.n1Shadow;
import y71.y1;
import zk.w1;

/* loaded from: /home/user/work/p/classes.dex */
public final class h extends k1 implements com.github.rudroid.utilities.viewmodel.b {
    public static final a Companion = new a();
    public String A;
    public String B;
    public d C;
    public y1 D;
    public y1 E;
    public y1 F;
    public i1 G;
    public q1 H;
    public q1 I;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c f19936s;

    /* renamed from: t, reason: collision with root package name */
    public ul.b f19937t;

    /* renamed from: u, reason: collision with root package name */
    public ul.a f19938u;

    /* renamed from: v, reason: collision with root package name */
    public ul.c f19939v;

    /* renamed from: w, reason: collision with root package name */
    public w1 f19940w;

    /* renamed from: x, reason: collision with root package name */
    public f f19941x;

    /* renamed from: y, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f19942y;

    /* renamed from: z, reason: collision with root package name */
    public String f19943z;

    public static final class a {
    }

    public h(a1 a1Var, oa.m mVar, ul.b bVar, ul.a aVar, ul.c cVar, w1 w1Var, f fVar, com.github.rudroid.activities.util.c cVar2) {
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(mVar, "userManager");
        k71.k.g(bVar, "observeRepositoryIssueTypesUseCase");
        k71.k.g(aVar, "loadRepositoryIssueTypesPageUseCase");
        k71.k.g(cVar, "refreshRepositoryIssueTypesUseCase");
        k71.k.g(w1Var, "updateIssueIssueTypeUseCase");
        k71.k.g(cVar2, "accountHolder");
        this.f19936s = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar);
        this.f19937t = bVar;
        this.f19938u = aVar;
        this.f19939v = cVar;
        this.f19940w = w1Var;
        this.f19941x = fVar;
        this.f19942y = cVar2;
        this.f19943z = (String) h2.a(a1Var, "KEY_REPOSITORY_NAME");
        this.A = (String) h2.a(a1Var, "KEY_REPOSITORY_OWNER");
        IssueType issueType = (IssueType) a1Var.a("KEY_ORIGINAL_SELECTED_ISSUE_TYPE");
        this.B = (String) a1Var.a("KEY_ISSUE_ID");
        this.C = (d) h2.a(a1Var, "KEY_BOTTOM_SHEET_CONFIGURATION");
        P();
        y1 c10 = n1Shadow.c(g1.a.c(g1.Companion));
        this.D = c10;
        y1 c11 = n1Shadow.c(g1.a.a());
        this.E = c11;
        y1 c12 = n1Shadow.c(issueType);
        this.F = c12;
        this.G = n1Shadow.G(n1Shadow.l(c10, c12, c11, new u(this, null)), d1.k(this), y71.q1.a(3), new u0((Object) null));
    }

    public final void P() {
        q1 q1Var = this.H;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        q1 q1Var2 = this.I;
        if (q1Var2 != null) {
            q1Var2.m((CancellationException) null);
        }
        this.H = b0.z(d1.k(this), (a71.h) null, (a0Shadow) null, new n(this, null), 3);
    }

    public final void Q() {
        if (this.B != null) {
            b0.z(d1.k(this), (a71.h) null, (a0Shadow) null, new q(this, null), 3);
        } else {
            w0.p(this.E, this.F.getValue());
        }
    }

    public final void R(y71.g1 g1Var, fl.b bVar, boolean z10) {
        k71.k.g(g1Var, "<this>");
        k71.k.g(bVar, "executionError");
        this.f19936s.a(g1Var, bVar, z10);
    }
}
