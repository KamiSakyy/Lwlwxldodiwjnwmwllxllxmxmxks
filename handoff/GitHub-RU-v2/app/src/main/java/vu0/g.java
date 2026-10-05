package vu0;

import aa.u0;
import aa.x;
import java.util.List;
import pz0.hs;
import pz0.lp;
import pz0.np;
import pz0.td;
import pz0.xd;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2Item");
        List list = f.a;
        aa.s c = no.a.c(list, "selections", "ProjectV2Item", n, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        lp.Companion.getClass();
        List n2 = d0.n(new aa.m("nodes", l0.a(lp.b), (String) null, rVar, rVar, r));
        aa.m mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        np.Companion.getClass();
        aa.r b2 = l0.b(np.a);
        hs.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar2, new aa.m("projectItems", b2, (String) null, rVar, no.a.s(hs.u, new u0(25)), n2), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
