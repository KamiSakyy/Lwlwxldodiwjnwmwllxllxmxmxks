package en0;

import gn0.eq;
import gn0.hr;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g4 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Organization", "Repository", "User"});
        List list = oi0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "ProjectOwner", r, list)});
        hr.Companion.getClass();
        aa.m mVar2 = new aa.m("owner", v8.l0.b(hr.a), (String) null, rVar, rVar, r2);
        pb.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        eq.Companion.getClass();
        aa.q0 q0Var = eq.m0;
        k71.k.g(q0Var, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("repo"))), new aa.k(rn.m, new aa.u0(new aa.t("owner")))}), r3));
    }
}
