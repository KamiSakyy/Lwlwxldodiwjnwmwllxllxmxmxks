package u20;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import hc0.bb;
import hc0.d3;
import hc0.fb;
import hc0.o8;
import hc0.wg;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;
import x61.x;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        r b = l0.b(fb.a);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Discussion");
        List list = f50.b.a;
        s c = no.a.c(list, "selections", "Discussion", n, list);
        bb.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        o8.Companion.getClass();
        q0 q0Var = o8.l;
        k.g(q0Var, "type");
        List n2 = d0Shadow.n(new m("discussion", q0Var, (String) null, rVar, rVar, r));
        d3.Companion.getClass();
        q0 q0Var2 = d3.a;
        k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = d0Shadow.n(new m("closeDiscussion", q0Var2, (String) null, rVar, no.a.s(wg.s, new u0(x.u(new w61.k[]{new w61.k("discussionId", new t("discussionId")), new w61.k("reason", new t("reason"))}))), n2));
    }
}
