package ip;

import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import aa.x0;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.k7;
import m10.o7;
import m10.sa;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("PullRequest");
        List list = a.a;
        s c = no.a.c(list, "selections", "PullRequest", n, list);
        ah.Companion.getClass();
        List r = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("PullRequest", d0.n("PullRequest"), l.r(new s[]{mVar, c, new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar)}))});
        m mVar2 = new m("sessionId", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        m mVar4 = new m("state", l0.b(o7.s), (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        x xVar2 = sa.a;
        m mVar5 = new m("createdAt", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("lastUpdatedAt", xVar2, (String) null, rVar, rVar, rVar);
        m mVar7 = new m("completedAt", xVar2, (String) null, rVar, rVar, rVar);
        k7.Companion.getClass();
        x0 x0Var = k7.a;
        k.g(x0Var, "type");
        a = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, new m("resource", x0Var, (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
    public Object e(Object p1) { return null; }
    public Object e(Object p1) { return null; }
}
