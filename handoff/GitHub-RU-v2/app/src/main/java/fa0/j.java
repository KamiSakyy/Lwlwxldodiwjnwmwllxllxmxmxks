package fa0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.kh;
import hc0.xa;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j {
    public static final List a;

    static {
        xa.Companion.getClass();
        x xVar = xa.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        List r = l.r(new m[]{new m("getsParticipatingWeb", b, (String) null, rVar, rVar, rVar), new m("getsWatchingWeb", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        kh.Companion.getClass();
        q0 q0Var = kh.a;
        k.g(q0Var, "type");
        m mVar = new m("notificationSettings", q0Var, (String) null, rVar, rVar, r);
        bb.Companion.getClass();
        m mVar2 = new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
