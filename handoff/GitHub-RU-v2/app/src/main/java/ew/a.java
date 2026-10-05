package ew;

import aa.q0;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.su;
import m10.uu;
import m10.wh;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2Item");
        List list = f.a;
        aa.s c = no.a.c(list, "selections", "ProjectV2Item", n, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        su.Companion.getClass();
        List n2 = d0.n(new aa.m("nodes", l0.a(su.b), (String) null, rVar, rVar, r));
        aa.m mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        uu.Companion.getClass();
        q0 q0Var = uu.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar2, new aa.m("projectItems", q0Var, (String) null, rVar, no.a.s(wh.n, new u0(25)), n2), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
