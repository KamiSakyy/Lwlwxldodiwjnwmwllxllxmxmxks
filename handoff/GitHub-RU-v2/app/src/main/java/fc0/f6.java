package fc0;

import hc0.bb;
import hc0.db;
import hc0.fb;
import hc0.kz;
import hc0.qh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f6 {
    public static final List a;

    static {
        db.Companion.getClass();
        aa.r b = v8.l0.b(db.a);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        qh.Companion.getClass();
        aa.r b2 = v8.l0.b(qh.a);
        kz.Companion.getClass();
        a81.t tVar = kz.q;
        Boolean bool = Boolean.FALSE;
        aa.m mVar = new aa.m("notificationThreads", b2, (String) null, rVar, no.a.s(tVar, new aa.u0(x61.x.u(new w61.k("savedOnly", bool), new w61.k("starredOnly", bool), new w61.k("statuses", sy.d0.n("UNREAD"))))), n);
        bb.Companion.getClass();
        aa.m mVar2 = new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        a = sy.d0.n(new aa.m("viewer", v8.l0.b(kz.O), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(fb.a), (String) null, rVar, rVar, rVar)})));
    }
}
