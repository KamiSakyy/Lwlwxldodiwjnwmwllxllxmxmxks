package dy;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import hv.p;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.p00;
import m10.zp;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team"});
        List list = zw.a.a;
        s c = no.a.c(list, "selections", "Subscribable", r, list);
        List n = d0.n("PullRequest");
        List list2 = p.a;
        s c2 = no.a.c(list2, "selections", "PullRequest", n, list2);
        List n2 = d0.n("PullRequest");
        List list3 = ew.g.a;
        List r2 = x61.l.r(new s[]{mVar, c, c2, no.a.c(list3, "selections", "PullRequest", n2, list3)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s nVar = new n("PullRequest", d0.n("PullRequest"), r2);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r3 = x61.l.r(new s[]{mVar2, nVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new m[]{new m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("id"))), r3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
