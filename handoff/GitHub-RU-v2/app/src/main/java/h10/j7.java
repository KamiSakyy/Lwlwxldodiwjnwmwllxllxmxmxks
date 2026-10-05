package h10;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.rf0;
import m10.rq;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j7 {
    public static final List a;

    static {
        ch.Companion.getClass();
        aa.r b = v8.l0.b(ch.a);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        rq.Companion.getClass();
        aa.r b2 = v8.l0.b(rq.a);
        rf0.Companion.getClass();
        a81.t tVar = rf0.v;
        Boolean bool = Boolean.FALSE;
        aa.m mVar = new aa.m("notificationThreads", b2, (String) null, rVar, no.a.s(tVar, new aa.u0(x61.x.u(new w61.k[]{new w61.k("savedOnly", bool), new w61.k("starredOnly", bool), new w61.k("statuses", sy.d0.n("UNREAD"))}))), n);
        ah.Companion.getClass();
        aa.x xVar = ah.a;
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(rf0.g0), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)})), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
