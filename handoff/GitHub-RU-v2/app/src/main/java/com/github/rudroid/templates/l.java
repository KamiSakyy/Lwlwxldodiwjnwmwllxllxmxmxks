package com.github.rudroid.templates;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.h2;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.w0;
import java.util.Map;
import v71.a0;
import v71.b0;
import y71.i1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l extends k1 {
    public static final a Companion = new a();
    public final bn.b s;
    public final com.github.rudroid.activities.util.c t;
    public final y1 u;
    public final i1 v;
    public final String w;
    public final String x;
    public final String y;
    public final Map z;

    public static final class a {
    }

    public l(bn.b bVar, com.github.rudroid.activities.util.c cVar, a1 a1Var) {
        k71.k.g(bVar, "fetchIssueTemplatesUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.s = bVar;
        this.t = cVar;
        y1 c = n1.c(g1.a.c(g1.Companion));
        this.u = c;
        this.v = w0.f(new i1(c), d1.k(this), new k(this, 0));
        this.w = (String) h2.a(a1Var, "EXTRA_REPO_OWNER");
        this.x = (String) h2.a(a1Var, "EXTRA_REPO_NAME");
        this.y = (String) a1Var.a("EXTRA_PARENT_ISSUE_ID");
        this.z = (Map) a1Var.a("EXTRA_REPO_QUERY");
        P();
    }

    public final void P() {
        b0.z(d1.k(this), (a71.h) null, (a0) null, new o(this, null), 3);
    }
}
