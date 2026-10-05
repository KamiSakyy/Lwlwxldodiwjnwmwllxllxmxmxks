package xc0;

import aa.a0;
import aa.m;
import aa.x;
import gn0.l2;
import gn0.r2;
import gn0.r6;
import gn0.rb;
import gn0.tb;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        k.g(xVar, "type");
        r rVar = r.r;
        m mVar = new m("externalId", xVar, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        l2.Companion.getClass();
        a0 a0Var = l2.s;
        k.g(a0Var, "type");
        m mVar3 = new m("conclusion", a0Var, (String) null, rVar, rVar, rVar);
        r2.Companion.getClass();
        m mVar4 = new m("status", l0.b(r2.s), (String) null, rVar, rVar, rVar);
        r6.Companion.getClass();
        x xVar2 = r6.a;
        k.g(xVar2, "type");
        m mVar5 = new m("startedAt", xVar2, (String) null, rVar, rVar, rVar);
        m mVar6 = new m("completedAt", xVar2, (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        x xVar3 = rb.a;
        k.g(xVar3, "type");
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, new m("secondsToCompletion", xVar3, (String) null, rVar, rVar, rVar), new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
