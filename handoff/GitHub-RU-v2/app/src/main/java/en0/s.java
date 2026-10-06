package en0;

import gn0.jj;
import gn0.lb;
import gn0.pb;
import gn0.s00;
import gn0.tb;
import gn0.xs;
import gn0.zs;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s {
    public static final List a;

    static {
        lb.Companion.getClass();
        aa.x xVar = lb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        aa.m mVar2 = new aa.m("hasPreviousPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        aa.x xVar2 = tb.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        pb.Companion.getClass();
        aa.x xVar3 = pb.a;
        List r2 = x61.l.r(new aa.m[]{new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("title", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("body", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(jj.a), (String) null, rVar, rVar, r);
        xs.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(xs.a), (String) null, rVar, rVar, r2)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        zs.Companion.getClass();
        aa.q0 q0Var = zs.a;
        k71.k.g(q0Var, "type");
        s00.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("viewer", v8.l0.b(s00.P), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar4, new aa.m("savedReplies", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(s00.E, new aa.u0(new aa.t("after"))), new aa.k(s00.F, new aa.u0(30))}), r3), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)})));
    }
}
