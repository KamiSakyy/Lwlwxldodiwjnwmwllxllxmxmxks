package vu0;

import aa.u0;
import aa.x;
import java.util.List;
import pz0.hm;
import pz0.le;
import pz0.td;
import pz0.ve;
import pz0.xd;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("PageInfo");
        List list = nw0.a.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "PageInfo", n, list)});
        aa.s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("Issue");
        List list2 = q.a;
        aa.s c = no.a.c(list2, "selections", "Issue", n2, list2);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", l0.b(hm.a), (String) null, rVar, rVar, r);
        le.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", l0.a(le.A), (String) null, rVar, rVar, r2)});
        aa.m mVar4 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ve.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar4, new aa.m("subIssues", l0.b(ve.a), (String) null, rVar, no.a.s(le.q, new u0(100)), r3), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
