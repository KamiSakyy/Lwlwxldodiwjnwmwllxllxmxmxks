package tb0;

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
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("Repository");
        List list = sb0.a.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "Repository", n, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s nVar = new n("Repository", d0.n("Repository"), r);
        bb.Companion.getClass();
        List r2 = l.r(new s[]{mVar2, nVar, new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        yg.Companion.getClass();
        j0 j0Var = yg.a;
        k.g(j0Var, "type");
        pm.Companion.getClass();
        a = d0.n(new m("node", j0Var, (String) null, rVar, no.a.s(pm.f, new u0(new t("repositoryId"))), r2));
    }
}
