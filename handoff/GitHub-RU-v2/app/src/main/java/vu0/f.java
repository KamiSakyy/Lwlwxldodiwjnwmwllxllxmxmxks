package vu0;

import aa.x;
import java.util.List;
import pz0.td;
import pz0.xd;
import pz0.xn;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2");
        List list = xx0.i.a;
        aa.s c = no.a.c(list, "selections", "ProjectV2", n, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xn.Companion.getClass();
        aa.s mVar3 = new aa.m("project", l0.b(xn.d), (String) null, rVar, rVar, r);
        List n2 = d0.n("ProjectV2Item");
        List list2 = jy0.j.a;
        a = x61.l.r(new aa.s[]{mVar2, mVar3, no.a.c(list2, "selections", "ProjectV2Item", n2, list2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
