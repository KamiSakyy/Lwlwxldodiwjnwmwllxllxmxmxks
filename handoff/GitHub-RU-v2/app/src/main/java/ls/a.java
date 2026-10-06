package ls;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.be;
import m10.cc0;
import m10.eh;
import m10.gh;
import m10.wg;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        cc0.Companion.getClass();
        r b = l0.b(cc0.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new m("url", b, (String) null, rVar, rVar, rVar));
        ah.Companion.getClass();
        m mVar = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar = eh.a;
        m mVar2 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        gh.Companion.getClass();
        m mVar3 = new m("emojiHTML", l0.b(gh.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar2 = wg.a;
        m mVar4 = new m("isAnswerable", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("isPollable", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        be.Companion.getClass();
        q0 q0Var = be.a;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, new m("template", q0Var, (String) null, rVar, rVar, n), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
