package en0;

import gn0.hc;
import gn0.mx;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e0 {
    public static final List a;

    static {
        pb.Companion.getClass();
        aa.r b = v8.l0.b(pb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        aa.m mVar2 = new aa.m("url", v8.l0.b(mx.a), (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        aa.m mVar3 = new aa.m("number", v8.l0.b(rb.a), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("__typename", v8.l0.b(tb.a), (String) null, rVar, rVar, rVar)});
        hc.Companion.getClass();
        aa.q0 q0Var = hc.x;
        k71.k.g(q0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("issue", q0Var, (String) null, rVar, rVar, r));
        gn0.u5.Companion.getClass();
        aa.q0 q0Var2 = gn0.u5.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("createIssue", q0Var2, (String) null, rVar, no.a.s(wh.z, new aa.u0(new aa.t("createIssueInput"))), n));
    }
}
