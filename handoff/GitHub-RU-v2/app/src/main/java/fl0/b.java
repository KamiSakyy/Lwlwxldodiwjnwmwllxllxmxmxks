package fl0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.eq;
import gn0.pb;
import gn0.rn;
import gn0.s00;
import gn0.tb;
import java.util.List;
import k71.k;
import pj0.i;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("Repository");
        List list = i.a;
        List r2 = l.r(new s[]{mVar2, no.a.c(list, "selections", "Repository", n, list), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s00.Companion.getClass();
        m mVar3 = new m("viewer", l0.b(s00.P), (String) null, rVar, rVar, r);
        eq.Companion.getClass();
        q0 q0Var = eq.m0;
        k.g(q0Var, "type");
        rn.Companion.getClass();
        a = l.r(new m[]{mVar3, new m("repository", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(rn.l, new u0(new t("repositoryName"))), new aa.k(rn.m, new u0(new t("repositoryOwner")))}), r2)});
    }
}
