package en0;

import gn0.pb;
import gn0.s00;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h6 {
    public static final List a;

    static {
        gn0.z4.Companion.getClass();
        aa.r b = v8.l0.b(gn0.z4.s);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("contributionLevel", b, (String) null, rVar, rVar, rVar));
        gn0.v4.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("contributionDays", no.a.d(gn0.v4.a), (String) null, rVar, rVar, n));
        gn0.x4.Companion.getClass();
        List n3 = sy.d0.n(new aa.m("weeks", no.a.d(gn0.x4.a), (String) null, rVar, rVar, n2));
        gn0.t4.Companion.getClass();
        List n4 = sy.d0.n(new aa.m("contributionCalendar", v8.l0.b(gn0.t4.a), (String) null, rVar, rVar, n3));
        gn0.b5.Companion.getClass();
        aa.m mVar = new aa.m("contributionsCollection", v8.l0.b(gn0.b5.a), (String) null, rVar, rVar, n4);
        pb.Companion.getClass();
        aa.m mVar2 = new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(tb.a), (String) null, rVar, rVar, rVar)});
        s00.Companion.getClass();
        a = sy.d0.n(new aa.m("viewer", v8.l0.b(s00.P), (String) null, rVar, rVar, r));
    }
}
