package dy;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import ew.n;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.p00;
import m10.rf0;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = x61.l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("Repository");
        List list = n.a;
        List r2 = x61.l.r(new s[]{mVar2, no.a.c(list, "selections", "Repository", n, list), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        m mVar3 = new m("viewer", l0.b(rf0.g0), (String) null, rVar, rVar, r);
        i30.Companion.getClass();
        q0 q0Var = i30.w0;
        k71.k.g(q0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new m[]{mVar3, new m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new u0(new t("repositoryName"))), new aa.k(p00.m, new u0(new t("repositoryOwner")))}), r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
