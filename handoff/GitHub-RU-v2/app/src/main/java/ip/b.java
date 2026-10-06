package ip;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.eh;
import m10.n3;
import m10.wg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        ah.Companion.getClass();
        r b = l0.b(ah.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar = eh.a;
        List r = l.r(new m[]{mVar, new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        cc0.Companion.getClass();
        x xVar2 = cc0.a;
        k.g(xVar2, "type");
        m mVar2 = new m("avatarUrl", xVar2, (String) null, rVar, rVar, rVar);
        n3.Companion.getClass();
        q0 q0Var = n3.a;
        k.g(q0Var, "type");
        m mVar3 = new m("bot", q0Var, (String) null, rVar, rVar, r);
        m mVar4 = new m("displayName", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        m mVar5 = new m("integrationId", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("slug", l0.b(xVar), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        a = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, new m("isCopilot", l0.b(wg.a), (String) null, rVar, rVar, rVar)});
    }
}
