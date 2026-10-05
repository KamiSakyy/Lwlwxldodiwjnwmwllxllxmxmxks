package pp;

import a0.s0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.fd;
import m10.vp;
import m10.y20;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        eh.Companion.getClass();
        r b = l0.b(eh.a);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("Discussion");
        List list = js.b.a;
        s c = no.a.c(list, "selections", "Discussion", n, list);
        ah.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        fd.Companion.getClass();
        q0 q0Var = fd.l;
        k.g(q0Var, "type");
        List n2 = d0.n(new m("discussion", q0Var, (String) null, rVar, rVar, r));
        y20.Companion.getClass();
        q0 q0Var2 = y20.a;
        k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = d0.n(new m("reopenDiscussion", q0Var2, (String) null, rVar, no.a.s(vp.G0, new u0(s0.p("discussionId", new t("discussionId")))), n2));
    }
}
