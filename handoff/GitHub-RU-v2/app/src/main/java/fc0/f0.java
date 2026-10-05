package fc0;

import hc0.bb;
import hc0.fb;
import hc0.jn;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f0 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Ref");
        List list = v80.a.a;
        aa.s c = no.a.c(list, "selections", "Ref", n, list);
        bb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        jn.Companion.getClass();
        aa.q0 q0Var = jn.b;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("ref", q0Var, (String) null, rVar, rVar, r));
        hc0.o5.Companion.getClass();
        aa.q0 q0Var2 = hc0.o5.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("createRef", q0Var2, (String) null, rVar, no.a.s(wg.B, new aa.u0(x61.x.u(new w61.k("name", new aa.t("name")), new w61.k("oid", new aa.t("oid")), new w61.k("repositoryId", new aa.t("repositoryId"))))), n2));
    }
}
