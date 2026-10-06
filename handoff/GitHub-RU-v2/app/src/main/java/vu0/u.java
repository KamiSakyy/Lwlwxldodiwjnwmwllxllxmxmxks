package vu0;

import aa.u0;
import aa.x;
import java.util.List;
import pz0.jx;
import pz0.k90;
import pz0.m90;
import pz0.td;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class u {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("UserList");
        List list = gw0.g.a;
        aa.s c = no.a.c(list, "selections", "UserList", n, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        k90.Companion.getClass();
        List n2 = d0Shadow.n(new aa.m("nodes", l0.a(k90.c), (String) null, rVar, rVar, r));
        aa.m mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m90.Companion.getClass();
        aa.r b2 = l0.b(m90.a);
        jx.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar2, new aa.m("lists", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(jx.z, new u0(100)), new aa.k(jx.A, new u0(Boolean.TRUE))}), n2), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
