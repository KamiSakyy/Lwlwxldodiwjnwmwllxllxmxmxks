package fc0;

import hc0.ap;
import hc0.b8;
import hc0.bb;
import hc0.d8;
import hc0.fb;
import hc0.li;
import hc0.lk;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b1 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("DiffLine");
        List list = b50.a.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "DiffLine", n, list)});
        d8.Companion.getClass();
        aa.p a2 = v8.l0.a(d8.a);
        li.Companion.getClass();
        aa.m mVar2 = new aa.m("diffLines", a2, (String) null, rVar, no.a.s(li.a, new aa.u0(new aa.t("contextLines"))), r);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = li.b;
        k71.k.g(q0Var, "type");
        b8.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("patch", q0Var, (String) null, rVar, no.a.s(b8.a, new aa.u0(new aa.t("path"))), r2));
        aa.q0 q0Var2 = b8.d;
        k71.k.g(q0Var2, "type");
        List r3 = x61.l.r(new aa.m[]{new aa.m("diff", q0Var2, (String) null, rVar, rVar, n2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        lk.Companion.getClass();
        aa.q0 q0Var3 = lk.J;
        k71.k.g(q0Var3, "type");
        ap.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, new aa.m("pullRequest", q0Var3, (String) null, rVar, no.a.s(ap.K, new aa.u0(new aa.t("number"))), r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var4 = ap.k0;
        k71.k.g(q0Var4, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var4, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pm.i, new aa.u0(new aa.t("repositoryName"))), new aa.k(pm.j, new aa.u0(new aa.t("repositoryOwner")))}), r4));
    }
}
