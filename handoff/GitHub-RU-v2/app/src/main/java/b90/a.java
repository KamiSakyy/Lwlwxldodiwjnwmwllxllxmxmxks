package b90;

import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import hc0.bb;
import hc0.dl;
import hc0.ew;
import hc0.fb;
import hc0.h6;
import hc0.xa;
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
        hc0.l.Companion.getClass();
        j0 j0Var = hc0.l.a;
        k.g(j0Var, "type");
        m mVar3 = new m("author", j0Var, (String) null, rVar, rVar, r3);
        xa.Companion.getClass();
        m mVar4 = new m("includesCreatedEdit", l0.b(xa.a), (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r4 = l.r(new m[]{mVar2, mVar3, mVar4, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        m mVar8 = new m("dismissalMessageHTML", xVar, (String) null, rVar, rVar, rVar);
        dl.Companion.getClass();
        q0 q0Var = dl.d;
        k.g(q0Var, "type");
        m mVar9 = new m("review", q0Var, (String) null, rVar, rVar, r4);
        h6.Companion.getClass();
        m mVar10 = new m("createdAt", l0.b(h6.a), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        a = l.r(new m[]{mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, new m("url", l0.b(ew.a), (String) null, rVar, rVar, rVar)});
    }
}
