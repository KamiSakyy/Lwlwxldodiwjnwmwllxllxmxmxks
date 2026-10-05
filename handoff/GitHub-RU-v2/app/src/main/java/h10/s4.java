package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.mr;
import m10.p00;
import m10.sj;
import m10.uj;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class s4 {
    public static final List a;

    static {
        wg.Companion.getClass();
        aa.r b = v8.l0.b(wg.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r2 = x61.l.r(new aa.m[]{new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("color", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("description", xVar, (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        aa.m mVar2 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r);
        sj.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("nodes", v8.l0.a(sj.a), (String) null, rVar, rVar, r2)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        uj.Companion.getClass();
        aa.q0 q0Var = uj.a;
        k71.k.g(q0Var, "type");
        i30.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, new aa.m("labels", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(i30.s, new aa.u0(new aa.t("after"))), new aa.k(i30.t, new aa.u0(50)), new aa.k(i30.u, new aa.u0(x61.x.u(new w61.k[]{new w61.k("direction", "ASC"), new w61.k("field", "NAME")}))), new aa.k(i30.v, new aa.u0(new aa.t("query")))}), r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = i30.w0;
        k71.k.g(q0Var2, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("repo"))), new aa.k(p00.m, new aa.u0(new aa.t("owner")))}), r4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
