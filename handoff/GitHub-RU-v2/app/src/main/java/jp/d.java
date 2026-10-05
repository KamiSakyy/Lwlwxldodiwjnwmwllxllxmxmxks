package jp;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.m7;
import m10.rf0;
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
        List n = d0.n("CopilotAgentSession");
        List list = ip.e.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "CopilotAgentSession", n, list), new m("sessionId", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m7.Companion.getClass();
        q0 q0Var = m7.a;
        k.g(q0Var, "type");
        rf0.Companion.getClass();
        m mVar2 = new m("viewerCopilotAgentSession", q0Var, (String) null, rVar, no.a.s(rf0.a0, new u0(new t("id"))), r);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        a = l.r(new m[]{new m("viewer", l0.b(rf0.g0), (String) null, rVar, rVar, l.r(new m[]{mVar2, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
