package qw0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.jx;
import pz0.su;
import pz0.td;
import pz0.w80;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("Repository");
        List list = vu0.m.a;
        List r2 = l.r(new s[]{mVar2, no.a.c(list, "selections", "Repository", n, list), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        w80.Companion.getClass();
        m mVar3 = new m("viewer", l0.b(w80.W), (String) null, rVar, rVar, r);
        jx.Companion.getClass();
        q0 q0Var = jx.t0;
        k.g(q0Var, "type");
        su.Companion.getClass();
        a = l.r(new m[]{mVar3, new m("repository", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(su.l, new u0(new t("repositoryName"))), new aa.k(su.m, new u0(new t("repositoryOwner")))}), r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
