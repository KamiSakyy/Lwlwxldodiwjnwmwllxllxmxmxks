package com.github.rudroid.viewmodels;

import android.net.Uri;
import com.github.rudroid.utilities.ui.g1;
import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a6 extends androidx.lifecycle.k1 implements v3, com.github.rudroid.utilities.viewmodel.b {
    public static final a Companion;
    public static final /* synthetic */ r71.e[] K;
    public final y71.y1 A;
    public final boolean B;
    public final y71.y1 C;
    public final y71.i1 D;
    public x01.i E;
    public final l6 F;
    public final String G;
    public String H;
    public v71.q1 I;
    public v71.q1 J;
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c s;
    public final androidx.lifecycle.a1 t;
    public final zk.y0 u;
    public final zk.z0 v;
    public final zk.x0 w;
    public final ml.i x;
    public final com.github.rudroid.activities.util.c y;
    public final y3 z;

    public static final class a {
    }

    static {
        r71.e mVar = new k71.m(a6.class, "query", "getQuery()Ljava/lang/String;", 0);
        k71.x.a.getClass();
        K = new r71.e[]{mVar};
        Companion = new a();
    }

    public a6(androidx.lifecycle.a1 a1Var, zk.y0 y0Var, zk.z0 z0Var, zk.x0 x0Var, ml.i iVar, com.github.rudroid.activities.util.c cVar, y3 y3Var, oa.m mVar) {
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(y0Var, "observerUseCase");
        k71.k.g(z0Var, "refreshUseCase");
        k71.k.g(x0Var, "loadPageUseCase");
        k71.k.g(iVar, "fetchRepositoryEmptyAndArchivedStatusUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(mVar, "userManager");
        this.s = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar);
        this.t = a1Var;
        this.u = y0Var;
        this.v = z0Var;
        this.w = x0Var;
        this.x = iVar;
        this.y = cVar;
        this.z = y3Var;
        this.A = y71.n1.c(g1.a.c(com.github.rudroid.utilities.ui.g1.Companion));
        Boolean bool = (Boolean) a1Var.a("EXTRA_HIDE_CREATE_PR_ENTRY");
        this.B = bool != null ? bool.booleanValue() : false;
        y71.y1 c = y71.n1.c(Boolean.FALSE);
        this.C = c;
        this.D = new y71.i1(c);
        this.E = new x01.i((String) null, false, true);
        this.F = new l6(this);
        this.G = (String) a1Var.a("EXTRA_REPO_OWNER");
        this.H = "";
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new z5(this, null), 3);
    }

    public static final String P(a6 a6Var, String str) {
        String g;
        String str2 = a6Var.G;
        if (str2 == null || a6Var.T() == null) {
            g = f1.e.g("archived:false ", str);
        } else {
            StringBuilder o = a0.s0.o("repo:", str2, "/", a6Var.T(), " ");
            o.append(str);
            g = o.toString();
        }
        return t71.p.t0(g).toString();
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final void D() {
        v71.q1 q1Var = this.J;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.J = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new h6(this, null), 3);
    }

    public final String Q() {
        String str = this.G;
        if (str == null || T() == null) {
            return "";
        }
        String uri = new Uri.Builder().scheme("https").authority(com.google.common.util.concurrent.a.v(this.y.d())).appendPath(str).appendPath(T()).appendPath("pulls").build().toString();
        k71.k.d(uri);
        return uri;
    }

    public final y71.w1 R() {
        return com.github.rudroid.utilities.w0.f(this.A, androidx.lifecycle.d1.k(this), new x5(this, 0));
    }

    public final String S() {
        return (String) this.F.t(this, K[0]);
    }

    public final String T() {
        return (String) this.t.a("EXTRA_REPO_NAME");
    }

    public final void U() {
        if (!k71.k.b(S(), this.H)) {
            v71.q1 q1Var = this.I;
            if (q1Var != null) {
                q1Var.m((CancellationException) null);
            }
            com.github.rudroid.utilities.ui.u0 c = g1.a.c(com.github.rudroid.utilities.ui.g1.Companion);
            y71.y1 y1Var = this.A;
            y1Var.getClass();
            y1Var.k((Object) null, c);
        }
        v71.q1 q1Var2 = this.I;
        if (q1Var2 == null || !q1Var2.f()) {
            v71.q1 q1Var3 = this.J;
            if (q1Var3 != null) {
                q1Var3.m((CancellationException) null);
            }
            this.I = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new e6(this, null), 3);
            this.H = S();
        }
    }

    public final void V() {
        v71.q1 q1Var = this.J;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        v71.q1 q1Var2 = this.I;
        if (q1Var2 == null || !q1Var2.f()) {
            U();
        } else {
            this.J = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new k6(this, null), 3);
        }
    }

    public final void W(String str) {
        k71.k.g(str, "<set-?>");
        this.F.y(str, K[0]);
    }

    public final void X(y71.g1 g1Var, fl.b bVar, boolean z) {
        k71.k.g(g1Var, "<this>");
        k71.k.g(bVar, "executionError");
        this.s.a(g1Var, bVar, z);
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final boolean a() {
        return com.github.rudroid.utilities.ui.h1.g((com.github.rudroid.utilities.ui.g1) this.A.getValue()) && this.E.a();
    }
}
