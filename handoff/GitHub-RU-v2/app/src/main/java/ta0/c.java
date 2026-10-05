package ta0;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.pm;
import hc0.yz;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        bb.Companion.getClass();
        r b = l0.b(bb.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar = fb.a;
        List r = l.r(new m[]{mVar, new m("slug", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("description", xVar, (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        yz.Companion.getClass();
        q0 q0Var = yz.c;
        k.g(q0Var, "type");
        pm.Companion.getClass();
        a = d0.n(new m("list", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(pm.d, new u0(new t("login"))), new aa.k(pm.e, new u0(new t("slug")))}), r));
    }
}
