package wo;

import aa.a0;
import aa.m;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.b4;
import m10.cc0;
import m10.ch;
import m10.eh;
import m10.sa;
import m10.t3;
import m10.v3;
import m10.wg;
import m10.x2;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        ah.Companion.getClass();
        r b = l0.b(ah.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        x2.Companion.getClass();
        x xVar = x2.a;
        k71.k.g(xVar, "type");
        m mVar2 = new m("fullDatabaseId", xVar, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        b4.Companion.getClass();
        m mVar4 = new m("status", l0.b(b4.s), (String) null, rVar, rVar, rVar);
        t3.Companion.getClass();
        a0 a0Var = t3.s;
        k71.k.g(a0Var, "type");
        m mVar5 = new m("conclusion", a0Var, (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        m mVar6 = new m("duration", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("title", xVar2, (String) null, rVar, rVar, rVar);
        m mVar8 = new m("summary", xVar2, (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        x xVar3 = sa.a;
        k71.k.g(xVar3, "type");
        m mVar9 = new m("startedAt", xVar3, (String) null, rVar, rVar, rVar);
        m mVar10 = new m("completedAt", xVar3, (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        m mVar11 = new m("permalink", l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        r b2 = l0.b(wg.a);
        List t = no.a.t("checkRequired", false);
        v3.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, new m("isRequired", b2, (String) null, t, no.a.s(v3.a, new u0(new t("pullRequestId"))), rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
