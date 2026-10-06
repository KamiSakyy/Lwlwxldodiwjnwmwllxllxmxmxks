package kz0;

import java.util.List;
import pz0.ba;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f0 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Discussion");
        List list = br0.e.a;
        aa.s c = no.a.c(list, "selections", "Discussion", n, list);
        td.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar)});
        ba.Companion.getClass();
        aa.q0 q0Var = ba.l;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("discussion", q0Var, (String) null, rVar, rVar, r));
        pz0.g6.Companion.getClass();
        aa.q0 q0Var2 = pz0.g6.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("createDiscussion", q0Var2, (String) null, rVar, no.a.s(sk.D, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("categoryId", new aa.t("categoryId")), new w61.k("repositoryId", new aa.t("repositoryId")), new w61.k("title", new aa.t("title"))))), n2));
    }
}
