package xx0;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import pz0.hm;
import pz0.pd;
import pz0.td;
import pz0.xd;
import pz0.xn;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2");
        List list = j.a;
        s c = no.a.c(list, "selections", "ProjectV2", n, list);
        td.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar)});
        pd.Companion.getClass();
        x xVar2 = pd.a;
        List r2 = l.r(new m[]{new m("hasNextPage", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("endCursor", xVar, (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        xn.Companion.getClass();
        m mVar2 = new m("nodes", l0.a(xn.d), (String) null, rVar, rVar, r);
        hm.Companion.getClass();
        a = l.r(new m[]{mVar2, new m("pageInfo", l0.b(hm.a), (String) null, rVar, rVar, r2)});
    }
}
