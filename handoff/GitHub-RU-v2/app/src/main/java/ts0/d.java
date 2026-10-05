package ts0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import pz0.o7;
import pz0.td;
import pz0.w80;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("login", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        o7.Companion.getClass();
        m mVar2 = new m("createdAt", l0.b(o7.a), (String) null, rVar, rVar, rVar);
        w80.Companion.getClass();
        q0 q0Var = w80.W;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar2, new m("enqueuer", q0Var, (String) null, rVar, rVar, r), new m("reason", xVar, (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
