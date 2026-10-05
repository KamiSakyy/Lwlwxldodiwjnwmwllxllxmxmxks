package ti0;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import gn0.yh;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("PullRequest");
        List list = si0.s.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "PullRequest", n, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s nVar = new n("PullRequest", d0.n("PullRequest"), r);
        pb.Companion.getClass();
        List r2 = l.r(new s[]{mVar2, nVar, new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        yh.Companion.getClass();
        j0 j0Var = yh.a;
        k.g(j0Var, "type");
        rn.Companion.getClass();
        a = d0.n(new m("node", j0Var, (String) null, rVar, no.a.s(rn.i, new u0(new t("id"))), r2));
    }
}
