package ew;

import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.ki;
import m10.mr;
import m10.wh;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class s {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("PageInfo");
        List list = yx.a.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "PageInfo", n, list)});
        aa.s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("Issue");
        List list2 = r.a;
        aa.s c = no.a.c(list2, "selections", "Issue", n2, list2);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", l0.b(mr.a), (String) null, rVar, rVar, r);
        wh.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", l0.a(wh.B), (String) null, rVar, rVar, r2)});
        aa.m mVar4 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ki.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar4, new aa.m("subIssues", l0.b(ki.a), (String) null, rVar, no.a.s(wh.q, new u0(100)), r3), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
