package dy;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import aa.x0;
import hv.n;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.p00;
import m10.si;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("Issue");
        List list = dt.d.a;
        s c = no.a.c(list, "selections", "Issue", n, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = x61.l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("PullRequest");
        List list2 = n.a;
        List r2 = x61.l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Issue", d0.n("Issue"), r), new aa.n("PullRequest", d0.n("PullRequest"), x61.l.r(new s[]{mVar2, no.a.c(list2, "selections", "PullRequest", n2, list2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        si.Companion.getClass();
        x0 x0Var = si.a;
        k71.k.g(x0Var, "type");
        i30.Companion.getClass();
        List r3 = x61.l.r(new m[]{mVar3, new m("issueOrPullRequest", x0Var, (String) null, rVar, no.a.s(i30.n, new u0(new t("number"))), r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = i30.w0;
        k71.k.g(q0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new m[]{new m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new u0(new t("repositoryName"))), new aa.k(p00.m, new u0(new t("repositoryOwner")))}), r3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
