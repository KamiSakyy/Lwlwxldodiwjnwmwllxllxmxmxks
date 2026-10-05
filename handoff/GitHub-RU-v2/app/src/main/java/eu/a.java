package eu;

import aa.j0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.sa;
import m10.y5;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("abbreviatedOid", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r3 = l.r(new m[]{mVar2, mVar3, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m10.l.Companion.getClass();
        j0 j0Var = m10.l.a;
        k.g(j0Var, "type");
        m mVar6 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        m mVar7 = new m("mergeRefName", l0.b(xVar), (String) null, rVar, rVar, rVar);
        y5.Companion.getClass();
        q0 q0Var = y5.j;
        k.g(q0Var, "type");
        m mVar8 = new m("commit", q0Var, (String) null, rVar, rVar, r3);
        sa.Companion.getClass();
        a = l.r(new m[]{mVar4, mVar5, mVar6, mVar7, mVar8, new m("createdAt", l0.b(sa.a), (String) null, rVar, rVar, rVar)});
    }
}
