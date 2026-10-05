package wv0;

import aa.j0;
import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import pz0.o7;
import pz0.sf;
import pz0.td;
import pz0.xd;
import sy.d0;
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
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("Label");
        List list2 = bs0.a.a;
        s c = no.a.c(list2, "selections", "Label", n, list2);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r3 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pz0.l.Companion.getClass();
        j0 j0Var = pz0.l.a;
        k.g(j0Var, "type");
        m mVar5 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        sf.Companion.getClass();
        m mVar6 = new m("label", l0.b(sf.a), (String) null, rVar, rVar, r3);
        o7.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, new m("createdAt", l0.b(o7.a), (String) null, rVar, rVar, rVar)});
    }
}
