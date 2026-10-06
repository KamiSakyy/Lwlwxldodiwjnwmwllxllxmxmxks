package xc0;

import aa.a0;
import aa.m;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import gn0.l2;
import gn0.lb;
import gn0.mx;
import gn0.n2;
import gn0.pb;
import gn0.r2;
import gn0.r6;
import gn0.rb;
import gn0.tb;
import gn0.x1;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        pb.Companion.getClass();
        r b = l0.b(pb.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        x1.Companion.getClass();
        x xVar = x1.a;
        k.g(xVar, "type");
        m mVar2 = new m("fullDatabaseId", xVar, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar2 = tb.a;
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        r2.Companion.getClass();
        m mVar4 = new m("status", l0.b(r2.s), (String) null, rVar, rVar, rVar);
        l2.Companion.getClass();
        a0 a0Var = l2.s;
        k.g(a0Var, "type");
        m mVar5 = new m("conclusion", a0Var, (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        m mVar6 = new m("duration", l0.b(rb.a), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("title", xVar2, (String) null, rVar, rVar, rVar);
        m mVar8 = new m("summary", xVar2, (String) null, rVar, rVar, rVar);
        r6.Companion.getClass();
        x xVar3 = r6.a;
        k.g(xVar3, "type");
        m mVar9 = new m("startedAt", xVar3, (String) null, rVar, rVar, rVar);
        m mVar10 = new m("completedAt", xVar3, (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        m mVar11 = new m("permalink", l0.b(mx.a), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        r b2 = l0.b(lb.a);
        List t = no.a.t("checkRequired", false);
        n2.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, new m("isRequired", b2, (String) null, t, no.a.s(n2.a, new u0(new t("pullRequestId"))), rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
