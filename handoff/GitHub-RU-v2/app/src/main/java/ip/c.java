package ip;

import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.k7;
import m10.l40;
import m10.o7;
import m10.sa;
import m10.y7;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = l.r(new m[]{mVar, new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, new m("owner", l0.b(l40.e), (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar4 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("PullRequest");
        List list = a.a;
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("PullRequest", d0Shadow.n("PullRequest"), l.r(new s[]{mVar4, no.a.c(list, "selections", "PullRequest", n, list), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar)}))});
        m mVar5 = new m("taskId", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("title", xVar2, (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        m mVar7 = new m("state", l0.b(o7.s), (String) null, rVar, rVar, rVar);
        y7.Companion.getClass();
        m mVar8 = new m("type", l0.b(y7.s), (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        x xVar3 = sa.a;
        k.g(xVar3, "type");
        m mVar9 = new m("lastUpdatedAt", xVar3, (String) null, rVar, rVar, rVar);
        i30.Companion.getClass();
        q0 q0Var = i30.w0;
        k.g(q0Var, "type");
        m mVar10 = new m("repository", q0Var, (String) null, rVar, rVar, r2);
        k7.Companion.getClass();
        a = l.r(new m[]{mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, new m("resources", f1.e.e(k7.a), (String) null, rVar, rVar, r3), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
