package vu0;

import java.util.List;
import pz0.td;
import pz0.xd;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = l0.b(xd.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.s mVar2 = new aa.m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        List n = d0.n("Issue");
        List list = s.a;
        aa.s c = no.a.c(list, "selections", "Issue", n, list);
        List n2 = d0.n("Issue");
        List list2 = e.a;
        aa.s c2 = no.a.c(list2, "selections", "Issue", n2, list2);
        List n3 = d0.n("Issue");
        List list3 = r.a;
        a = x61.l.r(new aa.s[]{mVar, mVar2, c, c2, no.a.c(list3, "selections", "Issue", n3, list3)});
    }
}
