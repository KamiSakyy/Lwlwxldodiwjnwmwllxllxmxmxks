package en0;

import gn0.dj;
import gn0.jj;
import gn0.lb;
import gn0.mx;
import gn0.pb;
import gn0.rn;
import gn0.sw;
import gn0.tb;
import gn0.uw;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t2 {
    public static final List a;

    static {
        lb.Companion.getClass();
        aa.r b = v8.l0.b(lb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        aa.x xVar3 = mx.a;
        k71.k.g(xVar3, "type");
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, new aa.m("avatarUrl", xVar3, (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        aa.m mVar5 = new aa.m("pageInfo", v8.l0.b(jj.a), (String) null, rVar, rVar, r);
        sw.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar5, new aa.m("nodes", v8.l0.a(sw.a), (String) null, rVar, rVar, r2)});
        uw.Companion.getClass();
        aa.r b2 = v8.l0.b(uw.a);
        dj.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("teams", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(dj.i, new aa.u0(new aa.t("after"))), new aa.k(dj.j, new aa.u0(50)), new aa.k(dj.k, new aa.u0(x61.x.u(new w61.k("direction", "ASC"), new w61.k("field", "NAME")))), new aa.k(dj.l, new aa.u0(new aa.t("query")))}), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = dj.m;
        k71.k.g(q0Var, "type");
        rn.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("organization", q0Var, (String) null, rVar, no.a.s(rn.j, new aa.u0(new aa.t("login"))), r4));
    }
}
