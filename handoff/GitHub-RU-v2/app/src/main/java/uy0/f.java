package uy0;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.g80;
import pz0.jx;
import pz0.sk;
import pz0.td;
import pz0.xd;
import pz0.zd;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        td.Companion.getClass();
        r b = l0.b(td.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar = xd.a;
        k.g(xVar, "type");
        m mVar2 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        zd.Companion.getClass();
        x xVar2 = zd.a;
        List r = l.r(new m[]{mVar, mVar2, new m("descriptionHTML", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("shortDescriptionHTML", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        jx.Companion.getClass();
        q0 q0Var = jx.t0;
        k.g(q0Var, "type");
        List n = d0Shadow.n(new m("repository", q0Var, (String) null, rVar, rVar, r));
        g80.Companion.getClass();
        q0 q0Var2 = g80.a;
        k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = d0Shadow.n(new m("updateRepository", q0Var2, (String) null, rVar, no.a.s(sk.o1, new u0(x61.x.u(new w61.k("description", new t("description")), new w61.k("repositoryId", new t("repositoryId"))))), n));
    }
}
