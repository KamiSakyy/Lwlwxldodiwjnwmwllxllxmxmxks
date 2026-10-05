package jq0;

import aa.j0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import pz0.ba;
import pz0.jx;
import pz0.ny;
import pz0.o7;
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
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        td.Companion.getClass();
        x xVar2 = td.a;
        List r3 = l.r(new m[]{new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ny.Companion.getClass();
        List r4 = l.r(new m[]{new m("owner", l0.b(ny.e), (String) null, rVar, rVar, r3), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        vd.Companion.getClass();
        m mVar2 = new m("number", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        jx.Companion.getClass();
        List r5 = l.r(new m[]{mVar2, mVar3, new m("repository", l0.b(jx.t0), (String) null, rVar, rVar, r4), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pz0.l.Companion.getClass();
        j0 j0Var = pz0.l.a;
        k.g(j0Var, "type");
        m mVar6 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        ba.Companion.getClass();
        q0 q0Var = ba.l;
        k.g(q0Var, "type");
        m mVar7 = new m("discussion", q0Var, (String) null, rVar, rVar, r5);
        o7.Companion.getClass();
        a = l.r(new m[]{mVar4, mVar5, mVar6, mVar7, new m("createdAt", l0.b(o7.a), (String) null, rVar, rVar, rVar)});
    }
}
