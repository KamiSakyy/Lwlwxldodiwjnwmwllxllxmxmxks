package gw0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import pz0.e90;
import pz0.g90;
import pz0.i90;
import pz0.pd;
import pz0.td;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        i90.Companion.getClass();
        r b = l0.b(i90.s);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("identifier", b, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("hidden", l0.b(pd.a), (String) null, rVar, rVar, rVar)});
        g90.Companion.getClass();
        m mVar2 = new m("navLinks", no.a.d(g90.a), (String) null, rVar, rVar, r);
        td.Companion.getClass();
        x xVar = td.a;
        m mVar3 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List r2 = l.r(new m[]{mVar2, mVar3, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        e90.Companion.getClass();
        q0 q0Var = e90.c;
        k.g(q0Var, "type");
        a = l.r(new m[]{new m("dashboard", q0Var, (String) null, rVar, rVar, r2), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
