package mv0;

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
import pz0.bf;
import pz0.df;
import pz0.h50;
import pz0.le;
import pz0.o7;
import pz0.td;
import pz0.vd;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
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
        bf.Companion.getClass();
        m mVar2 = new m("state", l0.b(bf.s), "issueState", rVar, rVar, rVar);
        m mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        m mVar4 = new m("url", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        m mVar5 = new m("number", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        df.Companion.getClass();
        a0 a0Var = df.s;
        k.g(a0Var, "type");
        List r3 = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, new m("stateReason", a0Var, (String) null, rVar, rVar, rVar)});
        s mVar6 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s nVar = new n("Issue", d0.n("Issue"), r3);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r4 = l.r(new s[]{mVar6, nVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar7 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pz0.l.Companion.getClass();
        j0 j0Var = pz0.l.a;
        k.g(j0Var, "type");
        m mVar9 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        le.Companion.getClass();
        q0 q0Var = le.A;
        k.g(q0Var, "type");
        m mVar10 = new m("subIssue", q0Var, (String) null, rVar, rVar, r4);
        o7.Companion.getClass();
        a = l.r(new m[]{mVar7, mVar8, mVar9, mVar10, new m("createdAt", l0.b(o7.a), (String) null, rVar, rVar, rVar)});
    }
}
