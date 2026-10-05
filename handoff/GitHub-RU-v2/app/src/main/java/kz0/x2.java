package kz0;

import java.util.List;
import pz0.ba;
import pz0.bm;
import pz0.jx;
import pz0.su;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x2 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Discussion");
        List list = br0.c.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Discussion", n, list)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s nVar = new aa.n("Discussion", sy.d0.n("Discussion"), r);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, nVar, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ba.Companion.getClass();
        aa.q0 q0Var = ba.l;
        k71.k.g(q0Var, "type");
        jx.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{new aa.m("discussion", q0Var, (String) null, rVar, no.a.s(jx.i, new aa.u0(new aa.t("discussionNumber"))), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = jx.t0;
        k71.k.g(q0Var2, "type");
        List r4 = x61.l.r(new aa.m[]{new aa.m("organizationDiscussionsRepository", q0Var2, (String) null, rVar, rVar, r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        bm.Companion.getClass();
        aa.q0 q0Var3 = bm.o;
        k71.k.g(q0Var3, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("organization", q0Var3, (String) null, rVar, no.a.s(su.j, new aa.u0(new aa.t("repositoryOwner"))), r4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
