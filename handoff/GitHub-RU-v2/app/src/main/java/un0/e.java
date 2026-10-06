package un0;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.hs;
import pz0.k2;
import pz0.su;
import pz0.td;
import pz0.wk;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e {
    public static final List a;

    static {
        td.Companion.getClass();
        x xVar = td.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        k2.Companion.getClass();
        x xVar2 = k2.a;
        k.g(xVar2, "type");
        m mVar2 = new m("fullDatabaseId", xVar2, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar3 = xd.a;
        k.g(xVar3, "type");
        hs.Companion.getClass();
        List r = l.r(new s[]{new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar), new n("PullRequest", d0Shadow.n("PullRequest"), l.r(new m[]{mVar, mVar2, new m("updatesChannel", xVar3, (String) null, rVar, no.a.s(hs.K, new u0(new t("topic"))), rVar)})), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        wk.Companion.getClass();
        j0 j0Var = wk.a;
        k.g(j0Var, "type");
        su.Companion.getClass();
        a = l.r(new m[]{new m("node", j0Var, (String) null, rVar, no.a.s(su.i, new u0(new t("id"))), r), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
