package en0;

import gn0.ki;
import gn0.lb;
import gn0.pb;
import gn0.s00;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p2 {
    public static final List a;

    static {
        lb.Companion.getClass();
        aa.r b = v8.l0.b(lb.a);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("getsDirectMentionMobilePush", b, (String) null, rVar, rVar, rVar));
        ki.Companion.getClass();
        aa.q0 q0Var = ki.a;
        k71.k.g(q0Var, "type");
        aa.m mVar = new aa.m("notificationSettings", q0Var, (String) null, rVar, rVar, n);
        pb.Companion.getClass();
        aa.m mVar2 = new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(tb.a), (String) null, rVar, rVar, rVar)});
        s00.Companion.getClass();
        a = sy.d0.n(new aa.m("viewer", v8.l0.b(s00.P), (String) null, rVar, rVar, r));
    }
}
