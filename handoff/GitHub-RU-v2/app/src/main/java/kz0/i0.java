package kz0;

import java.util.List;
import pz0.mv;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i0 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Ref");
        List list = ru0.a.a;
        aa.s c = no.a.c(list, "selections", "Ref", n, list);
        td.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar)});
        mv.Companion.getClass();
        aa.q0 q0Var = mv.e;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("ref", q0Var, (String) null, rVar, rVar, r));
        pz0.n6.Companion.getClass();
        aa.q0 q0Var2 = pz0.n6.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("createRef", q0Var2, (String) null, rVar, no.a.s(sk.G, new aa.u0(x61.x.u(new w61.k("name", new aa.t("name")), new w61.k("oid", new aa.t("oid")), new w61.k("repositoryId", new aa.t("repositoryId"))))), n2));
    }
}
