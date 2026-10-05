package gi0;

import aa.m;
import aa.r;
import aa.x;
import gn0.lb;
import gn0.tb;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        lb.Companion.getClass();
        r b = l0.b(lb.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("hasPreviousPage", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar = tb.a;
        k.g(xVar, "type");
        a = l.r(new m[]{mVar, new m("startCursor", xVar, (String) null, rVar, rVar, rVar)});
    }
}
