package f80;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.dl;
import hc0.fb;
import hc0.hl;
import hc0.mv;
import hc0.ov;
import hc0.vl;
import hc0.xa;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        bb.Companion.getClass();
        x xVar = bb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("id", b, (String) null, rVar, rVar, rVar));
        fb.Companion.getClass();
        x xVar2 = fb.a;
        s mVar = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar2 = new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.b.a;
        List r2 = l.r(new s[]{mVar, mVar2, no.a.c(list, "selections", "Actor", r, list), new n("User", d0.n("User"), n)});
        List r3 = l.r(new m[]{new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        mv.Companion.getClass();
        List n2 = d0.n(new m("nodes", l0.a(mv.a), (String) null, rVar, rVar, r3));
        db.Companion.getClass();
        List n3 = d0.n(new m("totalCount", l0.b(db.a), (String) null, rVar, rVar, rVar));
        m mVar3 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        m mVar5 = new m("authorCanPushToRepository", l0.b(xa.a), (String) null, rVar, rVar, rVar);
        hc0.l.Companion.getClass();
        j0 j0Var = hc0.l.a;
        k.g(j0Var, "type");
        m mVar6 = new m("author", j0Var, (String) null, rVar, rVar, r2);
        vl.Companion.getClass();
        m mVar7 = new m("state", l0.b(vl.s), (String) null, rVar, rVar, rVar);
        ov.Companion.getClass();
        r b2 = l0.b(ov.a);
        dl.Companion.getClass();
        m mVar8 = new m("onBehalfOf", b2, (String) null, rVar, no.a.s(dl.b, new u0(25)), n2);
        m mVar9 = new m("body", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hl.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, new m("comments", l0.b(hl.a), (String) null, rVar, no.a.s(dl.a, new u0(1)), n3)});
    }
}
