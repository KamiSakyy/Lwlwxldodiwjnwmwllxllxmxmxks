package td0;

import aa.m;
import aa.r;
import aa.u0;
import gn0.lb;
import gn0.pb;
import gn0.rb;
import gn0.s00;
import gn0.ta;
import gn0.tb;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g {
    public static final List a;

    static {
        rb.Companion.getClass();
        r b = l0.b(rb.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        pb.Companion.getClass();
        m mVar = new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        m mVar2 = new m("viewerIsFollowing", l0.b(lb.a), (String) null, rVar, rVar, rVar);
        ta.Companion.getClass();
        r b2 = l0.b(ta.a);
        s00.Companion.getClass();
        m mVar3 = new m("followers", b2, (String) null, rVar, no.a.s(s00.e, new u0(3)), n);
        tb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, new m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar)});
    }
}
