package xw;

import aa.a0;
import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.eh;
import m10.sa;
import m10.wh;
import m10.wi;
import m10.yi;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        wi.Companion.getClass();
        m mVar2 = new m("state", l0.b(wi.s), "issueState", rVar, rVar, rVar);
        m mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        m mVar4 = new m("url", l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        m mVar5 = new m("number", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        yi.Companion.getClass();
        a0 a0Var = yi.s;
        k.g(a0Var, "type");
        List r3 = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, new m("stateReason", a0Var, (String) null, rVar, rVar, rVar)});
        s mVar6 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s nVar = new n("Issue", d0Shadow.n("Issue"), r3);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r4 = l.r(new s[]{mVar6, nVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar7 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m10.l.Companion.getClass();
        j0 j0Var = m10.l.a;
        k.g(j0Var, "type");
        m mVar9 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        wh.Companion.getClass();
        q0 q0Var = wh.B;
        k.g(q0Var, "type");
        m mVar10 = new m("subIssue", q0Var, (String) null, rVar, rVar, r4);
        sa.Companion.getClass();
        a = l.r(new m[]{mVar7, mVar8, mVar9, mVar10, new m("createdAt", l0.b(sa.a), (String) null, rVar, rVar, rVar)});
    }
}
