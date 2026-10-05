package uu0;

import java.util.List;
import pz0.o7;
import xt0.c7;
import xt0.d7;
import xt0.v7;
import xt0.x6;
import xt0.y6;
import xt0.z6;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static u3 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        nv0.f fVar = nv0.f.a;
        nv0.b c = nv0.f.c(eVar, wVar);
        eVar.s0();
        xt0.u5 c2 = x6.c(eVar, wVar);
        eVar.s0();
        c1 c3 = f1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new u3(str, str2, c, c2, c3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u3 u3Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u3Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u3Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, u3Var.b);
        nv0.f fVar2 = nv0.f.a;
        nv0.f.d(fVar, wVar, u3Var.c);
        List list = x6.a;
        xt0.u5 u5Var = u3Var.d;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u5Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, u5Var.a);
        fVar.z0("url");
        bVar2.b(fVar, wVar, u5Var.b);
        fVar.z0("id");
        bVar2.b(fVar, wVar, u5Var.c);
        fVar.z0("headRefOid");
        bVar2.b(fVar, wVar, u5Var.d);
        fVar.z0("headRepository");
        aa.c.b(aa.c.c(xt0.e6.a, false)).b(fVar, wVar, u5Var.e);
        fVar.z0("baseRepository");
        aa.c.b(aa.c.c(xt0.y5.a, false)).b(fVar, wVar, u5Var.f);
        fVar.z0("title");
        bVar2.b(fVar, wVar, u5Var.g);
        fVar.z0("titleHTML");
        bVar2.b(fVar, wVar, u5Var.h);
        fVar.z0("createdAt");
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, u5Var.i);
        fVar.z0("viewerCanDeleteHeadRef");
        aa.b bVar3 = aa.c.f;
        jo.f4.C(u5Var.j, bVar3, fVar, wVar, "viewerDidAuthor");
        jo.f4.C(u5Var.k, bVar3, fVar, wVar, "viewerCanChangeBaseBranch");
        jo.f4.C(u5Var.l, bVar3, fVar, wVar, "locked");
        jo.f4.C(u5Var.m, bVar3, fVar, wVar, "author");
        aa.c.b(aa.c.c(xt0.w5.a, true)).b(fVar, wVar, u5Var.n);
        fVar.z0("isReadByViewer");
        aa.c.k.b(fVar, wVar, u5Var.o);
        fVar.z0("bodyHtml");
        bVar2.b(fVar, wVar, u5Var.p);
        fVar.z0("number");
        int i = u5Var.q;
        nn.a aVar = ro0.a.a;
        f1.e.v(i, aVar, fVar, wVar, "pullRequestState");
        fVar.I(u5Var.r.r);
        fVar.z0("changedFiles");
        f1.e.v(u5Var.s, aVar, fVar, wVar, "additions");
        f1.e.v(u5Var.t, aVar, fVar, wVar, "deletions");
        f1.e.v(u5Var.u, aVar, fVar, wVar, "mergeStateStatus");
        fVar.I(u5Var.v.r);
        fVar.z0("mergedBy");
        aa.c.b(aa.c.c(xt0.k6.a, true)).b(fVar, wVar, u5Var.w);
        fVar.z0("mergeCommit");
        aa.c.b(aa.c.c(xt0.h6.a, false)).b(fVar, wVar, u5Var.x);
        fVar.z0("mergeQueue");
        aa.c.b(aa.c.c(xt0.i6.a, true)).b(fVar, wVar, u5Var.y);
        fVar.z0("mergeQueueEntry");
        aa.c.b(aa.c.c(xt0.j6.a, true)).b(fVar, wVar, u5Var.z);
        fVar.z0("reviewDecision");
        aa.c.b(qz0.b.h).b(fVar, wVar, u5Var.A);
        fVar.z0("isDraft");
        jo.f4.C(u5Var.B, bVar3, fVar, wVar, "requiredStatusChecks");
        aa.c.c(y6.a, false).b(fVar, wVar, u5Var.C);
        fVar.z0("baseRef");
        aa.c.b(aa.c.c(xt0.x5.a, false)).b(fVar, wVar, u5Var.D);
        fVar.z0("baseRefName");
        bVar2.b(fVar, wVar, u5Var.E);
        fVar.z0("headRef");
        aa.c.b(aa.c.c(xt0.d6.a, false)).b(fVar, wVar, u5Var.F);
        fVar.z0("headRefName");
        bVar2.b(fVar, wVar, u5Var.G);
        fVar.z0("milestone");
        aa.c.b(aa.c.c(xt0.l6.a, true)).b(fVar, wVar, u5Var.H);
        fVar.z0("reviewRequests");
        aa.c.b(aa.c.c(z6.a, false)).b(fVar, wVar, u5Var.I);
        fVar.z0("latestReviews");
        aa.c.b(aa.c.c(xt0.g6.a, false)).b(fVar, wVar, u5Var.J);
        fVar.z0("latestOpinionatedReviews");
        aa.c.b(aa.c.c(xt0.f6.a, false)).b(fVar, wVar, u5Var.K);
        fVar.z0("suggestedReviewers");
        aa.c.a(aa.c.b(aa.c.c(c7.a, false))).e(fVar, wVar, u5Var.L);
        fVar.z0("actionRequiredWorkflowRunCount");
        f1.e.v(u5Var.M, aVar, fVar, wVar, "commits");
        aa.c.c(xt0.b6.a, false).b(fVar, wVar, u5Var.N);
        fVar.z0("viewerLatestReview");
        aa.c.b(aa.c.c(d7.a, false)).b(fVar, wVar, u5Var.O);
        fVar.z0("viewerCanReopen");
        jo.f4.C(u5Var.P, bVar3, fVar, wVar, "viewerCanMergeAsAdmin");
        jo.f4.C(u5Var.Q, bVar3, fVar, wVar, "viewerCanAssign");
        jo.f4.C(u5Var.R, bVar3, fVar, wVar, "viewerCanLabel");
        jo.f4.C(u5Var.S, bVar3, fVar, wVar, "viewerCanUpdateBranch");
        bVar3.b(fVar, wVar, Boolean.valueOf(u5Var.T));
        List list2 = yp0.e.a;
        yp0.e.d(fVar, wVar, u5Var.U);
        gu0.f fVar3 = gu0.f.a;
        gu0.f.d(fVar, wVar, u5Var.V);
        List list3 = gt0.b.a;
        gt0.b.d(fVar, wVar, u5Var.W);
        List list4 = ep0.j.a;
        ep0.j.d(fVar, wVar, u5Var.X);
        List list5 = cs0.n.a;
        cs0.n.d(fVar, wVar, u5Var.Y);
        List list6 = is0.g.a;
        is0.g.d(fVar, wVar, u5Var.Z);
        List list7 = bw0.b.a;
        bw0.b.d(fVar, wVar, u5Var.a0);
        List list8 = v7.a;
        v7.d(fVar, wVar, u5Var.b0);
        List list9 = xt0.d.a;
        xt0.d.d(fVar, wVar, u5Var.c0);
        List list10 = f1.a;
        f1.d(fVar, wVar, u3Var.e);
    }
}
