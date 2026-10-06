package xx0;

import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.dr;
import pz0.h50;
import pz0.jx;
import pz0.o7;
import pz0.pd;
import pz0.rx;
import pz0.td;
import pz0.vd;
import pz0.xd;
import pz0.xn;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new m("login", b, (String) null, rVar, rVar, rVar));
        List n2 = d0Shadow.n(new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar));
        s mVar = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = l.r(new s[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("User", d0Shadow.n("User"), n), new n("Organization", d0Shadow.n("Organization"), n2)});
        List r2 = l.r(new m[]{new m("nameWithOwner", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        vd.Companion.getClass();
        x xVar3 = vd.a;
        m mVar2 = new m("totalCount", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        jx.Companion.getClass();
        List r3 = l.r(new m[]{mVar2, new m("nodes", l0.a(jx.t0), (String) null, rVar, rVar, r2)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        m mVar6 = new m("updatedAt", l0.b(o7.a), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("shortDescription", xVar, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar4 = pd.a;
        m mVar8 = new m("public", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        m mVar9 = new m("url", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        m mVar10 = new m("closed", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        dr.Companion.getClass();
        m mVar11 = new m("owner", l0.b(dr.g), (String) null, rVar, rVar, r);
        rx.Companion.getClass();
        r b2 = l0.b(rx.a);
        xn.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, new m("repositories", b2, (String) null, rVar, no.a.s(xn.b, new u0(1)), r3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
