package qw0;

import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import aa.x0;
import java.util.List;
import k71.k;
import pz0.jx;
import pz0.su;
import pz0.td;
import pz0.xd;
import pz0.xe;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Issue");
        List list = vr0.c.a;
        s c = no.a.c(list, "selections", "Issue", n, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("PullRequest");
        List list2 = yt0.m.a;
        List r2 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Issue", d0Shadow.n("Issue"), r), new n("PullRequest", d0Shadow.n("PullRequest"), l.r(new s[]{mVar2, no.a.c(list2, "selections", "PullRequest", n2, list2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        xe.Companion.getClass();
        x0 x0Var = xe.a;
        k.g(x0Var, "type");
        jx.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("issueOrPullRequest", x0Var, (String) null, rVar, no.a.s(jx.q, new u0(new t("number"))), r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = jx.t0;
        k.g(q0Var, "type");
        su.Companion.getClass();
        a = l.r(new m[]{new m("repository", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(su.l, new u0(new t("repositoryName"))), new aa.k(su.m, new u0(new t("repositoryOwner")))}), r3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
