package rx;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import dq.w;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.gh;
import m10.gr;
import m10.sa;
import m10.wg;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("Organization");
        List list = w.a;
        s c = no.a.c(list, "selections", "Organization", n, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        gh.Companion.getClass();
        x xVar3 = gh.a;
        k.g(xVar3, "type");
        m mVar3 = new m("emojiHTML", xVar3, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        m mVar4 = new m("indicatesLimitedAvailability", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("message", xVar, (String) null, rVar, rVar, rVar);
        m mVar6 = new m("emoji", xVar, (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        x xVar4 = sa.a;
        k.g(xVar4, "type");
        m mVar7 = new m("expiresAt", xVar4, (String) null, rVar, rVar, rVar);
        gr.Companion.getClass();
        q0 q0Var = gr.o;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, new m("organization", q0Var, (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
