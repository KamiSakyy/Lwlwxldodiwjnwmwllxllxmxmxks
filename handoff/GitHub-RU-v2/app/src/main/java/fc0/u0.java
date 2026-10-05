package fc0;

import hc0.ap;
import hc0.bb;
import hc0.fb;
import hc0.o8;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class u0 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Discussion");
        List list = f50.d.a;
        aa.s c = no.a.c(list, "selections", "Discussion", n, list);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        o8.Companion.getClass();
        aa.q0 q0Var = o8.l;
        k71.k.g(q0Var, "type");
        ap.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("discussion", q0Var, (String) null, rVar, no.a.s(ap.i, new aa.u0(new aa.t("discussionNumber"))), r), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = ap.k0;
        k71.k.g(q0Var2, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pm.i, new aa.u0(new aa.t("repositoryName"))), new aa.k(pm.j, new aa.u0(new aa.t("repositoryOwner")))}), r2));
    }
}
