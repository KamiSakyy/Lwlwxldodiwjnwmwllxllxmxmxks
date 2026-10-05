package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.p00;
import m10.sc;
import m10.sr;
import m10.uc;
import m10.ux;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i1 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("DiffLine");
        List list = fs.a.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "DiffLine", n, list)});
        uc.Companion.getClass();
        aa.p a2 = v8.l0.a(uc.a);
        sr.Companion.getClass();
        aa.m mVar2 = new aa.m("diffLines", a2, (String) null, rVar, no.a.s(sr.a, new aa.u0(new aa.t("contextLines"))), r);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = sr.b;
        k71.k.g(q0Var, "type");
        sc.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("patch", q0Var, (String) null, rVar, no.a.s(sc.a, new aa.u0(new aa.t("path"))), r2));
        aa.q0 q0Var2 = sc.d;
        k71.k.g(q0Var2, "type");
        List r3 = x61.l.r(new aa.m[]{new aa.m("diff", q0Var2, (String) null, rVar, rVar, n2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ux.Companion.getClass();
        aa.q0 q0Var3 = ux.T;
        k71.k.g(q0Var3, "type");
        i30.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, new aa.m("pullRequest", q0Var3, (String) null, rVar, no.a.s(i30.P, new aa.u0(new aa.t("number"))), r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var4 = i30.w0;
        k71.k.g(q0Var4, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var4, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("repositoryName"))), new aa.k(p00.m, new aa.u0(new aa.t("repositoryOwner")))}), r4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
