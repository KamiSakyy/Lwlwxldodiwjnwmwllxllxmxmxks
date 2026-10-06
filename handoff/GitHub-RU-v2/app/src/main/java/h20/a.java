package h20;

import aa.a0;
import aa.m;
import aa.x;
import hc0.db;
import hc0.fb;
import hc0.h6;
import hc0.j2;
import hc0.p2;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        k.g(xVar, "type");
        rShadow rVar = rShadow.r;
        m mVar = new m("externalId", xVar, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        j2.Companion.getClass();
        a0 a0Var = j2.s;
        k.g(a0Var, "type");
        m mVar3 = new m("conclusion", a0Var, (String) null, rVar, rVar, rVar);
        p2.Companion.getClass();
        m mVar4 = new m("status", l0.b(p2.s), (String) null, rVar, rVar, rVar);
        h6.Companion.getClass();
        x xVar2 = h6.a;
        k.g(xVar2, "type");
        m mVar5 = new m("startedAt", xVar2, (String) null, rVar, rVar, rVar);
        m mVar6 = new m("completedAt", xVar2, (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        x xVar3 = db.a;
        k.g(xVar3, "type");
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, new m("secondsToCompletion", xVar3, (String) null, rVar, rVar, rVar), new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
