package com.github.rudroid.issueorpullrequest.subissues.changeparentissue;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.issueorpullrequest.selectissue.n0;
import com.github.rudroid.utilities.h2;
import com.github.rudroid.utilities.ui.g1;
import java.util.List;
import v71.a0;
import v71.b0;
import y71.i1;
import y71.n1;
import y71.w1;
import y71.y1;
import zk.h1;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends k1 implements com.github.rudroid.utilities.viewmodel.b, n0 {
    public static final C0043a Companion = new C0043a();

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c f16053s;

    /* renamed from: t, reason: collision with root package name */
    public final zk.e f16054t;

    /* renamed from: u, reason: collision with root package name */
    public final h1 f16055u;

    /* renamed from: v, reason: collision with root package name */
    public final com.github.rudroid.activities.util.c f16056v;

    /* renamed from: w, reason: collision with root package name */
    public final i1 f16057w;

    /* renamed from: x, reason: collision with root package name */
    public final String f16058x;

    /* renamed from: y, reason: collision with root package name */
    public final y1 f16059y;

    /* renamed from: z, reason: collision with root package name */
    public final i1 f16060z;

    /* renamed from: com.github.rudroid.issueorpullrequest.subissues.changeparentissue.a$a, reason: collision with other inner class name */
    public static final class C0043a {
    }

    public a(zk.e eVar, h1 h1Var, a1 a1Var, com.github.rudroid.activities.util.c cVar, oa.m mVar) {
        k71.k.g(eVar, "addSubIssueUseCase");
        k71.k.g(h1Var, "removeSubIssueUseCase");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(mVar, "userManager");
        this.f16053s = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar);
        this.f16054t = eVar;
        this.f16055u = h1Var;
        this.f16056v = cVar;
        this.f16057w = a1Var.b("EXTRA_PARENT_ISSUE");
        this.f16058x = (String) h2.a(a1Var, "EXTRA_ISSUE_ID_TO_CHANGE_PARENT_OF");
        g1.Companion.getClass();
        y1 c10 = n1.c(g1.a.a());
        this.f16059y = c10;
        this.f16060z = new i1(c10);
    }

    public final void P(y71.g1 g1Var, fl.b bVar, boolean z10) {
        k71.k.g(g1Var, "<this>");
        k71.k.g(bVar, "executionError");
        this.f16053s.a(g1Var, bVar, z10);
    }

    @Override // com.github.rudroid.issueorpullrequest.selectissue.n0
    public final void v(List list) {
        if (list.isEmpty()) {
            b0.z(d1.k(this), (a71.h) null, (a0) null, new h(this, null), 3);
            return;
        }
        oe.m mVar = (oe.m) x61.m.U(list);
        k71.k.g(mVar, "<this>");
        b0.z(d1.k(this), (a71.h) null, (a0) null, new e(this, new h01.j(mVar.f30182r, mVar.f30183s, mVar.f30184t, mVar.f30185u, mVar.f30186v, mVar.f30187w, mVar.f30188x, mVar.f30189y), null), 3);
    }

    @Override // com.github.rudroid.issueorpullrequest.selectissue.n0
    public final w1 x() {
        return this.f16060z;
    }
}
