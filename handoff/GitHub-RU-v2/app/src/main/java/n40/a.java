package n40;

import aa.j0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import hc0.ap;
import hc0.bb;
import hc0.db;
import hc0.dq;
import hc0.fb;
import hc0.h6;
import hc0.o8;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r3 = l.r(new m[]{new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        dq.Companion.getClass();
        List r4 = l.r(new m[]{new m("owner", l0.b(dq.a), (String) null, rVar, rVar, r3), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        db.Companion.getClass();
        m mVar2 = new m("number", l0.b(db.a), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ap.Companion.getClass();
        List r5 = l.r(new m[]{mVar2, mVar3, new m("repository", l0.b(ap.k0), (String) null, rVar, rVar, r4), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hc0.l.Companion.getClass();
        j0 j0Var = hc0.l.a;
        k.g(j0Var, "type");
        m mVar6 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        o8.Companion.getClass();
        q0 q0Var = o8.l;
        k.g(q0Var, "type");
        m mVar7 = new m("discussion", q0Var, (String) null, rVar, rVar, r5);
        h6.Companion.getClass();
        a = l.r(new m[]{mVar4, mVar5, mVar6, mVar7, new m("createdAt", l0.b(h6.a), (String) null, rVar, rVar, rVar)});
    }
}
