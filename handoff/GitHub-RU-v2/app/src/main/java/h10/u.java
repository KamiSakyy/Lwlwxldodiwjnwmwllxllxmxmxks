package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.h60;
import m10.j60;
import m10.mr;
import m10.rf0;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class u {
    public static final List a;

    static {
        wg.Companion.getClass();
        aa.x xVar = wg.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        aa.m mVar2 = new aa.m("hasPreviousPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        ah.Companion.getClass();
        aa.x xVar3 = ah.a;
        List r2 = x61.l.r(new aa.m[]{new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("title", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("body", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r);
        h60.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(h60.a), (String) null, rVar, rVar, r2)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        j60.Companion.getClass();
        aa.q0 q0Var = j60.a;
        k71.k.g(q0Var, "type");
        rf0.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(rf0.g0), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar4, new aa.m("savedReplies", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rf0.P, new aa.u0(new aa.t("after"))), new aa.k(rf0.Q, new aa.u0(30))}), r3), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)})), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
