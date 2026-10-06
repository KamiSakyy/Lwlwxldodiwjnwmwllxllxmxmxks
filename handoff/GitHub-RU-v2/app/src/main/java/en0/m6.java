package en0;

import gn0.pb;
import gn0.qi;
import gn0.rb;
import gn0.s00;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m6 {
    public static final List a;

    static {
        rb.Companion.getClass();
        aa.r b = v8.l0.b(rb.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        qi.Companion.getClass();
        aa.r b2 = v8.l0.b(qi.a);
        s00.Companion.getClass();
        a81.t tVar = s00.q;
        Boolean bool = Boolean.FALSE;
        aa.m mVar = new aa.m("notificationThreads", b2, (String) null, rVar, no.a.s(tVar, new aa.u0(x61.x.u(new w61.k("savedOnly", bool), new w61.k("starredOnly", bool), new w61.k("statuses", sy.d0Shadow.n("UNREAD"))))), n);
        pb.Companion.getClass();
        aa.m mVar2 = new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("viewer", v8.l0.b(s00.P), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(tb.a), (String) null, rVar, rVar, rVar)})));
    }
}
