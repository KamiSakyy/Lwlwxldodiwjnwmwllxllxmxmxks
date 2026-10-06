package com.github.rudroid.viewmodels;

import android.net.Uri;
import android.os.Bundle;
import com.github.rudroid.utilities.ui.g1;
import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e2 extends androidx.lifecycle.k1 implements v3, com.github.rudroid.utilities.viewmodel.b {
    public static final a Companion;
    public static final /* synthetic */ r71.e[] H;
    public y71.i1 A;
    public n2 B;
    public boolean C;
    public boolean D;
    public String E;
    public v71.q1 F;
    public v71.q1 G;
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c s;
    public androidx.lifecycle.a1 t;
    public zk.g0 u;
    public zk.h0 v;
    public zk.f0 w;
    public com.github.rudroid.activities.util.c x;
    public b2 y;
    public y71.y1 z;

    public static final class a {
        public static void a(String str, String str2, Bundle bundle) {
            k71.k.g(str, "repositoryOwner");
            k71.k.g(str2, "repositoryName");
            bundle.putString("EXTRA_REPO_OWNER", str);
            bundle.putString("EXTRA_REPO_NAME", str2);
            bundle.putBoolean("EXTRA_REPO_SHOW_PINNED_ISSUES", true);
        }
    }

    static {
        r71.e mVar = new k71.m(e2.class, "query", "getQuery()Ljava/lang/String;", 0);
        k71.x.a.getClass();
        H = new r71.e[]{mVar};
        Companion = new a();
    }

    public e2(androidx.lifecycle.a1 a1Var, zk.g0 g0Var, zk.h0 h0Var, zk.f0 f0Var, com.github.rudroid.activities.util.c cVar, b2 b2Var, oa.m mVar) {
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(g0Var, "observerUseCase");
        k71.k.g(h0Var, "refreshUseCase");
        k71.k.g(f0Var, "loadPageUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(mVar, "userManager");
        this.s = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar);
        this.t = a1Var;
        this.u = g0Var;
        this.v = h0Var;
        this.w = f0Var;
        this.x = cVar;
        this.y = b2Var;
        y71.y1 c = y71.n1.c(g1.a.c(com.github.rudroid.utilities.ui.g1.Companion));
        this.z = c;
        this.A = com.github.rudroid.utilities.w0.f(c, androidx.lifecycle.d1.k(this), new d2(this, 0));
        this.B = new n2(this);
        this.E = "";
    }

    public static final String P(e2 e2Var, String str) {
        String g;
        if (e2Var.T() == null || e2Var.S() == null) {
            g = f1.e.g("archived:false ", str);
        } else {
            StringBuilder o = a0.s0.o("repo:", e2Var.T(), "/", e2Var.S(), " ");
            o.append(str);
            g = o.toString();
        }
        return t71.p.t0(g).toString();
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final void D() {
        v71.q1 q1Var = this.G;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.G = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new j2(this, null), 3);
    }

    public final String Q() {
        if (T() == null || S() == null) {
            return "";
        }
        String uri = new Uri.Builder().scheme("https").authority(com.google.common.util.concurrent.a.v(this.x.d())).appendPath(T()).appendPath(S()).appendPath("issues").build().toString();
        k71.k.d(uri);
        return uri;
    }

    public final String R() {
        return (String) this.B.t(this, H[0]);
    }

    public final String S() {
        return (String) this.t.a("EXTRA_REPO_NAME");
    }

    public final String T() {
        return (String) this.t.a("EXTRA_REPO_OWNER");
    }

    public final void U() {
        if (!k71.k.b(R(), this.E)) {
            v71.q1 q1Var = this.F;
            if (q1Var != null) {
                q1Var.m((CancellationException) null);
            }
            com.github.rudroid.utilities.ui.u0 c = g1.a.c(com.github.rudroid.utilities.ui.g1.Companion);
            y71.y1 y1Var = this.z;
            y1Var.getClass();
            y1Var.k((Object) null, c);
        }
        v71.q1 q1Var2 = this.F;
        if (q1Var2 == null || !q1Var2.f()) {
            v71.q1 q1Var3 = this.G;
            if (q1Var3 != null) {
                q1Var3.m((CancellationException) null);
            }
            this.F = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new g2(this, null), 3);
            this.E = R();
        }
    }

    public final void V() {
        v71.q1 q1Var = this.G;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        v71.q1 q1Var2 = this.F;
        if (q1Var2 == null || !q1Var2.f()) {
            U();
        } else {
            this.G = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new m2(this, null), 3);
        }
    }

    public final void W(String str) {
        k71.k.g(str, "<set-?>");
        this.B.y(str, H[0]);
    }

    public final void X(y71.g1 g1Var, fl.b bVar, boolean z) {
        k71.k.g(g1Var, "<this>");
        k71.k.g(bVar, "executionError");
        this.s.a(g1Var, bVar, z);
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final boolean a() {
        yz0.e4 e4Var;
        y71.y1 y1Var = this.z;
        return com.github.rudroid.utilities.ui.h1.g((com.github.rudroid.utilities.ui.g1) y1Var.getValue()) && (e4Var = (yz0.e4) ((com.github.rudroid.utilities.ui.g1) y1Var.getValue()).getData()) != null && e4Var.c.a();
    }
}
