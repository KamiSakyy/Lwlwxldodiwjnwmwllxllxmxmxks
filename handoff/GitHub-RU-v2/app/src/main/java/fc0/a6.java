package fc0;

import hc0.bb;
import hc0.fb;
import hc0.kz;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a6 {
    public static final List a;

    static {
        hc0.p4.Companion.getClass();
        aa.r b = v8.l0.b(hc0.p4.s);
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("contributionLevel", b, (String) null, rVar, rVar, rVar));
        hc0.l4.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("contributionDays", no.a.d(hc0.l4.a), (String) null, rVar, rVar, n));
        hc0.n4.Companion.getClass();
        List n3 = sy.d0Shadow.n(new aa.m("weeks", no.a.d(hc0.n4.a), (String) null, rVar, rVar, n2));
        hc0.j4.Companion.getClass();
        List n4 = sy.d0Shadow.n(new aa.m("contributionCalendar", v8.l0.b(hc0.j4.a), (String) null, rVar, rVar, n3));
        hc0.r4.Companion.getClass();
        aa.m mVar = new aa.m("contributionsCollection", v8.l0.b(hc0.r4.a), (String) null, rVar, rVar, n4);
        bb.Companion.getClass();
        aa.m mVar2 = new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(fb.a), (String) null, rVar, rVar, rVar)});
        kz.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("viewer", v8.l0.b(kz.O), (String) null, rVar, rVar, r));
    }
}
