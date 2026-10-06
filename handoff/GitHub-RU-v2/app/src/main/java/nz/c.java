package nz;

import aa.m;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.bq;
import m10.ch;
import m10.dq;
import m10.eh;
import m10.rf0;
import m10.rq;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        ch.Companion.getClass();
        r b = l0.b(ch.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        eh.Companion.getClass();
        x xVar = eh.a;
        s mVar = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("NotificationFilter");
        List list = ou.a.a;
        s c = no.a.c(list, "selections", "NotificationFilter", n2, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        bq.Companion.getClass();
        List n3 = d0Shadow.n(new m("nodes", l0.a(bq.a), (String) null, rVar, rVar, r));
        rq.Companion.getClass();
        r b2 = l0.b(rq.a);
        rf0.Companion.getClass();
        m mVar2 = new m("notificationThreads", b2, "inbox", rVar, no.a.s(rf0.x, new u0("is:unread")), n);
        dq.Companion.getClass();
        a = l.r(new m[]{new m("viewer", l0.b(rf0.g0), (String) null, rVar, rVar, l.r(new m[]{mVar2, new m("notificationFilters", l0.b(dq.a), (String) null, rVar, no.a.s(rf0.r, new u0(50)), n3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
