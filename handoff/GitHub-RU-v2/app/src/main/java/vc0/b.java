package vc0;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.hc;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import gn0.x1;
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
        pb.Companion.getClass();
        x xVar = pb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        x1.Companion.getClass();
        x xVar2 = x1.a;
        k.g(xVar2, "type");
        m mVar2 = new m("fullDatabaseId", xVar2, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar3 = tb.a;
        k.g(xVar3, "type");
        hc.Companion.getClass();
        List r = l.r(new s[]{new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar), new n("Issue", d0.n("Issue"), l.r(new m[]{mVar, mVar2, new m("updatesChannel", xVar3, (String) null, rVar, no.a.s(hc.w, new u0(new t("topic"))), rVar)})), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        yh.Companion.getClass();
        j0 j0Var = yh.a;
        k.g(j0Var, "type");
        rn.Companion.getClass();
        a = d0.n(new m("node", j0Var, (String) null, rVar, no.a.s(rn.i, new u0(new t("id"))), r));
    }
}
