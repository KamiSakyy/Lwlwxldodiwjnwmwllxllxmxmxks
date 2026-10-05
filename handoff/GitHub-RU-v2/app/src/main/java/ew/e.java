package ew;

import aa.a0;
import aa.q0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.i30;
import m10.l40;
import m10.wh;
import m10.wi;
import m10.yi;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, new aa.m("owner", l0.b(l40.e), (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar4 = new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0.n("Issue");
        List list = dt.a.a;
        List r3 = x61.l.r(new aa.s[]{mVar4, no.a.c(list, "selections", "Issue", n, list), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar5 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar6 = new aa.m("title", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("titleHTML", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        aa.m mVar8 = new aa.m("number", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        i30.Companion.getClass();
        aa.m mVar9 = new aa.m("repository", l0.b(i30.w0), (String) null, rVar, rVar, r2);
        yi.Companion.getClass();
        a0 a0Var = yi.s;
        k71.k.g(a0Var, "type");
        aa.m mVar10 = new aa.m("stateReason", a0Var, (String) null, rVar, rVar, rVar);
        wi.Companion.getClass();
        aa.m mVar11 = new aa.m("state", l0.b(wi.s), (String) null, rVar, rVar, rVar);
        wh.Companion.getClass();
        q0 q0Var = wh.B;
        k71.k.g(q0Var, "type");
        a = x61.l.r(new aa.m[]{new aa.m("parent", q0Var, (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, new aa.m("duplicateOf", q0Var, (String) null, rVar, rVar, r3), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)})), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
