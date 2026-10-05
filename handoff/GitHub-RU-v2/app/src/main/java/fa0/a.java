package fa0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.sz;
import hc0.uz;
import hc0.wz;
import hc0.xa;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        wz.Companion.getClass();
        r b = l0.b(wz.s);
        x61.r rVar = x61.r.r;
        m mVar = new m("identifier", b, (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("hidden", l0.b(xa.a), (String) null, rVar, rVar, rVar)});
        uz.Companion.getClass();
        m mVar2 = new m("navLinks", no.a.d(uz.a), (String) null, rVar, rVar, r);
        bb.Companion.getClass();
        x xVar = bb.a;
        m mVar3 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar2 = fb.a;
        List r2 = l.r(new m[]{mVar2, mVar3, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        sz.Companion.getClass();
        q0 q0Var = sz.c;
        k.g(q0Var, "type");
        a = l.r(new m[]{new m("dashboard", q0Var, (String) null, rVar, rVar, r2), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
