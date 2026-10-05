package l30;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import aa.x0;
import hc0.bb;
import hc0.fb;
import hc0.h6;
import hc0.z0;
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
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Actor", l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), list)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        m mVar3 = new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        hc0.l.Companion.getClass();
        j0 j0Var = hc0.l.a;
        k.g(j0Var, "type");
        m mVar4 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        z0.Companion.getClass();
        x0 x0Var = z0.a;
        k.g(x0Var, "type");
        m mVar5 = new m("assignee", x0Var, (String) null, rVar, rVar, r3);
        h6.Companion.getClass();
        a = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, new m("createdAt", l0.b(h6.a), (String) null, rVar, rVar, rVar)});
    }
}
