package qx0;

import aa.m;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.al;
import pz0.ol;
import pz0.td;
import pz0.vd;
import pz0.w80;
import pz0.xd;
import pz0.yk;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        vd.Companion.getClass();
        r b = l0.b(vd.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        xd.Companion.getClass();
        x xVar = xd.a;
        s mVar = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("NotificationFilter");
        List list = ft0.a.a;
        s c = no.a.c(list, "selections", "NotificationFilter", n2, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        yk.Companion.getClass();
        List n3 = d0Shadow.n(new m("nodes", l0.a(yk.a), (String) null, rVar, rVar, r));
        ol.Companion.getClass();
        r b2 = l0.b(ol.a);
        w80.Companion.getClass();
        m mVar2 = new m("notificationThreads", b2, "inbox", rVar, no.a.s(w80.xShadow, new u0("is:unread")), n);
        al.Companion.getClass();
        a = l.r(new m[]{new m("viewer", l0.b(w80.W), (String) null, rVar, rVar, l.r(new m[]{mVar2, new m("notificationFilters", l0.b(al.a), (String) null, rVar, no.a.s(w80.r, new u0(50)), n3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
