package dr0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import pz0.h50;
import pz0.pd;
import pz0.td;
import pz0.xa;
import pz0.xd;
import pz0.zd;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        h50.Companion.getClass();
        r b = l0.b(h50.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new m("url", b, (String) null, rVar, rVar, rVar));
        td.Companion.getClass();
        m mVar = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar = xd.a;
        m mVar2 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        zd.Companion.getClass();
        m mVar3 = new m("emojiHTML", l0.b(zd.a), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar2 = pd.a;
        m mVar4 = new m("isAnswerable", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("isPollable", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        q0 q0Var = xa.a;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, new m("template", q0Var, (String) null, rVar, rVar, n), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
