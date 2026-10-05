package fc0;

import hc0.bb;
import hc0.fb;
import hc0.ji;
import hc0.kz;
import hc0.tr;
import hc0.vr;
import hc0.xa;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s {
    public static final List a;

    static {
        xa.Companion.getClass();
        aa.x xVar = xa.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        aa.m mVar2 = new aa.m("hasPreviousPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        aa.x xVar2 = fb.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        bb.Companion.getClass();
        aa.x xVar3 = bb.a;
        List r2 = x61.l.r(new aa.m[]{new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("title", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("body", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ji.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(ji.a), (String) null, rVar, rVar, r);
        tr.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(tr.a), (String) null, rVar, rVar, r2)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        vr.Companion.getClass();
        aa.q0 q0Var = vr.a;
        k71.k.g(q0Var, "type");
        kz.Companion.getClass();
        a = sy.d0.n(new aa.m("viewer", v8.l0.b(kz.O), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar4, new aa.m("savedReplies", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(kz.E, new aa.u0(new aa.t("after"))), new aa.k(kz.F, new aa.u0(30))}), r3), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)})));
    }
}
