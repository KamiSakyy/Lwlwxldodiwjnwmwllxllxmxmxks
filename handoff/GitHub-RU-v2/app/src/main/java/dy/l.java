package dy;

import a0.s0;
import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.id0;
import m10.vp;
import m10.wg;
import m10.wh;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l {
    public static final List a;

    static {
        ah.Companion.getClass();
        r b = l0.b(ah.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar = wg.a;
        k71.k.g(xVar, "type");
        m mVar2 = new m("isPinned", xVar, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        List r = x61.l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(eh.a), (String) null, rVar, rVar, rVar)});
        wh.Companion.getClass();
        q0 q0Var = wh.B;
        k71.k.g(q0Var, "type");
        List n = d0.n(new m("issue", q0Var, (String) null, rVar, rVar, r));
        id0.Companion.getClass();
        q0 q0Var2 = id0.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = d0.n(new m("unpinIssue", q0Var2, (String) null, rVar, no.a.s(vp.b1, new u0(s0.p("issueId", new t("issueId")))), n));
    }
}
