package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.rf0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e7 {
    public static final List a;

    static {
        m10.u6.Companion.getClass();
        aa.r b = v8.l0.b(m10.u6.s);
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("contributionLevel", b, (String) null, rVar, rVar, rVar));
        m10.q6.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("contributionDays", no.a.d(m10.q6.a), (String) null, rVar, rVar, n));
        m10.s6.Companion.getClass();
        List n3 = sy.d0Shadow.n(new aa.m("weeks", no.a.d(m10.s6.a), (String) null, rVar, rVar, n2));
        m10.o6.Companion.getClass();
        List n4 = sy.d0Shadow.n(new aa.m("contributionCalendar", v8.l0.b(m10.o6.a), (String) null, rVar, rVar, n3));
        m10.w6.Companion.getClass();
        aa.m mVar = new aa.m("contributionsCollection", v8.l0.b(m10.w6.a), (String) null, rVar, rVar, n4);
        ah.Companion.getClass();
        aa.x xVar = ah.a;
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(rf0.g0), (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
