package wn0;

import aa.a0;
import aa.m;
import aa.x;
import java.util.List;
import pz0.e3;
import pz0.o7;
import pz0.vd;
import pz0.xd;
import pz0.y2;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        k71.k.g(xVar, "type");
        r rVar = r.r;
        m mVar = new m("externalId", xVar, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        y2.Companion.getClass();
        a0 a0Var = y2.s;
        k71.k.g(a0Var, "type");
        m mVar3 = new m("conclusion", a0Var, (String) null, rVar, rVar, rVar);
        e3.Companion.getClass();
        m mVar4 = new m("status", l0.b(e3.s), (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        x xVar2 = o7.a;
        k71.k.g(xVar2, "type");
        m mVar5 = new m("startedAt", xVar2, (String) null, rVar, rVar, rVar);
        m mVar6 = new m("completedAt", xVar2, (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        x xVar3 = vd.a;
        k71.k.g(xVar3, "type");
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, new m("secondsToCompletion", xVar3, (String) null, rVar, rVar, rVar), new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
