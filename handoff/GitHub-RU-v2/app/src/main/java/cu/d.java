package cu;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.rf0;
import m10.sa;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("login", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        sa.Companion.getClass();
        m mVar2 = new m("createdAt", l0.b(sa.a), (String) null, rVar, rVar, rVar);
        rf0.Companion.getClass();
        q0 q0Var = rf0.g0;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar2, new m("enqueuer", q0Var, (String) null, rVar, rVar, r), new m("reason", xVar, (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
