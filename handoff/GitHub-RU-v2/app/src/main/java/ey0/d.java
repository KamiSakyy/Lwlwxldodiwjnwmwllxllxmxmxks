package ey0;

import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.bm;
import pz0.su;
import pz0.td;
import pz0.xd;
import pz0.zn;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2Connection");
        List list = xx0.a.a;
        List r = x61.l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2Connection", n, list)});
        zn.Companion.getClass();
        r b2 = l0.b(zn.a);
        bm.Companion.getClass();
        aa.m mVar2 = new aa.m("recentProjects", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(bm.b, new u0(new t("after"))), new aa.k(bm.c, new u0(new t("number")))}), r);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = bm.o;
        k71.k.g(q0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("organization", q0Var, (String) null, rVar, no.a.s(su.j, new u0(new t("orgLogin"))), r2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
