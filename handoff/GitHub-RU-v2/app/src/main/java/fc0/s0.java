package fc0;

import hc0.ap;
import hc0.bb;
import hc0.dq;
import hc0.fb;
import hc0.fq;
import hc0.o8;
import hc0.pm;
import hc0.xa;
import hc0.yg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s0 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List n = sy.d0Shadow.n(new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar));
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        fq.Companion.getClass();
        aa.a0 a0Var = fq.s;
        k71.k.g(a0Var, "type");
        aa.m mVar3 = new aa.m("viewerPermission", a0Var, (String) null, rVar, rVar, rVar);
        dq.Companion.getClass();
        aa.m mVar4 = new aa.m("owner", v8.l0.b(dq.a), (String) null, rVar, rVar, n);
        xa.Companion.getClass();
        aa.x xVar3 = xa.a;
        List r3 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, new aa.m("hasNestedDiscussionAnswersEnabled", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar5 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar6 = new aa.m("locked", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        hc0.l.Companion.getClass();
        aa.j0 j0Var = hc0.l.a;
        k71.k.g(j0Var, "type");
        aa.m mVar7 = new aa.m("author", j0Var, (String) null, rVar, rVar, r2);
        ap.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar5, mVar6, mVar7, new aa.m("repository", v8.l0.b(ap.k0), (String) null, rVar, rVar, r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        o8.Companion.getClass();
        aa.q0 q0Var = o8.l;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("discussion", q0Var, (String) null, rVar, rVar, r4));
        aa.s mVar8 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = sy.d0Shadow.n("DiscussionComment");
        List list2 = j50.e.a;
        List r5 = x61.l.r(new aa.s[]{mVar8, no.a.c(list2, "selections", "DiscussionComment", n3, list2), new aa.n("DiscussionComment", sy.d0Shadow.n("DiscussionComment"), n2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        yg.Companion.getClass();
        aa.j0 j0Var2 = yg.a;
        k71.k.g(j0Var2, "type");
        pm.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("node", j0Var2, (String) null, rVar, no.a.s(pm.f, new aa.u0(new aa.t("nodeId"))), r5));
    }
}
