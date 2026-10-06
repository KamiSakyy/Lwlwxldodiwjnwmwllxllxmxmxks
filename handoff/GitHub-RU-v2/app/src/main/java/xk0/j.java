package xk0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import gn0.ki;
import gn0.lb;
import gn0.pb;
import gn0.tb;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j {
    public static final List a;

    static {
        lb.Companion.getClass();
        x xVar = lb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        List r = l.r(new m[]{new m("getsParticipatingWeb", b, (String) null, rVar, rVar, rVar), new m("getsWatchingWeb", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ki.Companion.getClass();
        q0 q0Var = ki.a;
        k.g(q0Var, "type");
        m mVar = new m("notificationSettings", q0Var, (String) null, rVar, rVar, r);
        pb.Companion.getClass();
        m mVar2 = new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
