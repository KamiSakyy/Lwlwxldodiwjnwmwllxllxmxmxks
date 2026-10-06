package kz0;

import java.util.List;
import pz0.ba;
import pz0.jx;
import pz0.ny;
import pz0.pd;
import pz0.py;
import pz0.su;
import pz0.td;
import pz0.wk;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class w0 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List n = sy.d0Shadow.n(new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar));
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        py.Companion.getClass();
        aa.a0 a0Var = py.s;
        k71.k.g(a0Var, "type");
        aa.m mVar3 = new aa.m("viewerPermission", a0Var, (String) null, rVar, rVar, rVar);
        ny.Companion.getClass();
        aa.m mVar4 = new aa.m("owner", v8.l0.b(ny.e), (String) null, rVar, rVar, n);
        pd.Companion.getClass();
        aa.x xVar3 = pd.a;
        List r3 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, new aa.m("hasNestedDiscussionAnswersEnabled", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar5 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar6 = new aa.m("locked", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        pz0.l.Companion.getClass();
        aa.j0 j0Var = pz0.l.a;
        k71.k.g(j0Var, "type");
        aa.m mVar7 = new aa.m("author", j0Var, (String) null, rVar, rVar, r2);
        jx.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar5, mVar6, mVar7, new aa.m("repository", v8.l0.b(jx.t0), (String) null, rVar, rVar, r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ba.Companion.getClass();
        aa.q0 q0Var = ba.l;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("discussion", q0Var, (String) null, rVar, rVar, r4));
        aa.s mVar8 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = sy.d0Shadow.n("DiscussionComment");
        List list2 = fr0.e.a;
        List r5 = x61.l.r(new aa.s[]{mVar8, no.a.c(list2, "selections", "DiscussionComment", n3, list2), new aa.n("DiscussionComment", sy.d0Shadow.n("DiscussionComment"), n2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        wk.Companion.getClass();
        aa.j0 j0Var2 = wk.a;
        k71.k.g(j0Var2, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var2, (String) null, rVar, no.a.s(su.i, new aa.u0(new aa.t("nodeId"))), r5), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
