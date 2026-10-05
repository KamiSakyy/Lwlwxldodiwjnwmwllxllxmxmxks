package xf0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import gn0.lb;
import gn0.mx;
import gn0.pb;
import gn0.tb;
import gn0.vb;
import gn0.w9;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        mx.Companion.getClass();
        r b = l0.b(mx.a);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("url", b, (String) null, rVar, rVar, rVar));
        pb.Companion.getClass();
        m mVar = new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar = tb.a;
        m mVar2 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        vb.Companion.getClass();
        m mVar3 = new m("emojiHTML", l0.b(vb.a), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar2 = lb.a;
        m mVar4 = new m("isAnswerable", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("isPollable", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        w9.Companion.getClass();
        q0 q0Var = w9.a;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, new m("template", q0Var, (String) null, rVar, rVar, n), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
