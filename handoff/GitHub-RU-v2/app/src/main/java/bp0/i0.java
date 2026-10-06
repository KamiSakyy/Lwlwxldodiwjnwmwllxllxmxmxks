package bp0;

import aa.q0;
import aa.u0;
import java.util.List;
import pz0.f30;
import pz0.h50;
import pz0.hs;
import pz0.jx;
import pz0.n30;
import pz0.ny;
import pz0.ps;
import pz0.s4;
import pz0.td;
import pz0.ts;
import pz0.vd;
import pz0.vs;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i0 {
    public static final List a;

    static {
        td.Companion.getClass();
        aa.x xVar = td.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ny.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, new aa.m("owner", l0.b(ny.e), (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        n30.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{new aa.m("state", l0.b(n30.s), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        f30.Companion.getClass();
        q0 q0Var = f30.c;
        k71.k.g(q0Var, "type");
        List r4 = x61.l.r(new aa.m[]{new aa.m("statusCheckRollup", q0Var, (String) null, rVar, rVar, r3), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s4.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{new aa.m("commit", l0.b(s4.j), (String) null, rVar, rVar, r4), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ps.Companion.getClass();
        q0 q0Var2 = ps.a;
        k71.k.g(q0Var2, "type");
        List n = sy.d0Shadow.n(new aa.m("node", q0Var2, (String) null, rVar, rVar, r5));
        vs.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("edges", l0.a(vs.a), (String) null, rVar, rVar, n));
        aa.m mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("title", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        aa.m mVar6 = new aa.m("number", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.m mVar7 = new aa.m("url", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        jx.Companion.getClass();
        aa.m mVar8 = new aa.m("repository", l0.b(jx.t0), (String) null, rVar, rVar, r2);
        ts.Companion.getClass();
        aa.r b2 = l0.b(ts.a);
        hs.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar4, mVar5, mVar6, mVar7, mVar8, new aa.m("commits", b2, (String) null, rVar, no.a.s(hs.l, new u0(1)), n2), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
