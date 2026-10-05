package pj0;

import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import gn0.eq;
import gn0.g10;
import gn0.i10;
import gn0.pb;
import gn0.tb;
import java.util.List;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("UserList");
        List list = xk0.g.a;
        s c = no.a.c(list, "selections", "UserList", n, list);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = x61.l.r(new s[]{mVar, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        g10.Companion.getClass();
        List n2 = d0.n(new aa.m("nodes", l0.a(g10.c), (String) null, rVar, rVar, r));
        aa.m mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        i10.Companion.getClass();
        r b2 = l0.b(i10.a);
        eq.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar2, new aa.m("lists", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(eq.w, new u0(100)), new aa.k(eq.x, new u0(Boolean.TRUE))}), n2), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
