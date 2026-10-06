package zf0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import gn0.a9;
import gn0.lb;
import gn0.pb;
import gn0.tb;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        pb.Companion.getClass();
        x xVar = pb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar2 = tb.a;
        List r = l.r(new m[]{mVar, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        m mVar3 = new m("isAnswer", l0.b(lb.a), (String) null, rVar, rVar, rVar);
        a9.Companion.getClass();
        q0 q0Var = a9.l;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar2, mVar3, new m("discussion", q0Var, (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
