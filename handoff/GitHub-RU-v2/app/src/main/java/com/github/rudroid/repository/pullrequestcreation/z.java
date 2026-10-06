package com.github.rudroid.repository.pullrequestcreation;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.h2;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import com.github.rudroid.utilities.viewmodel.d;
import y71.i1;
import y71.n1Shadow;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class z extends k1 implements com.github.rudroid.utilities.viewmodel.d {
    public static final a Companion = new a();
    public String A;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d.a f20146s;

    /* renamed from: t, reason: collision with root package name */
    public nl.f f20147t;

    /* renamed from: u, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f20148u;

    /* renamed from: v, reason: collision with root package name */
    public nl.g f20149v;

    /* renamed from: w, reason: collision with root package name */
    public y1 f20150w;

    /* renamed from: x, reason: collision with root package name */
    public i1 f20151x;

    /* renamed from: y, reason: collision with root package name */
    public String f20152y;

    /* renamed from: z, reason: collision with root package name */
    public String f20153z;

    public static final class a {
        public static void a(a1 a1Var, String str, String str2, String str3) {
            k71.k.g(a1Var, "<this>");
            k71.k.g(str, "repoOwner");
            k71.k.g(str2, "repoName");
            k71.k.g(str3, "baseRefName");
            a1Var.c(str3, "EXTRA_BASE_REF_BRANCH");
            a1Var.c(str, "EXTRA_REPO_OWNER");
            a1Var.c(str2, "EXTRA_REPO_NAME");
        }
    }

    public z(nl.f fVar, com.github.rudroid.activities.util.c cVar, nl.g gVar, a1 a1Var) {
        k71.k.g(fVar, "createPullRequestUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(gVar, "fetchAheadBehindUseCase");
        k71.k.g(a1Var, "savedStateHandle");
        this.f20146s = new d.a();
        this.f20147t = fVar;
        this.f20148u = cVar;
        this.f20149v = gVar;
        g1.a aVar = g1.Companion;
        com.github.rudroid.repository.pullrequestcreation.a aVar2 = new com.github.rudroid.repository.pullrequestcreation.a(null, null, null, 7);
        aVar.getClass();
        y1 c10 = n1Shadow.c(new t1(aVar2));
        this.f20150w = c10;
        this.f20151x = new i1(c10);
        this.f20152y = (String) h2.a(a1Var, "EXTRA_BASE_REF_BRANCH");
        this.f20153z = (String) h2.a(a1Var, "EXTRA_REPO_OWNER");
        this.A = (String) h2.a(a1Var, "EXTRA_REPO_NAME");
    }

    public final void P(String str, String str2, String str3) {
        k71.k.g(str, "title");
        k71.k.g(str2, "body");
        k71.k.g(str3, "headRefName");
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new d0(this, str, str2, str3, null), 3);
    }
}
