package fl0;

import a0.s0;
import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import gn0.hc;
import gn0.lb;
import gn0.pb;
import gn0.ry;
import gn0.tb;
import gn0.wh;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        pb.Companion.getClass();
        r b = l0.b(pb.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar = lb.a;
        k.g(xVar, "type");
        m mVar2 = new m("isPinned", xVar, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        List r = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar)});
        hc.Companion.getClass();
        q0 q0Var = hc.x;
        k.g(q0Var, "type");
        List n = d0.n(new m("issue", q0Var, (String) null, rVar, rVar, r));
        ry.Companion.getClass();
        q0 q0Var2 = ry.a;
        k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = d0.n(new m("unpinIssue", q0Var2, (String) null, rVar, no.a.s(wh.J0, new u0(s0.p("issueId", new t("issueId")))), n));
    }
}
