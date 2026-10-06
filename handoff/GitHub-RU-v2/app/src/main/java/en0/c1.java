package en0;

import gn0.eq;
import gn0.lj;
import gn0.ll;
import gn0.n8;
import gn0.p8;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c1 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("DiffLine");
        List list = rf0.a.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "DiffLine", n, list)});
        p8.Companion.getClass();
        aa.p a2 = v8.l0.a(p8.a);
        lj.Companion.getClass();
        aa.m mVar2 = new aa.m("diffLines", a2, (String) null, rVar, no.a.s(lj.a, new aa.u0(new aa.t("contextLines"))), r);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = lj.b;
        k71.k.g(q0Var, "type");
        n8.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("patch", q0Var, (String) null, rVar, no.a.s(n8.a, new aa.u0(new aa.t("path"))), r2));
        aa.q0 q0Var2 = n8.d;
        k71.k.g(q0Var2, "type");
        List r3 = x61.l.r(new aa.m[]{new aa.m("diff", q0Var2, (String) null, rVar, rVar, n2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ll.Companion.getClass();
        aa.q0 q0Var3 = ll.K;
        k71.k.g(q0Var3, "type");
        eq.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, new aa.m("pullRequest", q0Var3, (String) null, rVar, no.a.s(eq.L, new aa.u0(new aa.t("number"))), r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var4 = eq.m0;
        k71.k.g(q0Var4, "type");
        rn.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("repository", q0Var4, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("repositoryName"))), new aa.k(rn.m, new aa.u0(new aa.t("repositoryOwner")))}), r4));
    }
}
