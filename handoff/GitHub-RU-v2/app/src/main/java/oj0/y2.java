package oj0;

import gn0.r6;
import java.util.List;
import ri0.a6;
import ri0.b6;
import ri0.c6;
import ri0.c7;
import ri0.d8;
import ri0.f7;
import ri0.g6;
import ri0.g7;
import ri0.h7;
import ri0.i6;
import ri0.j6;
import ri0.k6;
import ri0.k7;
import ri0.l6;
import ri0.l7;
import ri0.m6;
import ri0.n6;
import ri0.o6;
import ri0.p6;
import ri0.q6;
import ri0.y5;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class y2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static o2 c(ea.e eVar, aa.w wVar) {
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
        ek0.f fVar = ek0.f.a;
        ek0.b c = ek0.f.c(eVar, wVar);
        eVar.s0();
        y5 c2 = f7.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new o2(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, o2 o2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, o2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, o2Var.b);
        ek0.f fVar2 = ek0.f.a;
        ek0.f.d(fVar, wVar, o2Var.c);
        List list = f7.a;
        y5 y5Var = o2Var.d;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y5Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, y5Var.a);
        fVar.z0("url");
        bVar2.b(fVar, wVar, y5Var.b);
        fVar.z0("id");
        bVar2.b(fVar, wVar, y5Var.c);
        fVar.z0("headRefOid");
        bVar2.b(fVar, wVar, y5Var.d);
        fVar.z0("headRepository");
        aa.c.b(aa.c.c(j6.a, false)).b(fVar, wVar, y5Var.e);
        fVar.z0("baseRepository");
        aa.c.b(aa.c.c(c6.a, false)).b(fVar, wVar, y5Var.f);
        fVar.z0("title");
        bVar2.b(fVar, wVar, y5Var.g);
        fVar.z0("titleHTML");
        bVar2.b(fVar, wVar, y5Var.h);
        fVar.z0("createdAt");
        r6.Companion.getClass();
        wVar.e(r6.a).b(fVar, wVar, y5Var.i);
        fVar.z0("viewerCanDeleteHeadRef");
        aa.b bVar3 = aa.c.f;
        jo.f4Shadow.C(y5Var.j, bVar3, fVar, wVar, "viewerDidAuthor");
        jo.f4Shadow.C(y5Var.k, bVar3, fVar, wVar, "viewerCanChangeBaseBranch");
        jo.f4Shadow.C(y5Var.l, bVar3, fVar, wVar, "locked");
        jo.f4Shadow.C(y5Var.m, bVar3, fVar, wVar, "author");
        aa.c.b(aa.c.c(a6.a, true)).b(fVar, wVar, y5Var.n);
        fVar.z0("isReadByViewer");
        aa.c.k.b(fVar, wVar, y5Var.o);
        fVar.z0("bodyHtml");
        bVar2.b(fVar, wVar, y5Var.p);
        fVar.z0("number");
        Integer valueOf = Integer.valueOf(y5Var.q);
        nn.a aVar = od0.b.a;
        aVar.b(fVar, wVar, valueOf);
        fVar.z0("pullRequestState");
        fVar.I(y5Var.r.r);
        fVar.z0("changedFiles");
        aVar.b(fVar, wVar, Integer.valueOf(y5Var.s));
        fVar.z0("additions");
        aVar.b(fVar, wVar, Integer.valueOf(y5Var.t));
        fVar.z0("deletions");
        aVar.b(fVar, wVar, Integer.valueOf(y5Var.u));
        fVar.z0("mergeStateStatus");
        fVar.I(y5Var.v.r);
        fVar.z0("mergedBy");
        aa.c.b(aa.c.c(p6.a, true)).b(fVar, wVar, y5Var.w);
        fVar.z0("mergeCommit");
        aa.c.b(aa.c.c(m6.a, false)).b(fVar, wVar, y5Var.x);
        fVar.z0("mergeQueue");
        aa.c.b(aa.c.c(n6.a, true)).b(fVar, wVar, y5Var.y);
        fVar.z0("mergeQueueEntry");
        aa.c.b(aa.c.c(o6.a, true)).b(fVar, wVar, y5Var.z);
        fVar.z0("reviewDecision");
        aa.c.b(hn0.b.b).b(fVar, wVar, y5Var.A);
        fVar.z0("isDraft");
        jo.f4Shadow.C(y5Var.B, bVar3, fVar, wVar, "requiredStatusChecks");
        aa.c.c(g7.a, false).b(fVar, wVar, y5Var.C);
        fVar.z0("baseRef");
        aa.c.b(aa.c.c(b6.a, false)).b(fVar, wVar, y5Var.D);
        fVar.z0("baseRefName");
        bVar2.b(fVar, wVar, y5Var.E);
        fVar.z0("headRef");
        aa.c.b(aa.c.c(i6.a, false)).b(fVar, wVar, y5Var.F);
        fVar.z0("headRefName");
        bVar2.b(fVar, wVar, y5Var.G);
        fVar.z0("milestone");
        aa.c.b(aa.c.c(q6.a, true)).b(fVar, wVar, y5Var.H);
        fVar.z0("projectCards");
        aa.c.c(c7.a, false).b(fVar, wVar, y5Var.I);
        fVar.z0("reviewRequests");
        aa.c.b(aa.c.c(h7.a, false)).b(fVar, wVar, y5Var.J);
        fVar.z0("latestReviews");
        aa.c.b(aa.c.c(l6.a, false)).b(fVar, wVar, y5Var.K);
        fVar.z0("latestOpinionatedReviews");
        aa.c.b(aa.c.c(k6.a, false)).b(fVar, wVar, y5Var.L);
        fVar.z0("suggestedReviewers");
        aa.c.a(aa.c.b(aa.c.c(k7.a, false))).e(fVar, wVar, y5Var.M);
        fVar.z0("actionRequiredWorkflowRunCount");
        aVar.b(fVar, wVar, Integer.valueOf(y5Var.N));
        fVar.z0("commits");
        aa.c.c(g6.a, false).b(fVar, wVar, y5Var.O);
        fVar.z0("viewerLatestReview");
        aa.c.b(aa.c.c(l7.a, false)).b(fVar, wVar, y5Var.P);
        fVar.z0("viewerCanReopen");
        jo.f4Shadow.C(y5Var.Q, bVar3, fVar, wVar, "viewerCanMergeAsAdmin");
        jo.f4Shadow.C(y5Var.R, bVar3, fVar, wVar, "viewerCanAssign");
        jo.f4Shadow.C(y5Var.S, bVar3, fVar, wVar, "viewerCanLabel");
        jo.f4Shadow.C(y5Var.T, bVar3, fVar, wVar, "viewerCanUpdateBranch");
        bVar3.b(fVar, wVar, Boolean.valueOf(y5Var.U));
        List list2 = se0.e.a;
        se0.e.d(fVar, wVar, y5Var.V);
        aj0.f fVar3 = aj0.f.a;
        aj0.f.d(fVar, wVar, y5Var.W);
        List list3 = yh0.b.a;
        yh0.b.d(fVar, wVar, y5Var.X);
        List list4 = yd0.j.a;
        yd0.j.d(fVar, wVar, y5Var.Y);
        List list5 = sg0.n.a;
        sg0.n.d(fVar, wVar, y5Var.Z);
        List list6 = yg0.g.a;
        yg0.g.d(fVar, wVar, y5Var.a0);
        List list7 = sk0.b.a;
        sk0.b.d(fVar, wVar, y5Var.b0);
        List list8 = d8.a;
        d8.d(fVar, wVar, y5Var.c0);
        List list9 = ri0.d.a;
        ri0.d.d(fVar, wVar, y5Var.d0);
    }
}
