package cp;

import aa.j0;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.da0;
import m10.eh;
import m10.j90;
import m10.p00;
import m10.x90;
import m10.zp;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("StatusContext");
        List list = wo.e.a;
        s c = no.a.c(list, "selections", "StatusContext", n, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = x61.l.r(new s[]{mVar, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        da0.Companion.getClass();
        aa.m mVar2 = new aa.m("state", l0.b(da0.s), (String) null, rVar, rVar, rVar);
        x90.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("contexts", no.a.d(x90.c), (String) null, rVar, rVar, r), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar3 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar4 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        j90.Companion.getClass();
        q0 q0Var = j90.a;
        k71.k.g(q0Var, "type");
        s mVar5 = new aa.m("status", q0Var, (String) null, rVar, rVar, r2);
        List n2 = d0Shadow.n("Commit");
        List list2 = wo.d.a;
        List r3 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Commit", d0Shadow.n("Commit"), x61.l.r(new s[]{mVar3, mVar4, mVar5, no.a.c(list2, "selections", "Commit", n2, list2)})), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("id"))), r3), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
