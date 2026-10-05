package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.mr;
import m10.p00;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class x1 {
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
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("CodeSearchResult");
        List list = f10.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list, "selections", "CodeSearchResult", n, list)});
        mr.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r);
        m10.f5.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(m10.f5.a), (String) null, rVar, rVar, r2)});
        m10.b5.Companion.getClass();
        aa.r b2 = v8.l0.b(m10.b5.a);
        p00.Companion.getClass();
        aa.m mVar4 = new aa.m("codeSearch", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.a, new aa.u0(new aa.t("after"))), new aa.k(p00.b, new aa.u0(new aa.t("first"))), new aa.k(p00.c, new aa.u0(new aa.t("query")))}), r3);
        ah.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar4, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
