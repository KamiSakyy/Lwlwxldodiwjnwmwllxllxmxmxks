package kz0;

import java.util.List;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e0 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Commit");
        List list = dq0.b.a;
        aa.s c = no.a.c(list, "selections", "Commit", n, list);
        td.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar)});
        pz0.s4.Companion.getClass();
        aa.q0 q0Var = pz0.s4.j;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("commit", q0Var, (String) null, rVar, rVar, r));
        pz0.z5.Companion.getClass();
        aa.q0 q0Var2 = pz0.z5.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("createCommitOnBranch", q0Var2, (String) null, rVar, no.a.s(sk.A, new aa.u0(new aa.t("input"))), n2));
    }
}
