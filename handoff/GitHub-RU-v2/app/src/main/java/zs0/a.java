package zs0;

import aa.j0;
import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import pz0.o7;
import pz0.td;
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
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        m mVar3 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        pz0.l.Companion.getClass();
        j0 j0Var = pz0.l.a;
        k.g(j0Var, "type");
        m mVar4 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        m mVar5 = new m("milestoneTitle", l0.b(xVar), (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        a = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, new m("createdAt", l0.b(o7.a), (String) null, rVar, rVar, rVar)});
    }
}
