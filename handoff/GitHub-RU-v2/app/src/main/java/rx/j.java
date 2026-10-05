package rx;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.lq;
import m10.wg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j {
    public static final List a;

    static {
        wg.Companion.getClass();
        x xVar = wg.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List r = l.r(new m[]{new m("getsParticipatingWeb", b, (String) null, rVar, rVar, rVar), new m("getsWatchingWeb", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        lq.Companion.getClass();
        q0 q0Var = lq.a;
        k.g(q0Var, "type");
        m mVar = new m("notificationSettings", q0Var, (String) null, rVar, rVar, r);
        ah.Companion.getClass();
        m mVar2 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(eh.a), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
