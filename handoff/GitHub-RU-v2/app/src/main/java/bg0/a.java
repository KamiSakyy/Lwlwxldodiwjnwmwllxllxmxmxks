package bg0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import gn0.o9;
import gn0.pb;
import gn0.tb;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        s mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("DiscussionPoll");
        List list = b.a;
        List r = l.r(new s[]{mVar, mVar2, no.a.c(list, "selections", "DiscussionPoll", n, list)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        o9.Companion.getClass();
        q0 q0Var = o9.b;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar3, new m("poll", q0Var, (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
