package ew;

import java.util.List;
import m10.ah;
import m10.eh;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class u {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = l0.b(eh.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.s mVar2 = new aa.m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Issue");
        List list = t.a;
        aa.s c = no.a.c(list, "selections", "Issue", n, list);
        List n2 = d0Shadow.n("Issue");
        List list2 = e.a;
        aa.s c2 = no.a.c(list2, "selections", "Issue", n2, list2);
        List n3 = d0Shadow.n("Issue");
        List list3 = s.a;
        a = x61.l.r(new aa.s[]{mVar, mVar2, c, c2, no.a.c(list3, "selections", "Issue", n3, list3)});
    }
}
