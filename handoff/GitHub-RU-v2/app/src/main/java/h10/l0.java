package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.j10;
import m10.r9;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Ref");
        List list = aw.a.a;
        aa.s c = no.a.c(list, "selections", "Ref", n, list);
        ah.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        j10.Companion.getClass();
        aa.q0 q0Var = j10.e;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("ref", q0Var, (String) null, rVar, rVar, r));
        r9.Companion.getClass();
        aa.q0 q0Var2 = r9.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("createRef", q0Var2, (String) null, rVar, no.a.s(vp.J, new aa.u0(x61.x.u(new w61.k[]{new w61.k("name", new aa.t("name")), new w61.k("oid", new aa.t("oid")), new w61.k("repositoryId", new aa.t("repositoryId"))}))), n2));
    }
}
