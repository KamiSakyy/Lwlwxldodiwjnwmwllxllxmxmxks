package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.gh;
import m10.i30;
import m10.p00;
import m10.p40;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class z4 {
    public static final List a;

    static {
        gh.Companion.getClass();
        aa.x xVar = gh.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("contentHTML", xVar, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("path", xVar2, (String) null, rVar, rVar, rVar)});
        p40.Companion.getClass();
        aa.q0 q0Var = p40.a;
        k71.k.g(q0Var, "type");
        i30.Companion.getClass();
        aa.m mVar2 = new aa.m("readme", q0Var, (String) null, rVar, no.a.s(i30.S, new aa.u0(new aa.t("branchName"))), r);
        ah.Companion.getClass();
        aa.x xVar3 = ah.a;
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = i30.w0;
        k71.k.g(q0Var2, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("name"))), new aa.k(p00.m, new aa.u0(new aa.t("owner")))}), r2), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
