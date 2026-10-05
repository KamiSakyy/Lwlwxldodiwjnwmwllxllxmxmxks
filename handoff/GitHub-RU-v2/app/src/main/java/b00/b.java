package b00;

import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.l4;
import m10.su;
import m10.vp;
import sy.d0;
import v8.l0;
import x61.x;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        eh.Companion.getClass();
        r b = l0.b(eh.a);
        x61.r rVar = x61.r.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2Item");
        List list = g00.j.a;
        s c = no.a.c(list, "selections", "ProjectV2Item", n, list);
        ah.Companion.getClass();
        List r = x61.l.r(new s[]{mVar, c, new aa.m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        su.Companion.getClass();
        q0 q0Var = su.b;
        k71.k.g(q0Var, "type");
        List n2 = d0.n(new aa.m("projectV2Item", q0Var, (String) null, rVar, rVar, r));
        l4.Companion.getClass();
        q0 q0Var2 = l4.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = d0.n(new aa.m("clearProjectV2ItemFieldValue", q0Var2, (String) null, rVar, no.a.s(vp.w, new u0(x.u(new w61.k[]{new w61.k("fieldId", new t("fieldId")), new w61.k("itemId", new t("itemId")), new w61.k("projectId", new t("projectId"))}))), n2));
    }
}
