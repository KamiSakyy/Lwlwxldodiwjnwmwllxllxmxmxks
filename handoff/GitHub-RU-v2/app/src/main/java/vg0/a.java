package vg0;

import aa.j0;
import aa.m;
import aa.r;
import aa.s;
import aa.x;
import gn0.hd;
import gn0.pb;
import gn0.r6;
import gn0.tb;
import java.util.List;
import k71.k;
import sy.d0;
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
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("Label");
        List list2 = rg0.a.a;
        s c = no.a.c(list2, "selections", "Label", n, list2);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r3 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        gn0.l.Companion.getClass();
        j0 j0Var = gn0.l.a;
        k.g(j0Var, "type");
        m mVar5 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        hd.Companion.getClass();
        m mVar6 = new m("label", l0.b(hd.a), (String) null, rVar, rVar, r3);
        r6.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, new m("createdAt", l0.b(r6.a), (String) null, rVar, rVar, rVar)});
    }
}
