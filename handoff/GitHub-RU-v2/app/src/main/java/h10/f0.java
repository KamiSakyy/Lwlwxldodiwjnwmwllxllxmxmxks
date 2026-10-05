package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.vp;
import m10.z8;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Commit");
        List list = fr.b.a;
        aa.s c = no.a.c(list, "selections", "Commit", n, list);
        ah.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        m10.y5.Companion.getClass();
        aa.q0 q0Var = m10.y5.j;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("commit", q0Var, (String) null, rVar, rVar, r));
        z8.Companion.getClass();
        aa.q0 q0Var2 = z8.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("createCommitOnBranch", q0Var2, (String) null, rVar, no.a.s(vp.B, new aa.u0(new aa.t("input"))), n2));
    }
}
