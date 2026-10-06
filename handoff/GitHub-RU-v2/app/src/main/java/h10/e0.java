package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.j10;
import m10.p00;
import m10.sc;
import m10.sr;
import m10.uc;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("DiffLine");
        List list = fs.a.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "DiffLine", n, list)});
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        uc.Companion.getClass();
        aa.p a2 = v8.l0.a(uc.a);
        sr.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("diffLines", a2, (String) null, rVar, no.a.s(sr.a, new aa.u0(new aa.t("contextLines"))), r), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = sr.b;
        k71.k.g(q0Var, "type");
        sc.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("patch", q0Var, (String) null, rVar, no.a.s(sc.a, new aa.u0(new aa.t("path"))), r2));
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var2 = sc.d;
        k71.k.g(q0Var2, "type");
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("diff", q0Var2, (String) null, rVar, rVar, n2), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m10.i6.Companion.getClass();
        aa.q0 q0Var3 = m10.i6.d;
        k71.k.g(q0Var3, "type");
        j10.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar4, new aa.m("compare", q0Var3, (String) null, rVar, no.a.s(j10.d, new aa.u0(new aa.t("headRefName"))), r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar5 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var4 = j10.e;
        k71.k.g(q0Var4, "type");
        i30.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar5, new aa.m("ref", q0Var4, "comparison", rVar, no.a.s(i30.T, new aa.u0(new aa.t("baseRefName"))), r4), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var5 = i30.w0;
        k71.k.g(q0Var5, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var5, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("repoName"))), new aa.k(p00.m, new aa.u0(new aa.t("ownerName")))}), r5), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
