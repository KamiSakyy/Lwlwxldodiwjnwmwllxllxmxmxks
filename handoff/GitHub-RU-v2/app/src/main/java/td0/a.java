package td0;

import aa.m;
import aa.r;
import aa.x;
import gn0.lb;
import gn0.pb;
import gn0.rb;
import gn0.ta;
import gn0.tb;
import gn0.va;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        rb.Companion.getClass();
        x xVar = rb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        List n2 = d0Shadow.n(new m("totalCount", l0.b(xVar), (String) null, rVar, rVar, rVar));
        pb.Companion.getClass();
        m mVar = new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar2 = lb.a;
        m mVar2 = new m("viewerIsFollowing", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("isFollowingViewer", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ta.Companion.getClass();
        m mVar4 = new m("followers", l0.b(ta.a), (String) null, rVar, rVar, n);
        va.Companion.getClass();
        m mVar5 = new m("following", l0.b(va.a), (String) null, rVar, rVar, n2);
        m mVar6 = new m("viewerCanBlock", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("viewerCanUnblock", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, new m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar)});
    }
}
