package jh0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import gn0.pb;
import gn0.r6;
import gn0.s00;
import gn0.tb;
import java.util.List;
import k71.k;
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
        m mVar = new m("login", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        r6.Companion.getClass();
        m mVar2 = new m("createdAt", l0.b(r6.a), (String) null, rVar, rVar, rVar);
        s00.Companion.getClass();
        q0 q0Var = s00.P;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar2, new m("enqueuer", q0Var, (String) null, rVar, rVar, r), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
