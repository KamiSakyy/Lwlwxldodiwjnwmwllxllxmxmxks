package qw0;

import aa.j0;
import aa.m;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.su;
import pz0.td;
import pz0.wk;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        s mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0.n("PullRequest");
        List list = vu0.g.a;
        s c = no.a.c(list, "selections", "PullRequest", n, list);
        List n2 = d0.n("Issue");
        List list2 = vu0.a.a;
        List r = l.r(new s[]{mVar, mVar2, c, no.a.c(list2, "selections", "Issue", n2, list2)});
        wk.Companion.getClass();
        j0 j0Var = wk.a;
        k.g(j0Var, "type");
        su.Companion.getClass();
        a = l.r(new m[]{new m("node", j0Var, (String) null, rVar, no.a.s(su.i, new u0(new t("id"))), r), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
