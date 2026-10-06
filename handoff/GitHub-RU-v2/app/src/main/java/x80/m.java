package x80;

import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import hc0.a00;
import hc0.ap;
import hc0.bb;
import hc0.fb;
import hc0.yz;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class m {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("UserList");
        List list = fa0.g.a;
        s c = no.a.c(list, "selections", "UserList", n, list);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r = x61.l.r(new s[]{mVar, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        yz.Companion.getClass();
        List n2 = d0Shadow.n(new aa.m("nodes", l0.a(yz.c), (String) null, rVar, rVar, r));
        aa.m mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        a00.Companion.getClass();
        r b2 = l0.b(a00.a);
        ap.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar2, new aa.m("lists", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ap.w, new u0(100)), new aa.k(ap.x, new u0(Boolean.TRUE))}), n2), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
