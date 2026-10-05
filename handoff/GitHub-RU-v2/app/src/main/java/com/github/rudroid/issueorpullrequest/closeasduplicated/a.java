package com.github.rudroid.issueorpullrequest.closeasduplicated;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.issueorpullrequest.selectissue.n0;
import com.github.rudroid.utilities.h2;
import com.github.rudroid.utilities.ui.g1;
import java.util.List;
import k71.k;
import oa.m;
import v71.a0;
import v71.b0;
import y71.i1;
import y71.n1;
import y71.w1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends k1 implements com.github.rudroid.utilities.viewmodel.b, n0 {
    public static final C0041a Companion = new C0041a();

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c f15268s;

    /* renamed from: t, reason: collision with root package name */
    public final zk.h f15269t;

    /* renamed from: u, reason: collision with root package name */
    public final com.github.rudroid.activities.util.c f15270u;

    /* renamed from: v, reason: collision with root package name */
    public final String f15271v;

    /* renamed from: w, reason: collision with root package name */
    public final y1 f15272w;

    /* renamed from: x, reason: collision with root package name */
    public final i1 f15273x;

    /* renamed from: com.github.rudroid.issueorpullrequest.closeasduplicated.a$a, reason: collision with other inner class name */
    public static final class C0041a {
    }

    public a(a1 a1Var, zk.h hVar, com.github.rudroid.activities.util.c cVar, m mVar) {
        k.g(a1Var, "savedStateHandle");
        k.g(hVar, "closeIssueUseCase");
        k.g(cVar, "accountHolder");
        k.g(mVar, "userManager");
        this.f15268s = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar);
        this.f15269t = hVar;
        this.f15270u = cVar;
        this.f15271v = (String) h2.a(a1Var, "CloseIssueAsDuplicateViewModelEXTRA_ISSUE_ID_TO_MODIFY");
        g1.Companion.getClass();
        y1 c10 = n1.c(g1.a.a());
        this.f15272w = c10;
        this.f15273x = new i1(c10);
    }

    @Override // com.github.rudroid.issueorpullrequest.selectissue.n0
    public final void v(List list) {
        if (list.isEmpty()) {
            return;
        }
        b0.z(d1.k(this), (a71.h) null, (a0) null, new d(this, list, null), 3);
    }

    @Override // com.github.rudroid.issueorpullrequest.selectissue.n0
    public final w1 x() {
        return this.f15273x;
    }
}
