package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.j10;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p4 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Ref");
        List list = aw.a.a;
        aa.s c = no.a.c(list, "selections", "Ref", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        j10.Companion.getClass();
        aa.q0 q0Var = j10.e;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{new aa.m("defaultBranchRef", q0Var, (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        i30.Companion.getClass();
        aa.q0 q0Var2 = i30.w0;
        k71.k.g(q0Var2, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("repo"))), new aa.k(p00.m, new aa.u0(new aa.t("owner")))}), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
