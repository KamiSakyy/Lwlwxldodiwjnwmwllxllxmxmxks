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
public abstract class m {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new aa.m("id", b, (String) null, rVar, rVar, rVar));
        List n2 = d0Shadow.n(new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar));
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = x61.l.r(new aa.s[]{new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("Issue", d0Shadow.n("Issue"), n), new aa.n("PullRequest", d0Shadow.n("PullRequest"), n2)});
        aa.s mVar = new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar2 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = d0Shadow.n("Repository");
        List list = k.a;
        aa.s c = no.a.c(list, "selections", "Repository", n3, list);
        List r2 = x61.l.r(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team"});
        List list2 = zw.a.a;
        aa.s c2 = no.a.c(list2, "selections", "Subscribable", r2, list2);
        si.Companion.getClass();
        x0 x0Var = si.a;
        k71.k.g(x0Var, "type");
        i30.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar, mVar2, c, c2, new aa.m("issueOrPullRequest", x0Var, (String) null, rVar, no.a.s(i30.n, new u0(new aa.t("number"))), r)});
    }
}
