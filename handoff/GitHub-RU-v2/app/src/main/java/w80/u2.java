package w80;

import hc0.h6;
import java.util.List;
import jo.f4;
import z70.a6;
import z70.b6;
import z70.l5;
import z70.n5;
import z70.n6;
import z70.o5;
import z70.o7;
import z70.p5;
import z70.q6;
import z70.r6;
import z70.s6;
import z70.t5;
import z70.v5;
import z70.v6;
import z70.w5;
import z70.w6;
import z70.x5;
import z70.y5;
import z70.z5;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class u2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static k2 c(ea.e eVar, aa.w wVar) {
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
        m90.e eVar2 = m90.e.a;
        m90.b c = m90.e.c(eVar, wVar);
        eVar.s0();
        l5 c2 = q6.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new k2(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, k2 k2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, k2Var.b);
        m90.e eVar = m90.e.a;
        m90.e.d(fVar, wVar, k2Var.c);
        List list = q6.a;
        l5 l5Var = k2Var.d;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l5Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, l5Var.a);
        fVar.z0("url");
        bVar2.b(fVar, wVar, l5Var.b);
        fVar.z0("id");
        bVar2.b(fVar, wVar, l5Var.c);
        fVar.z0("headRefOid");
        bVar2.b(fVar, wVar, l5Var.d);
        fVar.z0("headRepository");
        aa.c.b(aa.c.c(w5.a, false)).b(fVar, wVar, l5Var.e);
        fVar.z0("baseRepository");
        aa.c.b(aa.c.c(p5.a, false)).b(fVar, wVar, l5Var.f);
        fVar.z0("title");
        bVar2.b(fVar, wVar, l5Var.g);
        fVar.z0("titleHTML");
        bVar2.b(fVar, wVar, l5Var.h);
        fVar.z0("createdAt");
        h6.Companion.getClass();
        wVar.e(h6.a).b(fVar, wVar, l5Var.i);
        fVar.z0("viewerCanDeleteHeadRef");
        aa.b bVar3 = aa.c.f;
        f4.C(l5Var.j, bVar3, fVar, wVar, "viewerDidAuthor");
        f4.C(l5Var.k, bVar3, fVar, wVar, "locked");
        f4.C(l5Var.l, bVar3, fVar, wVar, "author");
        aa.c.b(aa.c.c(n5.a, true)).b(fVar, wVar, l5Var.m);
        fVar.z0("isReadByViewer");
        aa.c.k.b(fVar, wVar, l5Var.n);
        fVar.z0("bodyHtml");
        bVar2.b(fVar, wVar, l5Var.o);
        fVar.z0("number");
        Integer valueOf = Integer.valueOf(l5Var.p);
        nn.a aVar = y20.a.a;
        aVar.b(fVar, wVar, valueOf);
        fVar.z0("pullRequestState");
        fVar.I(l5Var.q.r);
        fVar.z0("changedFiles");
        aVar.b(fVar, wVar, Integer.valueOf(l5Var.r));
        fVar.z0("additions");
        aVar.b(fVar, wVar, Integer.valueOf(l5Var.s));
        fVar.z0("deletions");
        aVar.b(fVar, wVar, Integer.valueOf(l5Var.t));
        fVar.z0("mergeStateStatus");
        fVar.I(l5Var.u.r);
        fVar.z0("mergedBy");
        aa.c.b(aa.c.c(a6.a, true)).b(fVar, wVar, l5Var.v);
        fVar.z0("mergeCommit");
        aa.c.b(aa.c.c(z5.a, false)).b(fVar, wVar, l5Var.w);
        fVar.z0("reviewDecision");
        aa.c.b(ic0.b.b).b(fVar, wVar, l5Var.x);
        fVar.z0("isDraft");
        f4.C(l5Var.y, bVar3, fVar, wVar, "requiredStatusChecks");
        aa.c.c(r6.a, false).b(fVar, wVar, l5Var.z);
        fVar.z0("baseRef");
        aa.c.b(aa.c.c(o5.a, false)).b(fVar, wVar, l5Var.A);
        fVar.z0("baseRefName");
        bVar2.b(fVar, wVar, l5Var.B);
        fVar.z0("headRef");
        aa.c.b(aa.c.c(v5.a, false)).b(fVar, wVar, l5Var.C);
        fVar.z0("headRefName");
        bVar2.b(fVar, wVar, l5Var.D);
        fVar.z0("milestone");
        aa.c.b(aa.c.c(b6.a, true)).b(fVar, wVar, l5Var.E);
        fVar.z0("projectCards");
        aa.c.c(n6.a, false).b(fVar, wVar, l5Var.F);
        fVar.z0("reviewRequests");
        aa.c.b(aa.c.c(s6.a, false)).b(fVar, wVar, l5Var.G);
        fVar.z0("latestReviews");
        aa.c.b(aa.c.c(y5.a, false)).b(fVar, wVar, l5Var.H);
        fVar.z0("latestOpinionatedReviews");
        aa.c.b(aa.c.c(x5.a, false)).b(fVar, wVar, l5Var.I);
        fVar.z0("suggestedReviewers");
        aa.c.a(aa.c.b(aa.c.c(v6.a, false))).e(fVar, wVar, l5Var.J);
        fVar.z0("actionRequiredWorkflowRunCount");
        aVar.b(fVar, wVar, Integer.valueOf(l5Var.K));
        fVar.z0("commits");
        aa.c.c(t5.a, false).b(fVar, wVar, l5Var.L);
        fVar.z0("viewerLatestReview");
        aa.c.b(aa.c.c(w6.a, false)).b(fVar, wVar, l5Var.M);
        fVar.z0("viewerCanReopen");
        f4.C(l5Var.N, bVar3, fVar, wVar, "viewerCanMergeAsAdmin");
        f4.C(l5Var.O, bVar3, fVar, wVar, "viewerCanAssign");
        f4.C(l5Var.P, bVar3, fVar, wVar, "viewerCanLabel");
        bVar3.b(fVar, wVar, Boolean.valueOf(l5Var.Q));
        List list2 = c40.e.a;
        c40.e.d(fVar, wVar, l5Var.R);
        i80.e eVar2 = i80.e.a;
        i80.e.d(fVar, wVar, l5Var.S);
        List list3 = g70.b.a;
        g70.b.d(fVar, wVar, l5Var.T);
        List list4 = i30.j.a;
        i30.j.d(fVar, wVar, l5Var.U);
        List list5 = c60.n.a;
        c60.n.d(fVar, wVar, l5Var.V);
        List list6 = i60.g.a;
        i60.g.d(fVar, wVar, l5Var.W);
        List list7 = aa0.b.a;
        aa0.b.d(fVar, wVar, l5Var.X);
        List list8 = o7.a;
        o7.d(fVar, wVar, l5Var.Y);
        List list9 = z70.d.a;
        z70.d.d(fVar, wVar, l5Var.Z);
    }
}
