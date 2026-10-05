package hb0;

import aa.m;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import hc0.ah;
import hc0.bb;
import hc0.ch;
import hc0.db;
import hc0.fb;
import hc0.kz;
import hc0.qh;
import java.util.List;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        db.Companion.getClass();
        r b = l0.b(db.a);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        fb.Companion.getClass();
        x xVar = fb.a;
        s mVar = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("NotificationFilter");
        List list = f70.a.a;
        s c = no.a.c(list, "selections", "NotificationFilter", n2, list);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ah.Companion.getClass();
        List n3 = d0.n(new m("nodes", l0.a(ah.a), (String) null, rVar, rVar, r));
        qh.Companion.getClass();
        r b2 = l0.b(qh.a);
        kz.Companion.getClass();
        m mVar2 = new m("notificationThreads", b2, "inbox", rVar, no.a.s(kz.s, new u0("is:unread")), n);
        ch.Companion.getClass();
        a = d0.n(new m("viewer", l0.b(kz.O), (String) null, rVar, rVar, l.r(new m[]{mVar2, new m("notificationFilters", l0.b(ch.a), (String) null, rVar, no.a.s(kz.m, new u0(50)), n3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})));
    }
}
