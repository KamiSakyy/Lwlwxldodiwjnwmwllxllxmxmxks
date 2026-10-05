package iz0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import pz0.g4;
import pz0.h50;
import pz0.jx;
import pz0.k4;
import pz0.ny;
import pz0.rd;
import pz0.td;
import pz0.vd;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("color", b, (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        x xVar2 = vd.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        td.Companion.getClass();
        x xVar3 = td.a;
        m mVar2 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, new m("avatarUrl", l0.b(h50.a), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ny.Companion.getClass();
        List r3 = l.r(new m[]{mVar4, mVar5, new m("owner", l0.b(ny.e), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar6 = new m("lines", l0.b(l0.a(l0.b(xVar))), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("startingLineNumber", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("endingLineNumber", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("jumpToLineNumber", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        rd.Companion.getClass();
        List r4 = l.r(new m[]{mVar6, mVar7, mVar8, mVar9, new m("score", l0.b(rd.a), (String) null, rVar, rVar, rVar)});
        g4.Companion.getClass();
        q0 q0Var = g4.a;
        k.g(q0Var, "type");
        m mVar10 = new m("language", q0Var, (String) null, rVar, rVar, r);
        jx.Companion.getClass();
        q0 q0Var2 = jx.t0;
        k.g(q0Var2, "type");
        m mVar11 = new m("repository", q0Var2, (String) null, rVar, rVar, r3);
        m mVar12 = new m("matchCount", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar13 = new m("path", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar14 = new m("refName", l0.b(xVar), (String) null, rVar, rVar, rVar);
        k4.Companion.getClass();
        a = l.r(new m[]{mVar10, mVar11, mVar12, mVar13, mVar14, new m("snippets", no.a.d(k4.a), (String) null, rVar, rVar, r4)});
    }

    public static List a() {
        return a;
    }
}
