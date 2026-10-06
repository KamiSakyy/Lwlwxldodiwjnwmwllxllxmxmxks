package b00;

import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ct;
import m10.eh;
import m10.gr;
import m10.p00;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2Connection");
        List list = uz.a.a;
        List r = x61.l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2Connection", n, list)});
        ct.Companion.getClass();
        r b2 = l0.b(ct.a);
        gr.Companion.getClass();
        aa.m mVar2 = new aa.m("recentProjects", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(gr.b, new u0(new t("after"))), new aa.k(gr.c, new u0(new t("number")))}), r);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = gr.o;
        k71.k.g(q0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("organization", q0Var, (String) null, rVar, no.a.s(p00.j, new u0(new t("orgLogin"))), r2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
