package ew;

import aa.u0;
import aa.x;
import aa.x0;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.si;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team"});
        List list = zw.a.a;
        aa.s c = no.a.c(list, "selections", "Subscribable", r, list);
        List n = d0Shadow.n("Issue");
        List list2 = l.a;
        aa.s c2 = no.a.c(list2, "selections", "Issue", n, list2);
        List n2 = d0Shadow.n("Issue");
        List list3 = a.a;
        aa.s c3 = no.a.c(list3, "selections", "Issue", n2, list3);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r2 = x61.l.r(new aa.s[]{mVar, c, c2, c3, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s nVar = new aa.n("Subscribable", x61.l.r(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team"}), list);
        List n3 = d0Shadow.n("PullRequest");
        List list4 = hv.p.a;
        aa.s c4 = no.a.c(list4, "selections", "PullRequest", n3, list4);
        List n4 = d0Shadow.n("PullRequest");
        List list5 = g.a;
        List r3 = x61.l.r(new aa.s[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Issue", d0Shadow.n("Issue"), r2), new aa.n("PullRequest", d0Shadow.n("PullRequest"), x61.l.r(new aa.s[]{mVar2, nVar, c4, no.a.c(list5, "selections", "PullRequest", n4, list5), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        aa.s mVar3 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n5 = d0Shadow.n("Repository");
        List list6 = k.a;
        aa.s c5 = no.a.c(list6, "selections", "Repository", n5, list6);
        aa.s nVar2 = new aa.n("Subscribable", x61.l.r(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team"}), list);
        si.Companion.getClass();
        x0 x0Var = si.a;
        k71.k.g(x0Var, "type");
        i30.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar3, mVar4, c5, nVar2, new aa.m("issueOrPullRequest", x0Var, (String) null, rVar, no.a.s(i30.n, new u0(new aa.t("number"))), r3)});
    }
}
