package fc0;

import hc0.ap;
import hc0.bb;
import hc0.di;
import hc0.fb;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class w0 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("name", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ap.Companion.getClass();
        aa.q0 q0Var = ap.k0;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{new aa.m("organizationDiscussionsRepository", q0Var, (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        di.Companion.getClass();
        aa.q0 q0Var2 = di.m;
        k71.k.g(q0Var2, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("organization", q0Var2, (String) null, rVar, no.a.s(pm.g, new aa.u0(new aa.t("ownerName"))), r2));
    }
}
