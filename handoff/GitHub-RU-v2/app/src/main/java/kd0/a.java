package kd0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import gn0.a9;
import gn0.f3;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;
import x61.x;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        r b = l0.b(tb.a);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("Discussion");
        List list = vf0.b.a;
        s c = no.a.c(list, "selections", "Discussion", n, list);
        pb.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        a9.Companion.getClass();
        q0 q0Var = a9.l;
        k.g(q0Var, "type");
        List n2 = d0.n(new m("discussion", q0Var, (String) null, rVar, rVar, r));
        f3.Companion.getClass();
        q0 q0Var2 = f3.a;
        k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = d0.n(new m("closeDiscussion", q0Var2, (String) null, rVar, no.a.s(wh.s, new u0(x.u(new w61.k("discussionId", new t("discussionId")), new w61.k("reason", new t("reason"))))), n2));
    }
}
