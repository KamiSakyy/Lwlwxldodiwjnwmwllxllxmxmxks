package tj0;

import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import gn0.fm;
import gn0.lb;
import gn0.mx;
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
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Actor", l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), list)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        gn0.l.Companion.getClass();
        j0 j0Var = gn0.l.a;
        k.g(j0Var, "type");
        m mVar3 = new m("author", j0Var, (String) null, rVar, rVar, r3);
        lb.Companion.getClass();
        m mVar4 = new m("includesCreatedEdit", l0.b(lb.a), (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r4 = l.r(new m[]{mVar2, mVar3, mVar4, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        m mVar8 = new m("dismissalMessageHTML", xVar, (String) null, rVar, rVar, rVar);
        fm.Companion.getClass();
        q0 q0Var = fm.d;
        k.g(q0Var, "type");
        m mVar9 = new m("review", q0Var, (String) null, rVar, rVar, r4);
        r6.Companion.getClass();
        m mVar10 = new m("createdAt", l0.b(r6.a), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        a = l.r(new m[]{mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, new m("url", l0.b(mx.a), (String) null, rVar, rVar, rVar)});
    }
}
