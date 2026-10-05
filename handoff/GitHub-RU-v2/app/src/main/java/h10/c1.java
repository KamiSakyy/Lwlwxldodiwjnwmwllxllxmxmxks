package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.p00;
import m10.zp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c1 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Discussion");
        List list = js.e.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Discussion", n, list)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s nVar = new aa.n("Discussion", sy.d0.n("Discussion"), r);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, nVar, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        aa.j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new aa.u0(new aa.t("nodeId"))), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
