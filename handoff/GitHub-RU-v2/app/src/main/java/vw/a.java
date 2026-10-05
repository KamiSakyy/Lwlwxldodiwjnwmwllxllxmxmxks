package vw;

import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import aa.x0;
import java.util.List;
import k71.k;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.eh;
import m10.r90;
import m10.sa;
import m10.v90;
import m10.wg;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("id", b, (String) null, rVar, rVar, rVar));
        List n2 = d0.n(new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar));
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = l.r(new s[]{new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("CheckRun", d0.n("CheckRun"), n), new n("StatusContext", d0.n("StatusContext"), n2)});
        m mVar = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar2 = new m("description", xVar2, (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        m mVar3 = new m("durationInSeconds", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        m mVar4 = new m("stateChangedAt", l0.b(sa.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        m mVar5 = new m("isRequired", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("displayName", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        v90.Companion.getClass();
        m mVar7 = new m("state", l0.b(v90.s), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        x xVar3 = cc0.a;
        k.g(xVar3, "type");
        m mVar8 = new m("targetUrl", xVar3, (String) null, rVar, rVar, rVar);
        m mVar9 = new m("avatarUrl", xVar3, (String) null, rVar, rVar, rVar);
        m mVar10 = new m("additionalContext", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        r90.Companion.getClass();
        x0 x0Var = r90.a;
        k.g(x0Var, "type");
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, new m("underlyingContext", x0Var, (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
