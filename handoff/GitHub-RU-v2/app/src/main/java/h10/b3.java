package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.lq;
import m10.rf0;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b3 {
    public static final List a;

    static {
        wg.Companion.getClass();
        aa.r b = v8.l0.b(wg.a);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("getsDirectMentionMobilePush", b, (String) null, rVar, rVar, rVar));
        lq.Companion.getClass();
        aa.q0 q0Var = lq.a;
        k71.k.g(q0Var, "type");
        aa.m mVar = new aa.m("notificationSettings", q0Var, (String) null, rVar, rVar, n);
        ah.Companion.getClass();
        aa.x xVar = ah.a;
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(rf0.g0), (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
