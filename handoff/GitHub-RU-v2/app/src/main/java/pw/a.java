package pw;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import aa.x0;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.f50;
import m10.sa;
import sy.d0;
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
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s nVar = new n("Actor", l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), list);
        List n = d0.n("Team");
        List list2 = bx.a.a;
        List r3 = l.r(new s[]{mVar2, nVar, no.a.c(list2, "selections", "Team", n, list2)});
        m mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        m mVar4 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        m10.l.Companion.getClass();
        j0 j0Var = m10.l.a;
        k.g(j0Var, "type");
        m mVar5 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        f50.Companion.getClass();
        x0 x0Var = f50.a;
        k.g(x0Var, "type");
        m mVar6 = new m("requestedReviewer", x0Var, (String) null, rVar, rVar, r3);
        sa.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, new m("createdAt", l0.b(sa.a), (String) null, rVar, rVar, rVar)});
    }
}
