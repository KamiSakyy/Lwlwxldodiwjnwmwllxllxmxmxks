package pa0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import hc0.ap;
import hc0.bb;
import hc0.fb;
import hc0.kz;
import hc0.pm;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;
import x80.i;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("Repository");
        List list = i.a;
        List r2 = l.r(new s[]{mVar2, no.a.c(list, "selections", "Repository", n, list), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        kz.Companion.getClass();
        m mVar3 = new m("viewer", l0.b(kz.O), (String) null, rVar, rVar, r);
        ap.Companion.getClass();
        q0 q0Var = ap.k0;
        k.g(q0Var, "type");
        pm.Companion.getClass();
        a = l.r(new m[]{mVar3, new m("repository", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(pm.i, new u0(new t("repositoryName"))), new aa.k(pm.j, new u0(new t("repositoryOwner")))}), r2)});
    }
}
