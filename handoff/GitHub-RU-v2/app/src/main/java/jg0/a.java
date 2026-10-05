package jg0;

import aa.j0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import gn0.d4;
import gn0.ll;
import gn0.pb;
import gn0.r6;
import gn0.tb;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("headRefName", l0.b(xVar), (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r3 = l.r(new m[]{mVar2, mVar3, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r4 = l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("abbreviatedOid", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r5 = l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("abbreviatedOid", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        gn0.l.Companion.getClass();
        j0 j0Var = gn0.l.a;
        k.g(j0Var, "type");
        m mVar6 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        r6.Companion.getClass();
        m mVar7 = new m("createdAt", l0.b(r6.a), (String) null, rVar, rVar, rVar);
        ll.Companion.getClass();
        m mVar8 = new m("pullRequest", l0.b(ll.K), (String) null, rVar, rVar, r3);
        d4.Companion.getClass();
        q0 q0Var = d4.j;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar4, mVar5, mVar6, mVar7, mVar8, new m("beforeCommit", q0Var, (String) null, rVar, rVar, r4), new m("afterCommit", q0Var, (String) null, rVar, rVar, r5)});
    }
}
