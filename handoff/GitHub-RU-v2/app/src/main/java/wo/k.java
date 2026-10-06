package wo;

import aa.a0;
import aa.m;
import aa.q0;
import aa.r;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.b4;
import m10.ch;
import m10.eh;
import m10.gh0;
import m10.h4;
import m10.i30;
import m10.j10;
import m10.l40;
import m10.ly;
import m10.n40;
import m10.rf0;
import m10.sa;
import m10.t3;
import m10.tg0;
import m10.ux;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = l.r(new m[]{mVar, new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r2 = l.r(new m[]{new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r3 = l.r(new m[]{new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        m mVar4 = new m("owner", l0.b(l40.e), (String) null, rVar, rVar, r2);
        n40.Companion.getClass();
        a0 a0Var = n40.s;
        k71.k.g(a0Var, "type");
        m mVar5 = new m("viewerPermission", a0Var, (String) null, rVar, rVar, rVar);
        j10.Companion.getClass();
        q0 q0Var = j10.e;
        k71.k.g(q0Var, "type");
        List r4 = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, new m("defaultBranchRef", q0Var, (String) null, rVar, rVar, r3), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar6 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        x xVar3 = ch.a;
        List r5 = l.r(new m[]{mVar6, new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ux.Companion.getClass();
        List n = d0Shadow.n(new m("nodes", l0.a(ux.T), (String) null, rVar, rVar, r5));
        List r6 = l.r(new m[]{new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r7 = l.r(new m[]{new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar7 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        b4.Companion.getClass();
        m mVar8 = new m("status", l0.b(b4.s), (String) null, rVar, rVar, rVar);
        t3.Companion.getClass();
        a0 a0Var2 = t3.s;
        k71.k.g(a0Var2, "type");
        m mVar9 = new m("conclusion", a0Var2, (String) null, rVar, rVar, rVar);
        m mVar10 = new m("workflowFilePath", xVar2, (String) null, rVar, rVar, rVar);
        i30.Companion.getClass();
        m mVar11 = new m("repository", l0.b(i30.w0), (String) null, rVar, rVar, r4);
        ly.Companion.getClass();
        q0 q0Var2 = ly.a;
        k71.k.g(q0Var2, "type");
        h4.Companion.getClass();
        m mVar12 = new m("matchingPullRequests", q0Var2, (String) null, rVar, no.a.s(h4.e, new u0(1)), n);
        m mVar13 = new m("duration", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar14 = new m("branch", q0Var, (String) null, rVar, rVar, r6);
        rf0.Companion.getClass();
        q0 q0Var3 = rf0.g0;
        k71.k.g(q0Var3, "type");
        List r8 = l.r(new m[]{mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, new m("creator", q0Var3, (String) null, rVar, rVar, r7), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar15 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar16 = new m("title", xVar2, (String) null, rVar, rVar, rVar);
        m mVar17 = new m("runNumber", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        gh0.Companion.getClass();
        m mVar18 = new m("eventType", l0.b(gh0.s), (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        m mVar19 = new m("createdAt", l0.b(sa.a), (String) null, rVar, rVar, rVar);
        tg0.Companion.getClass();
        a = l.r(new m[]{mVar15, mVar16, mVar17, mVar18, mVar19, new m("workflow", l0.b(tg0.e), (String) null, rVar, rVar, r), new m("checkSuite", l0.b(h4.f), (String) null, rVar, rVar, r8), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }

    public k(Object... a) {
    }
}
