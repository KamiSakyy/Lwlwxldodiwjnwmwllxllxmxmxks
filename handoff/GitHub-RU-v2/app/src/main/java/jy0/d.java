package jy0;

import a81.t;
import aa.m;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.gu;
import pz0.h50;
import pz0.hs;
import pz0.o7;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        s mVar2 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        s mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        x xVar2 = vd.a;
        s mVar4 = new m("number", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        s mVar5 = new m("url", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar3 = pd.a;
        s mVar6 = new m("locked", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        gu.Companion.getClass();
        s mVar7 = new m("state", l0.b(gu.s), "pullRequestState", rVar, rVar, rVar);
        s mVar8 = new m("isDraft", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        s mVar9 = new m("isInMergeQueue", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        x xVar4 = o7.a;
        s mVar10 = new m("updatedAt", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        s mVar11 = new m("createdAt", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        s mVar12 = new m("totalCommentsCount", xVar2, (String) null, rVar, rVar, rVar);
        r b2 = l0.b(xVar2);
        hs.Companion.getClass();
        t tVar = hs.C;
        s mVar13 = new m("taskListItemCount", b2, "completedTasksCount", rVar, no.a.s(tVar, new u0(d0.n("COMPLETE"))), rVar);
        s mVar14 = new m("taskListItemCount", l0.b(xVar2), "totalTaskCount", rVar, no.a.s(tVar, new u0(l.r(new String[]{"COMPLETE", "INCOMPLETE"}))), rVar);
        s mVar15 = new m("baseRefName", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar16 = new m("headRefName", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar17 = new m("viewerCanReopen", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        s mVar18 = new m("viewerCanUpdate", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        s mVar19 = new m("viewerDidAuthor", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List n = d0.n("PullRequest");
        List list = js0.a.a;
        a = l.r(new s[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, mVar16, mVar17, mVar18, mVar19, no.a.c(list, "selections", "PullRequest", n, list), new m("viewerCanAssign", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("viewerCanLabel", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
