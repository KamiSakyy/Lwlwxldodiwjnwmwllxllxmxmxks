package dq;

import aa.q0;
import aa.u0;
import java.util.List;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.da0;
import m10.dy;
import m10.eh;
import m10.hy;
import m10.i30;
import m10.jy;
import m10.l40;
import m10.p90;
import m10.ux;
import m10.y5;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p0 {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.x xVar = ah.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("login", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, new aa.m("owner", v8.l0.b(l40.e), (String) null, rVar, rVar, r), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        da0.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{new aa.m("state", v8.l0.b(da0.s), (String) null, rVar, rVar, rVar), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        p90.Companion.getClass();
        q0 q0Var = p90.c;
        k71.k.g(q0Var, "type");
        List r4 = x61.l.r(new aa.m[]{new aa.m("statusCheckRollup", q0Var, (String) null, rVar, rVar, r3), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        y5.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{new aa.m("commit", v8.l0.b(y5.j), (String) null, rVar, rVar, r4), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        dy.Companion.getClass();
        q0 q0Var2 = dy.a;
        k71.k.g(q0Var2, "type");
        List n = sy.d0.n(new aa.m("node", q0Var2, (String) null, rVar, rVar, r5));
        jy.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("edges", v8.l0.a(jy.a), (String) null, rVar, rVar, n));
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("title", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        aa.m mVar6 = new aa.m("number", v8.l0.b(ch.a), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        aa.m mVar7 = new aa.m("url", v8.l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        i30.Companion.getClass();
        aa.m mVar8 = new aa.m("repository", v8.l0.b(i30.w0), (String) null, rVar, rVar, r2);
        hy.Companion.getClass();
        aa.r b2 = v8.l0.b(hy.a);
        ux.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar4, mVar5, mVar6, mVar7, mVar8, new aa.m("commits", b2, (String) null, rVar, no.a.s(ux.l, new u0(1)), n2), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
