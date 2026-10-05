package jy0;

import aa.k;
import aa.m;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.le;
import pz0.td;
import pz0.xd;
import pz0.xn;
import pz0.zn;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2");
        List list = xx0.j.a;
        s c = no.a.c(list, "selections", "ProjectV2", n, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        xn.Companion.getClass();
        List n2 = d0.n(new m("nodes", l0.a(xn.d), (String) null, rVar, rVar, r));
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        zn.Companion.getClass();
        r b2 = l0.b(zn.a);
        le.Companion.getClass();
        a = l.r(new m[]{mVar2, mVar3, new m("projectsV2", b2, (String) null, rVar, l.r(new k[]{new k(le.o, new u0((Object) null)), new k(le.p, new u0(5))}), n2)});
    }
}
