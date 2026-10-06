package pp;

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
import m10.r4;
import m10.vp;
import sy.d0Shadow;
import v8.l0;
import x61.l;
import x61.x;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        r b = l0.b(eh.a);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Discussion");
        List list = js.b.a;
        s c = no.a.c(list, "selections", "Discussion", n, list);
        ah.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        fd.Companion.getClass();
        q0 q0Var = fd.l;
        k.g(q0Var, "type");
        List n2 = d0Shadow.n(new m("discussion", q0Var, (String) null, rVar, rVar, r));
        r4.Companion.getClass();
        q0 q0Var2 = r4.a;
        k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = d0Shadow.n(new m("closeDiscussion", q0Var2, (String) null, rVar, no.a.s(vp.y, new u0(x.u(new w61.k[]{new w61.k("discussionId", new t("discussionId")), new w61.k("reason", new t("reason"))}))), n2));
    }
}
