package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.mr;
import m10.q30;
import m10.rf0;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class u5 {
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
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Repository");
        List list = ew.q.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        List n2 = sy.d0.n("Repository");
        List list2 = ew.b.a;
        aa.s c2 = no.a.c(list2, "selections", "Repository", n2, list2);
        aa.s mVar4 = new aa.m("hasIssuesEnabled", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar5 = new aa.m("isDiscussionsEnabled", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar6 = new aa.m("isArchived", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar3 = ah.a;
        List r2 = x61.l.r(new aa.s[]{mVar3, c, c2, mVar4, mVar5, mVar6, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        aa.m mVar7 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r);
        i30.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar7, new aa.m("nodes", v8.l0.a(i30.w0), (String) null, rVar, rVar, r2)});
        q30.Companion.getClass();
        aa.r b2 = v8.l0.b(q30.a);
        rf0.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(rf0.g0), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("topRepositories", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rf0.W, new aa.u0(new aa.t("after"))), new aa.k(rf0.X, new aa.u0(new aa.t("first"))), new aa.k(rf0.Y, new aa.u0(x61.x.u(new w61.k[]{new w61.k("direction", "DESC"), new w61.k("field", "PUSHED_AT")}))), new aa.k(rf0.Z, new aa.u0(new aa.t("type")))}), r3), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)})), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
