package uy0;

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
        List n = d0.n("Repository");
        List list = sy0.a.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "Repository", n, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s nVar = new n("Repository", d0.n("Repository"), r);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r2 = l.r(new s[]{mVar2, nVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        wk.Companion.getClass();
        j0 j0Var = wk.a;
        k.g(j0Var, "type");
        su.Companion.getClass();
        a = l.r(new m[]{new m("node", j0Var, (String) null, rVar, no.a.s(su.i, new u0(new t("repositoryId"))), r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
