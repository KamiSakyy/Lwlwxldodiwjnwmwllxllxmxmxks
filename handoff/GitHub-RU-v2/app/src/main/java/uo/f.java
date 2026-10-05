package uo;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.p00;
import m10.ux;
import m10.x2;
import m10.zp;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        x2.Companion.getClass();
        x xVar2 = x2.a;
        k.g(xVar2, "type");
        m mVar2 = new m("fullDatabaseId", xVar2, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar3 = eh.a;
        k.g(xVar3, "type");
        ux.Companion.getClass();
        List r = l.r(new s[]{new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar), new n("PullRequest", d0.n("PullRequest"), l.r(new m[]{mVar, mVar2, new m("updatesChannel", xVar3, (String) null, rVar, no.a.s(ux.Q, new u0(new t("topic"))), rVar)})), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k.g(j0Var, "type");
        p00.Companion.getClass();
        a = l.r(new m[]{new m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("id"))), r), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
