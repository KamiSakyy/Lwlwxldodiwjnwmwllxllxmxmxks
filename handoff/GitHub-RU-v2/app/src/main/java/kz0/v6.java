package kz0;

import java.util.List;
import pz0.td;
import pz0.w80;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v6 {
    public static final List a;

    static {
        pz0.o5.Companion.getClass();
        aa.r b = v8.l0.b(pz0.o5.s);
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("contributionLevel", b, (String) null, rVar, rVar, rVar));
        pz0.k5.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("contributionDays", no.a.d(pz0.k5.a), (String) null, rVar, rVar, n));
        pz0.m5.Companion.getClass();
        List n3 = sy.d0Shadow.n(new aa.m("weeks", no.a.d(pz0.m5.a), (String) null, rVar, rVar, n2));
        pz0.i5.Companion.getClass();
        List n4 = sy.d0Shadow.n(new aa.m("contributionCalendar", v8.l0.b(pz0.i5.a), (String) null, rVar, rVar, n3));
        pz0.q5.Companion.getClass();
        aa.m mVar = new aa.m("contributionsCollection", v8.l0.b(pz0.q5.a), (String) null, rVar, rVar, n4);
        td.Companion.getClass();
        aa.x xVar = td.a;
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        w80.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(w80.W), (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
