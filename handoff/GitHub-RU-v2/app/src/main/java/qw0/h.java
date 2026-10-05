package qw0;

import a0.s0;
import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.le;
import pz0.n60;
import pz0.pd;
import pz0.sk;
import pz0.td;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h {
    public static final List a;

    static {
        td.Companion.getClass();
        r b = l0.b(td.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar = pd.a;
        k.g(xVar, "type");
        m mVar2 = new m("isPinned", xVar, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        List r = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
        le.Companion.getClass();
        q0 q0Var = le.A;
        k.g(q0Var, "type");
        List n = d0.n(new m("issue", q0Var, (String) null, rVar, rVar, r));
        n60.Companion.getClass();
        q0 q0Var2 = n60.a;
        k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = d0.n(new m("unpinIssue", q0Var2, (String) null, rVar, no.a.s(sk.W0, new u0(s0.p("issueId", new t("issueId")))), n));
    }
}
