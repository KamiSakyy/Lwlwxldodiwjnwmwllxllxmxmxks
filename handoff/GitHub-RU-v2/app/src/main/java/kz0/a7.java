package kz0;

import java.util.List;
import pz0.ol;
import pz0.td;
import pz0.vd;
import pz0.w80;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a7 {
    public static final List a;

    static {
        vd.Companion.getClass();
        aa.r b = v8.l0.b(vd.a);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        ol.Companion.getClass();
        aa.r b2 = v8.l0.b(ol.a);
        w80.Companion.getClass();
        a81.t tVar = w80.v;
        Boolean bool = Boolean.FALSE;
        aa.m mVar = new aa.m("notificationThreads", b2, (String) null, rVar, no.a.s(tVar, new aa.u0(x61.x.u(new w61.k("savedOnly", bool), new w61.k("starredOnly", bool), new w61.k("statuses", sy.d0.n("UNREAD"))))), n);
        td.Companion.getClass();
        aa.x xVar = td.a;
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(w80.W), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)})), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
