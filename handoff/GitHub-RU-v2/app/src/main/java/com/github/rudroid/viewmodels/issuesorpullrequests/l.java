package com.github.rudroid.viewmodels.issuesorpullrequests;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.viewmodel.d;
import com.github.rudroid.utilities.viewmodel.f;
import com.github.rudroid.viewmodels.i7;
import com.github.rudroid.viewmodels.y7;
import com.github.rudroid.webview.adapters.g;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.projects.ProjectsMetaInfo;
import com.github.service.models.response.type.MobileAppElement;
import com.github.service.models.response.type.PullRequestMergeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import le.i;
import t00.f8;
import yz0.o6;
import yz0.s7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l extends androidx.lifecycle.k1 implements com.github.rudroid.viewmodels.v3, com.github.rudroid.utilities.viewmodel.d, com.github.rudroid.utilities.viewmodel.f, m2 {
    public static final a Companion = new a();
    public final zk.d0 A;
    public v71.q1 A0;
    public final zk.m0 B;
    public final zk.m C;
    public final zk.b1 D;
    public final zk.f E;
    public final kj.g F;
    public final kj.g0 G;
    public final kj.l0 H;
    public final kj.q0 I;
    public final bj.f J;
    public final kj.z K;
    public final kj.o0 L;
    public final zk.h M;
    public final zk.i1 N;
    public final zk.j1 O;
    public final zk.i P;
    public final zk.s1 Q;
    public final zk.g R;
    public final zk.r0 S;
    public final androidx.lifecycle.a1 T;
    public final zk.w U;
    public final zk.k1 V;
    public final com.github.rudroid.issueorpullrequest.k W;
    public final com.github.rudroid.issueorpullrequest.q1 X;
    public final e Y;
    public final wd.k Z;
    public final wd.o a0;
    public final wd.f b0;
    public final wd.m c0;
    public final com.github.rudroid.utilities.e d0;
    public final com.github.rudroid.activities.util.c e0;
    public final y71.y1 f0;
    public final y71.y1 g0;
    public final y71.i1 h0;
    public final y71.y1 i0;
    public final y71.y1 j0;
    public final y71.i1 k0;
    public final y71.y1 l0;
    public final y71.y1 m0;
    public final y71.y1 n0;
    public final y71.i1 o0;
    public i7.a p0;
    public i7.a q0;
    public String r0;
    public final /* synthetic */ d.a s;
    public final y71.y1 s0;
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.f t;
    public final y71.m1 t0;
    public final v71.v u;
    public final y71.h1 u0;
    public final zk.k v;
    public v71.q1 v0;
    public final zk.p0 w;
    public v71.q1 w0;
    public final zk.v0 x;
    public v71.q1 x0;
    public final zk.v y;
    public v71.q1 y0;
    public final zk.i0 z;
    public v71.q1 z0;

    public static final class a {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b s;
        public static final b t;
        public static final b u;
        public static final /* synthetic */ b[] v;
        public final MobileAppElement r;

        static {
            b bVar = new b("DISMISSED", 0, null);
            s = bVar;
            b bVar2 = new b("CCR", 1, MobileAppElement.COPILOT_CODE_REVIEW_BANNER);
            t = bVar2;
            b bVar3 = new b("CCA", 2, MobileAppElement.CODING_AGENT_BANNER);
            u = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            v = bVarArr;
            v8.l0.t(bVarArr);
        }

        public b(String str, int i, MobileAppElement mobileAppElement) {
            this.r = mobileAppElement;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) v.clone();
        }
    }

    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IssueOrPullRequestState.values().length];
            try {
                iArr[IssueOrPullRequestState.PULL_REQUEST_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IssueOrPullRequestState.PULL_REQUEST_DRAFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IssueOrPullRequestState.PULL_REQUEST_CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IssueOrPullRequestState.ISSUE_OPEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IssueOrPullRequestState.ISSUE_CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public l(v71.v vVar, v71.v vVar2, zk.k kVar, zk.p0 p0Var, zk.v0 v0Var, zk.v vVar3, zk.i0 i0Var, zk.d0 d0Var, zk.m0 m0Var, zk.m mVar, zk.b1 b1Var, zk.o oVar, zk.f fVar, kj.g gVar, kj.g0 g0Var, kj.l0 l0Var, kj.q0 q0Var, bj.f fVar2, kj.z zVar, kj.o0 o0Var, zk.h hVar, zk.i1 i1Var, zk.j1 j1Var, zk.i iVar, zk.s1 s1Var, zk.g gVar2, zk.r0 r0Var, androidx.lifecycle.a1 a1Var, zk.w wVar, zk.k1 k1Var, com.github.rudroid.issueorpullrequest.k kVar2, com.github.rudroid.issueorpullrequest.q1 q1Var, e eVar, wd.k kVar3, wd.o oVar2, wd.f fVar3, wd.m mVar2, com.github.rudroid.utilities.e eVar2, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(vVar, "ioDispatcher");
        k71.k.g(vVar2, "defaultDispatcher");
        k71.k.g(kVar, "deleteIssueCommentUseCase");
        k71.k.g(p0Var, "observeIssueOrPullRequestUseCase");
        k71.k.g(v0Var, "fetchViewerReviewerReviewStatusUseCase");
        k71.k.g(vVar3, "fetchIssueOrPullRequestIdUseCase");
        k71.k.g(i0Var, "loadIssueOrPullRequestTimelineItemsPageUseCase");
        k71.k.g(d0Var, "fetchTimelineItemIdUseCase");
        k71.k.g(m0Var, "markAsReadUseCase");
        k71.k.g(mVar, "deletePullRequestBranchUseCase");
        k71.k.g(b1Var, "reRequestReviewUseCase");
        k71.k.g(oVar, "dismissPullRequestReviewUseCase");
        k71.k.g(fVar, "approveRequiredWorkflowRunsUseCase");
        k71.k.g(gVar, "addReactionUseCase");
        k71.k.g(g0Var, "removeReactionUseCase");
        k71.k.g(l0Var, "subscribeUseCase");
        k71.k.g(q0Var, "unsubscribeUseCase");
        k71.k.g(fVar2, "unBlockFromOrgIssuePrUseCase");
        k71.k.g(zVar, "lockUseCase");
        k71.k.g(o0Var, "unlockUseCase");
        k71.k.g(hVar, "closeIssueUseCase");
        k71.k.g(i1Var, "reopenIssueUseCase");
        k71.k.g(j1Var, "reopenPullRequestUseCase");
        k71.k.g(iVar, "closePullRequestUseCase");
        k71.k.g(s1Var, "unPinIssueUseCase");
        k71.k.g(gVar2, "changePullRequestBaseBranchUseCase");
        k71.k.g(r0Var, "observePullRequestStatusUseCase");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(wVar, "fetchMergeBoxMessageUseCase");
        k71.k.g(k1Var, "resolveIssueUseCase");
        k71.k.g(q1Var, "reviewBannerParser");
        k71.k.g(eVar, "issueOrPullRequestAliveUseCase");
        k71.k.g(kVar3, "observeCopilotReviewerBannerDismissedUseCase");
        k71.k.g(oVar2, "setCopilotReviewerBannerDismissedUseCase");
        k71.k.g(fVar3, "observeCopilotCodingAgentBannerDismissedUseCase");
        k71.k.g(mVar2, "setCopilotCodingAgentBannerDismissedUseCase");
        k71.k.g(eVar2, "analytics");
        k71.k.g(cVar, "accountHolder");
        this.s = new d.a();
        com.github.rudroid.utilities.viewmodel.f.Companion.getClass();
        this.t = f.a.a(a1Var);
        this.u = vVar;
        this.v = kVar;
        this.w = p0Var;
        this.x = v0Var;
        this.y = vVar3;
        this.z = i0Var;
        this.A = d0Var;
        this.B = m0Var;
        this.C = mVar;
        this.D = b1Var;
        this.E = fVar;
        this.F = gVar;
        this.G = g0Var;
        this.H = l0Var;
        this.I = q0Var;
        this.J = fVar2;
        this.K = zVar;
        this.L = o0Var;
        this.M = hVar;
        this.N = i1Var;
        this.O = j1Var;
        this.P = iVar;
        this.Q = s1Var;
        this.R = gVar2;
        this.S = r0Var;
        this.T = a1Var;
        this.U = wVar;
        this.V = k1Var;
        this.W = kVar2;
        this.X = q1Var;
        this.Y = eVar;
        this.Z = kVar3;
        this.a0 = oVar2;
        this.b0 = fVar3;
        this.c0 = mVar2;
        this.d0 = eVar2;
        this.e0 = cVar;
        y71.y1 c2 = y71.n1.c((Object) null);
        this.f0 = c2;
        y71.y1 c3 = y71.n1.c(new a6(null, null, null, null, 255));
        this.g0 = c3;
        this.h0 = new y71.i1(c3);
        y71.y1 c4 = y71.n1.c((Object) null);
        this.i0 = c4;
        y71.y1 c5 = y71.n1.c(g1.a.c(com.github.rudroid.utilities.ui.g1.Companion));
        this.j0 = c5;
        this.k0 = new y71.i1(c5);
        y71.y1 c6 = y71.n1.c(new com.github.rudroid.utilities.ui.u0(null));
        this.l0 = c6;
        y71.y1 c7 = y71.n1.c(new d6(cVar.d().f(com.github.rudroid.common.a.U), rc.l.b(cVar.d())));
        this.m0 = c7;
        com.github.rudroid.utilities.ui.h0 a2 = g1.a.a();
        x61.t tVar = x61.t.r;
        y71.y1 c8 = y71.n1.c(new y7(a2, false, tVar, tVar));
        this.n0 = c8;
        this.o0 = y71.n1.G(y71.n1.y(y71.n1.l(y71.n1.l(c2, c5, c7, x1.y), y71.n1.l(c3, c4, c8, y1.y), c6, new a2(this, null)), vVar2), androidx.lifecycle.d1.k(this), y71.q1.b, new g(new com.github.rudroid.utilities.ui.u0(null)));
        this.p0 = new i7.a(null, false);
        this.q0 = new i7.a(null, false);
        this.s0 = y71.n1.c((Object) null);
        y71.m1 j = w8.s.j();
        this.t0 = j;
        this.u0 = new y71.h1(j);
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new i(this, null), 3);
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new k(this, null), 3);
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new x0(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(l lVar, c71.c cVar) {
        k0 k0Var;
        int i;
        zk.v vVar;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i2 = k0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k0Var.x = i2 - Integer.MIN_VALUE;
                Object obj = k0Var.v;
                b71.a aVar = b71.a.r;
                i = k0Var.x;
                if (i != 0) {
                    sy.y.j(obj);
                    if (!t71.p.T(lVar.d0())) {
                        return new f8(21, lVar.d0());
                    }
                    zk.v vVar2 = lVar.y;
                    com.github.rudroid.activities.util.c cVar2 = lVar.e0;
                    k0Var.u = vVar2;
                    k0Var.x = 1;
                    cVar2.getClass();
                    Object c2 = com.github.rudroid.activities.util.a.c(cVar2, k0Var);
                    if (c2 == aVar) {
                        return aVar;
                    }
                    vVar = vVar2;
                    obj = c2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = k0Var.u;
                    sy.y.j(obj);
                }
                return vVar.a((oa.j) obj, lVar.f0(), lVar.e0(), lVar.c0(), new com.github.rudroid.utilities.ui.emojipicker.e(2));
            }
        }
        k0Var = new k0(lVar, cVar);
        Object obj2 = k0Var.v;
        b71.a aVar2 = b71.a.r;
        i = k0Var.x;
        if (i != 0) {
        }
        return vVar.a((oa.j) obj2, lVar.f0(), lVar.e0(), lVar.c0(), new com.github.rudroid.utilities.ui.emojipicker.e(2));
    }

    public static final Object Q(l lVar, boolean z, c71.j jVar) {
        String str = z ? lVar.p0.b : lVar.q0.b;
        if (str != null) {
            Object j = y71.n1.j(lVar.z.a(lVar.e0.d(), lVar.f0(), lVar.e0(), lVar.c0(), str, z ? z01.b0.r : z01.b0.s, new n0(lVar, 1)), jVar);
            if (j == b71.a.r) {
                return j;
            }
        }
        return w61.a0.a;
    }

    public static final List R(l lVar, yz0.i2 i2Var, d6 d6Var, a6 a6Var, m01.b bVar, y7 y7Var, tz0.b bVar2) {
        com.github.rudroid.issueorpullrequest.k kVar = lVar.W;
        k71.k.d(i2Var);
        boolean z = lVar.p0.a;
        String str = lVar.r0;
        com.github.rudroid.activities.util.c cVar = lVar.e0;
        return kVar.a(i2Var, y7Var, d6Var, cVar.d().f(com.github.rudroid.common.a.S), z, cVar.d().f(com.github.rudroid.common.a.H), str, bVar, a6Var, bVar2);
    }

    public static final void S(l lVar, fl.b bVar) {
        y71.y1 y1Var = lVar.j0;
        g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
        Object data = ((com.github.rudroid.utilities.ui.g1) y1Var.getValue()).getData();
        aVar.getClass();
        y1Var.k((Object) null, g1.a.b(bVar, data));
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final void D() {
        v71.q1 q1Var = this.v0;
        if (q1Var == null || !q1Var.f()) {
            this.v0 = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new q0(this, null), 3);
        }
    }

    @Override // com.github.rudroid.viewmodels.issuesorpullrequests.m2
    public final y71.i1 H() {
        return this.h0;
    }

    public final void T(yz0.r3 r3Var) {
        k71.k.g(r3Var, "reaction");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new m(this, r3Var, null), 3);
    }

    public final androidx.lifecycle.p0 U() {
        androidx.lifecycle.p0 p0Var = new androidx.lifecycle.p0();
        yz0.i2 i2Var = (yz0.i2) ((com.github.rudroid.utilities.ui.g1) this.j0.getValue()).getData();
        if (i2Var == null) {
            return p0Var;
        }
        fl.f.Companion.getClass();
        p0Var.j(fl.e.b(null));
        v71.b0.z(androidx.lifecycle.d1.k(this), this.u, (v71.a0) null, new p(this, i2Var, p0Var, null), 2);
        return p0Var;
    }

    public final void V(String str) {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new s(this, str, null), 3);
    }

    public final void W(String str) {
        k71.k.g(str, "refId");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new b0(this, str, null), 3);
    }

    public final void X(String str) {
        k71.k.g(str, "commentId");
        yz0.i2 i2Var = (yz0.i2) ((com.github.rudroid.utilities.ui.g1) this.j0.getValue()).getData();
        if (i2Var != null) {
            v71.b0.z(androidx.lifecycle.d1.k(this), this.u, (v71.a0) null, new c0(this, i2Var, str, null), 2);
        }
    }

    public final void Y(fl.b bVar) {
        k71.k.g(bVar, "executionError");
        this.s.a(bVar);
    }

    public final void Z() {
        String str = (String) this.T.a("EXTRA_DEEPLINK");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new m0(this, null), 3);
        if (str == null || t71.p.T(str)) {
            o0();
            g0(null, false);
        } else {
            o0();
            v71.b0.z(androidx.lifecycle.d1.k(this), this.u, (v71.a0) null, new j0(this, str, null), 2);
        }
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final boolean a() {
        return com.github.rudroid.utilities.ui.h1.i(((g) this.o0.r.getValue()).a).a == fl.g.s && this.q0.a;
    }

    public final com.github.rudroid.viewmodels.tasklist.a a0(String str) {
        Object obj;
        k71.k.g(str, "id");
        yz0.i2 i2Var = (yz0.i2) ((com.github.rudroid.utilities.ui.g1) this.j0.getValue()).getData();
        if (i2Var != null) {
            if (k71.k.b(i2Var.h, str)) {
                return com.github.rudroid.viewmodels.tasklist.o.a(i2Var.s);
            }
            Iterator it = i2Var.v.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                o6 o6Var = (s7) obj;
                if ((o6Var instanceof o6) && k71.k.b(o6Var.a.getId(), str)) {
                    break;
                }
            }
            o6 o6Var2 = (s7) obj;
            if (o6Var2 != null) {
                return com.github.rudroid.viewmodels.tasklist.o.a(o6Var2.a);
            }
        }
        return null;
    }

    @Override // com.github.rudroid.utilities.viewmodel.f
    public final ProjectsMetaInfo b() {
        return this.t.b();
    }

    public final String b0() {
        yz0.i2 i2Var = (yz0.i2) ((com.github.rudroid.utilities.ui.g1) this.j0.getValue()).getData();
        if (i2Var != null) {
            return i2Var.j0;
        }
        return null;
    }

    public final int c0() {
        return ((Number) com.github.rudroid.utilities.h2.a(this.T, "EXTRA_NUMBER")).intValue();
    }

    public final String d0() {
        String str = (String) this.T.a("EXTRA_ID");
        return str == null ? "" : str;
    }

    @Override // com.github.rudroid.viewmodels.issuesorpullrequests.m2
    public final void e(PullRequestMergeMethod pullRequestMergeMethod) {
        k71.k.g(pullRequestMergeMethod, "method");
        y71.y1 y1Var = this.g0;
        a6 b2 = a6.b((a6) y1Var.getValue(), pullRequestMergeMethod, null, null, null, null, 253);
        y1Var.getClass();
        y1Var.k((Object) null, b2);
    }

    public final String e0() {
        return (String) com.github.rudroid.utilities.h2.a(this.T, "EXTRA_REPOSITORY_NAME");
    }

    public final String f0() {
        return (String) com.github.rudroid.utilities.h2.a(this.T, "EXTRA_REPOSITORY_OWNER");
    }

    public final void g0(String str, boolean z) {
        v71.q1 q1Var = this.v0;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        v71.q1 q1Var2 = this.w0;
        if (q1Var2 != null) {
            q1Var2.m((CancellationException) null);
        }
        v71.q1 q1Var3 = this.x0;
        if (q1Var3 != null) {
            q1Var3.m((CancellationException) null);
        }
        this.x0 = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new p0(this, str, z, null), 3);
    }

    public final void h0() {
        v71.q1 q1Var = this.w0;
        if (q1Var == null || !q1Var.f()) {
            this.w0 = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new r0(this, null), 3);
        }
    }

    public final void i0() {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new c1(this, null), 3);
    }

    public final void j0() {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new d1(this, null), 3);
    }

    public final void k0(com.github.rudroid.utilities.ui.g1 g1Var) {
        k71.k.g(g1Var, "result");
        y71.y1 y1Var = this.m0;
        d6 a2 = d6.a((d6) y1Var.getValue(), false, false, false, g1Var, null, false, false, null, 32703);
        y1Var.getClass();
        y1Var.k((Object) null, a2);
    }

    public final void l0(String str, String str2, sy.e0 e0Var) {
        k71.k.g(str, "pullId");
        k71.k.g(str2, "id");
        k71.k.g(e0Var, "type");
        boolean equals = e0Var.equals(yz0.f2.d);
        List list = x61.r.r;
        List n = equals ? sy.d0.n(str2) : list;
        if (e0Var.equals(yz0.f2.a)) {
            list = sy.d0.n(str2);
        }
        v71.b0.z(androidx.lifecycle.d1.k(this), this.u, (v71.a0) null, new k1(this, str, n, list, null), 2);
    }

    public final void m0(yz0.r3 r3Var) {
        k71.k.g(r3Var, "reaction");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new l1(this, r3Var, null), 3);
    }

    public final void n0(String str, yz0.g2 g2Var) {
        k71.k.g(str, "pullId");
        k71.k.g(g2Var, "reviewer");
        String str2 = g2Var.c;
        sy.e0 e0Var = g2Var.d;
        boolean equals = e0Var.equals(yz0.f2.d);
        List list = x61.r.r;
        List n = equals ? sy.d0.n(str2) : list;
        if (e0Var.equals(yz0.f2.a)) {
            list = sy.d0.n(str2);
        }
        v71.b0.z(androidx.lifecycle.d1.k(this), this.u, (v71.a0) null, new o1(this, str, n, list, g2Var, null), 2);
    }

    public final void o0() {
        String str = (String) this.T.a("EXTRA_TITLE");
        y71.y1 y1Var = this.j0;
        if (((com.github.rudroid.utilities.ui.g1) y1Var.getValue()).getData() != null || str == null) {
            g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
            Object data = ((com.github.rudroid.utilities.ui.g1) y1Var.getValue()).getData();
            aVar.getClass();
            com.github.rudroid.utilities.ui.u0 u0Var = new com.github.rudroid.utilities.ui.u0(data);
            y1Var.getClass();
            y1Var.k((Object) null, u0Var);
            return;
        }
        ArrayList q = sy.d0.q(new g.c(new i.p0(new le.h(c0(), f0(), e0(), str))));
        y71.y1 y1Var2 = this.f0;
        y1Var2.getClass();
        y1Var2.k((Object) null, q);
    }

    public final void p0(CloseReason closeReason) {
        yz0.i2 i2Var = (yz0.i2) ((com.github.rudroid.utilities.ui.g1) this.j0.getValue()).getData();
        if (i2Var != null) {
            String str = i2Var.h;
            int i = c.a[i2Var.p.ordinal()];
            if (i != 4) {
                if (i != 5) {
                    return;
                }
                v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new g1(this, str, null), 3);
            } else {
                k71.k.g(str, "id");
                if (closeReason != CloseReason.Duplicate) {
                    v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new v(this, str, closeReason, null), 3);
                }
            }
        }
    }

    public final void q0() {
        yz0.i2 i2Var = (yz0.i2) ((com.github.rudroid.utilities.ui.g1) this.j0.getValue()).getData();
        if (i2Var != null) {
            String str = i2Var.h;
            if (i2Var.o) {
                v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new i2(this, str, null), 3);
            } else {
                v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new u0(this, str, null), 3);
            }
        }
    }

    public final void r0() {
        yz0.i2 i2Var = (yz0.i2) ((com.github.rudroid.utilities.ui.g1) this.j0.getValue()).getData();
        if (i2Var != null) {
            String str = i2Var.h;
            int i = c.a[i2Var.p.ordinal()];
            if (i == 1 || i == 2) {
                v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new y(this, str, null), 3);
            } else {
                if (i != 3) {
                    return;
                }
                v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new j1(this, str, null), 3);
            }
        }
    }

    public final void s0() {
        yz0.i2 i2Var = (yz0.i2) ((com.github.rudroid.utilities.ui.g1) this.j0.getValue()).getData();
        if (i2Var != null) {
            v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new u1(i2Var, this, null), 3);
        }
    }

    public final androidx.lifecycle.p0 t0() {
        androidx.lifecycle.p0 p0Var = new androidx.lifecycle.p0();
        fl.f.Companion.getClass();
        p0Var.j(fl.e.b(null));
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new c2(this, p0Var, null), 3);
        return p0Var;
    }

    @Override // com.github.rudroid.viewmodels.issuesorpullrequests.m2
    public final void u(String str) {
        k71.k.g(str, "email");
        y71.y1 y1Var = this.g0;
        a6 b2 = a6.b((a6) y1Var.getValue(), null, str, null, null, null, 251);
        y1Var.getClass();
        y1Var.k((Object) null, b2);
    }

    public final void u0(String str, String str2, String str3) {
        k71.k.g(str, "userId");
        k71.k.g(str2, "organizationId");
        k71.k.g(str3, "userLogin");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new f2(this, str, str2, str3, null), 3);
    }

    @Override // com.github.rudroid.viewmodels.issuesorpullrequests.m2
    public final y71.i1 z() {
        return this.k0;
    }
}
