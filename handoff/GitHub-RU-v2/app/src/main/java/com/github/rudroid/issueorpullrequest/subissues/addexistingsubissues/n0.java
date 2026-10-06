package com.github.rudroid.issueorpullrequest.subissues.addexistingsubissues;

import androidx.lifecycle.a1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.h2;
import com.github.rudroid.utilities.ui.g1;
import y71.i1;
import y71.n1;
import y71.y1;
import zk.h1;

/* loaded from: /home/user/work/p/classes.dex */
public final class n0 extends k1 implements com.github.rudroid.utilities.viewmodel.b {
    public static final a Companion = new a();
    public y1 A;
    public i1 B;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c f15968s;

    /* renamed from: t, reason: collision with root package name */
    public zk.e f15969t;

    /* renamed from: u, reason: collision with root package name */
    public h1 f15970u;

    /* renamed from: v, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f15971v;

    /* renamed from: w, reason: collision with root package name */
    public String f15972w;

    /* renamed from: x, reason: collision with root package name */
    public int f15973x;

    /* renamed from: y, reason: collision with root package name */
    public y1 f15974y;

    /* renamed from: z, reason: collision with root package name */
    public i1 f15975z;

    public static final class a {
    }

    public n0(zk.e eVar, h1 h1Var, a1 a1Var, com.github.rudroid.activities.util.c cVar, oa.m mVar) {
        k71.k.g(eVar, "addSubIssueUseCase");
        k71.k.g(h1Var, "removeSubIssueUseCase");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(mVar, "userManager");
        this.f15968s = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar);
        this.f15969t = eVar;
        this.f15970u = h1Var;
        this.f15971v = cVar;
        this.f15972w = (String) h2.a(a1Var, "EXTRA_PARENT_ISSUE_ID");
        this.f15973x = ((Number) h2.a(a1Var, "EXTRA_PARENT_ISSUE_NUMBER")).intValue();
        g1.Companion.getClass();
        y1 c10 = n1.c(g1.a.a());
        this.f15974y = c10;
        this.f15975z = new i1(c10);
        y1 c11 = n1.c((Object) null);
        this.A = c11;
        this.B = new i1(c11);
    }

    public final void P(y71.g1 g1Var, fl.b bVar, boolean z10) {
        k71.k.g(g1Var, "<this>");
        k71.k.g(bVar, "executionError");
        this.f15968s.a(g1Var, bVar, z10);
    }
}
