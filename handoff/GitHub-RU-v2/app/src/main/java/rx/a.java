package rx;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.bg0;
import m10.dg0;
import m10.eh;
import m10.wg;
import m10.zf0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        dg0.Companion.getClass();
        r b = l0.b(dg0.s);
        x61.r rVar = x61.r.r;
        m mVar = new m("identifier", b, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("hidden", l0.b(wg.a), (String) null, rVar, rVar, rVar)});
        bg0.Companion.getClass();
        m mVar2 = new m("navLinks", no.a.d(bg0.a), (String) null, rVar, rVar, r);
        ah.Companion.getClass();
        x xVar = ah.a;
        m mVar3 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r2 = l.r(new m[]{mVar2, mVar3, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zf0.Companion.getClass();
        q0 q0Var = zf0.c;
        k.g(q0Var, "type");
        a = l.r(new m[]{new m("dashboard", q0Var, (String) null, rVar, rVar, r2), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
