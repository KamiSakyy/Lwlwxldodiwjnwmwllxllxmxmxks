package ps;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.td;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        s mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0.n("DiscussionPoll");
        List list = b.a;
        List r = l.r(new s[]{mVar, mVar2, no.a.c(list, "selections", "DiscussionPoll", n, list)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        q0 q0Var = td.b;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar3, new m("poll", q0Var, (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
