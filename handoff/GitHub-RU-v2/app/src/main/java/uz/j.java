package uz;

import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.at;
import m10.cc0;
import m10.ch;
import m10.eh;
import m10.i30;
import m10.ow;
import m10.q30;
import m10.sa;
import m10.wg;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("login", b, (String) null, rVar, rVar, rVar));
        List n2 = d0.n(new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar));
        s mVar = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new s[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("User", d0.n("User"), n), new n("Organization", d0.n("Organization"), n2)});
        List r2 = l.r(new m[]{new m("nameWithOwner", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ch.Companion.getClass();
        x xVar3 = ch.a;
        m mVar2 = new m("totalCount", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        i30.Companion.getClass();
        List r3 = l.r(new m[]{mVar2, new m("nodes", l0.a(i30.w0), (String) null, rVar, rVar, r2)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        m mVar6 = new m("updatedAt", l0.b(sa.a), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("shortDescription", xVar, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar4 = wg.a;
        m mVar8 = new m("public", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        m mVar9 = new m("url", l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        m mVar10 = new m("closed", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        ow.Companion.getClass();
        m mVar11 = new m("owner", l0.b(ow.g), (String) null, rVar, rVar, r);
        q30.Companion.getClass();
        r b2 = l0.b(q30.a);
        at.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, new m("repositories", b2, (String) null, rVar, no.a.s(at.b, new u0(1)), r3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
