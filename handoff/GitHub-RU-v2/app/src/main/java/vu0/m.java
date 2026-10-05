package vu0;

import aa.u0;
import aa.x;
import aa.x0;
import java.util.List;
import pz0.jx;
import pz0.td;
import pz0.xd;
import pz0.xe;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team", "TeamDiscussion"});
        List list = ov0.a.a;
        aa.s c = no.a.c(list, "selections", "Subscribable", r, list);
        List n = d0.n("Issue");
        List list2 = l.a;
        aa.s c2 = no.a.c(list2, "selections", "Issue", n, list2);
        List n2 = d0.n("Issue");
        List list3 = a.a;
        aa.s c3 = no.a.c(list3, "selections", "Issue", n2, list3);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r2 = x61.l.r(new aa.s[]{mVar, c, c2, c3, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s nVar = new aa.n("Subscribable", x61.l.r(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team", "TeamDiscussion"}), list);
        List n3 = d0.n("PullRequest");
        List list4 = yt0.o.a;
        aa.s c4 = no.a.c(list4, "selections", "PullRequest", n3, list4);
        List n4 = d0.n("PullRequest");
        List list5 = g.a;
        List r3 = x61.l.r(new aa.s[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Issue", d0.n("Issue"), r2), new aa.n("PullRequest", d0.n("PullRequest"), x61.l.r(new aa.s[]{mVar2, nVar, c4, no.a.c(list5, "selections", "PullRequest", n4, list5), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        aa.s mVar3 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n5 = d0.n("Repository");
        List list6 = k.a;
        aa.s c5 = no.a.c(list6, "selections", "Repository", n5, list6);
        aa.s nVar2 = new aa.n("Subscribable", x61.l.r(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team", "TeamDiscussion"}), list);
        xe.Companion.getClass();
        x0 x0Var = xe.a;
        k71.k.g(x0Var, "type");
        jx.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar3, mVar4, c5, nVar2, new aa.m("issueOrPullRequest", x0Var, (String) null, rVar, no.a.s(jx.q, new u0(new aa.t("number"))), r3)});
    }
}
