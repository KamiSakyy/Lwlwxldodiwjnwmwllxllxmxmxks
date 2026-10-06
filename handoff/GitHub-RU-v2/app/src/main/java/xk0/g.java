package xk0;

import aa.m;
import aa.r;
import aa.x;
import gn0.lb;
import gn0.m10;
import gn0.pb;
import gn0.rb;
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
        tb.Companion.getClass();
        x xVar = tb.a;
        m mVar2 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        m mVar3 = new m("isPrivate", l0.b(lb.a), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        m10.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("items", l0.b(m10.a), (String) null, rVar, rVar, n), new m("slug", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
