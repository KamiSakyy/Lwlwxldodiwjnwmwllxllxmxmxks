package xk0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import gn0.a10;
import gn0.c10;
import gn0.e10;
import gn0.lb;
import gn0.pb;
import gn0.tb;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        e10.Companion.getClass();
        r b = l0.b(e10.s);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("identifier", b, (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("hidden", l0.b(lb.a), (String) null, rVar, rVar, rVar)});
        c10.Companion.getClass();
        m mVar2 = new m("navLinks", no.a.d(c10.a), (String) null, rVar, rVar, r);
        pb.Companion.getClass();
        x xVar = pb.a;
        m mVar3 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar2 = tb.a;
        List r2 = l.r(new m[]{mVar2, mVar3, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        a10.Companion.getClass();
        q0 q0Var = a10.c;
        k.g(q0Var, "type");
        a = l.r(new m[]{new m("dashboard", q0Var, (String) null, rVar, rVar, r2), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
