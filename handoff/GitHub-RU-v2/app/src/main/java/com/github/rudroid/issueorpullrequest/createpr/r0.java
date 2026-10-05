package com.github.rudroid.issueorpullrequest.createpr;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.h2;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import y71.i1;
import y71.n1;
import y71.y1;
import yz0.c2;

/* loaded from: /home/user/work/p/classes.dex */
public final class r0 extends k1 implements com.github.rudroid.utilities.viewmodel.b {
    public static final a Companion = new a();
    public final String A;
    public final y1 B;
    public final i1 C;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c f15368s;

    /* renamed from: t, reason: collision with root package name */
    public final nl.f f15369t;

    /* renamed from: u, reason: collision with root package name */
    public final ml.k f15370u;

    /* renamed from: v, reason: collision with root package name */
    public final com.github.rudroid.activities.util.c f15371v;

    /* renamed from: w, reason: collision with root package name */
    public final String f15372w;

    /* renamed from: x, reason: collision with root package name */
    public final String f15373x;

    /* renamed from: y, reason: collision with root package name */
    public final String f15374y;

    /* renamed from: z, reason: collision with root package name */
    public final String f15375z;

    public static final class a {
    }

    public r0(nl.f fVar, ml.k kVar, com.github.rudroid.activities.util.c cVar, oa.m mVar, androidx.lifecycle.a1 a1Var) {
        k71.k.g(fVar, "createPullRequestUseCase");
        k71.k.g(kVar, "fetchRepositoryPullRequestTemplatesUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(mVar, "userManager");
        k71.k.g(a1Var, "savedStateHandle");
        this.f15368s = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar);
        this.f15369t = fVar;
        this.f15370u = kVar;
        this.f15371v = cVar;
        String str = (String) h2.a(a1Var, "EXTRA_BASE_REF_BRANCH");
        this.f15372w = str;
        String str2 = (String) h2.a(a1Var, "EXTRA_HEAD_REF_BRANCH");
        this.f15373x = str2;
        String str3 = (String) h2.a(a1Var, "EXTRA_REPO_OWNER");
        this.f15374y = str3;
        String str4 = (String) h2.a(a1Var, "EXTRA_REPO_NAME");
        this.f15375z = str4;
        String str5 = (String) a1Var.a("EXTRA_COMMIT_MESSAGE");
        String str6 = str5 == null ? "" : str5;
        this.A = str6;
        String str7 = (String) a1Var.a("EXTRA_BODY");
        String str8 = str7 == null ? "" : str7;
        g1.a aVar = g1.Companion;
        q0 q0Var = new q0(new c2(str, str2), str8, str6, null, str6.length() > 0);
        aVar.getClass();
        y1 c10 = n1.c(new t1(q0Var));
        this.B = c10;
        this.C = new i1(c10);
        if (str8.length() == 0) {
            v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new x0(this, str3, str4, null), 3);
        }
    }

    public final void P(y71.g1 g1Var, fl.b bVar, boolean z10) {
        k71.k.g(g1Var, "<this>");
        k71.k.g(bVar, "executionError");
        this.f15368s.a(g1Var, bVar, z10);
    }
}
