package fc0;

import hc0.bb;
import hc0.fb;
import hc0.kh;
import hc0.kz;
import hc0.xa;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l2 {
    public static final List a;

    static {
        xa.Companion.getClass();
        aa.r b = v8.l0.b(xa.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("getsDirectMentionMobilePush", b, (String) null, rVar, rVar, rVar));
        kh.Companion.getClass();
        aa.q0 q0Var = kh.a;
        k71.k.g(q0Var, "type");
        aa.m mVar = new aa.m("notificationSettings", q0Var, (String) null, rVar, rVar, n);
        bb.Companion.getClass();
        aa.m mVar2 = new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(fb.a), (String) null, rVar, rVar, rVar)});
        kz.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("viewer", v8.l0.b(kz.O), (String) null, rVar, rVar, r));
    }
}
