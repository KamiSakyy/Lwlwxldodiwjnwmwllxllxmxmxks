package cm0;

import aa.m;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import gn0.ai;
import gn0.ci;
import gn0.pb;
import gn0.qi;
import gn0.rb;
import gn0.s00;
import gn0.tb;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        rb.Companion.getClass();
        r b = l0.b(rb.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        tb.Companion.getClass();
        x xVar = tb.a;
        s mVar = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("NotificationFilter");
        List list = xh0.a.a;
        s c = no.a.c(list, "selections", "NotificationFilter", n2, list);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ai.Companion.getClass();
        List n3 = d0Shadow.n(new m("nodes", l0.a(ai.a), (String) null, rVar, rVar, r));
        qi.Companion.getClass();
        r b2 = l0.b(qi.a);
        s00.Companion.getClass();
        m mVar2 = new m("notificationThreads", b2, "inbox", rVar, no.a.s(s00.s, new u0("is:unread")), n);
        ci.Companion.getClass();
        a = d0Shadow.n(new m("viewer", l0.b(s00.P), (String) null, rVar, rVar, l.r(new m[]{mVar2, new m("notificationFilters", l0.b(ci.a), (String) null, rVar, no.a.s(s00.m, new u0(50)), n3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})));
    }
}
