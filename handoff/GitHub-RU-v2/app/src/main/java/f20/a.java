package f20;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.pm;
import hc0.ta;
import hc0.yg;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        bb.Companion.getClass();
        x xVar = bb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        ta.Companion.getClass();
        m mVar2 = new m("oid", l0.b(ta.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar2 = fb.a;
        k.g(xVar2, "type");
        List r = l.r(new s[]{new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("Commit", d0.n("Commit"), l.r(new m[]{mVar, mVar2, new m("updatesChannel", xVar2, (String) null, rVar, rVar, rVar)})), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        yg.Companion.getClass();
        j0 j0Var = yg.a;
        k.g(j0Var, "type");
        pm.Companion.getClass();
        a = d0.n(new m("node", j0Var, (String) null, rVar, no.a.s(pm.f, new u0(new t("id"))), r));
    }
}
