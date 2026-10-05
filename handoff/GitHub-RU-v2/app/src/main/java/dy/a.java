package dy;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.p00;
import m10.zp;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        s mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0.n("Issue");
        List list = st.b.a;
        List r = x61.l.r(new s[]{mVar, mVar2, no.a.c(list, "selections", "Issue", n, list)});
        s mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("PullRequest");
        List list2 = st.a.a;
        List r2 = x61.l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Issue", d0.n("Issue"), r), new n("PullRequest", d0.n("PullRequest"), x61.l.r(new s[]{mVar3, mVar4, no.a.c(list2, "selections", "PullRequest", n2, list2)})), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new m[]{new m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("id"))), r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
