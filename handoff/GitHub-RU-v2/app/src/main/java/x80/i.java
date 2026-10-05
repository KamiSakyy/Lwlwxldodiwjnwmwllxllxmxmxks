package x80;

import a80.o;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import aa.x0;
import hc0.ap;
import hc0.bb;
import hc0.fb;
import hc0.fc;
import java.util.List;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team", "TeamDiscussion"});
        List list = n90.a.a;
        s c = no.a.c(list, "selections", "Subscribable", r, list);
        List n = d0.n("Issue");
        List list2 = h.a;
        s c2 = no.a.c(list2, "selections", "Issue", n, list2);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r2 = x61.l.r(new s[]{mVar, c, c2, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s nVar = new n("Subscribable", x61.l.r(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team", "TeamDiscussion"}), list);
        List n2 = d0.n("PullRequest");
        List list3 = o.a;
        List r3 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Issue", d0.n("Issue"), r2), new n("PullRequest", d0.n("PullRequest"), x61.l.r(new s[]{mVar2, nVar, no.a.c(list3, "selections", "PullRequest", n2, list3), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        s mVar3 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar4 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n3 = d0.n("Repository");
        List list4 = g.a;
        s c3 = no.a.c(list4, "selections", "Repository", n3, list4);
        s nVar2 = new n("Subscribable", x61.l.r(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team", "TeamDiscussion"}), list);
        fc.Companion.getClass();
        x0 x0Var = fc.a;
        k71.k.g(x0Var, "type");
        ap.Companion.getClass();
        a = x61.l.r(new s[]{mVar3, mVar4, c3, nVar2, new aa.m("issueOrPullRequest", x0Var, (String) null, rVar, no.a.s(ap.p, new u0(new t("number"))), r3)});
    }
}
