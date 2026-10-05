package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.fd;
import m10.i30;
import m10.l40;
import m10.n40;
import m10.p00;
import m10.wg;
import m10.zp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class z0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List n = sy.d0.n(new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar));
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        n40.Companion.getClass();
        aa.a0 a0Var = n40.s;
        k71.k.g(a0Var, "type");
        aa.m mVar3 = new aa.m("viewerPermission", a0Var, (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        aa.m mVar4 = new aa.m("owner", v8.l0.b(l40.e), (String) null, rVar, rVar, n);
        wg.Companion.getClass();
        aa.x xVar3 = wg.a;
        List r3 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, new aa.m("hasNestedDiscussionAnswersEnabled", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar5 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar6 = new aa.m("locked", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m10.l.Companion.getClass();
        aa.j0 j0Var = m10.l.a;
        k71.k.g(j0Var, "type");
        aa.m mVar7 = new aa.m("author", j0Var, (String) null, rVar, rVar, r2);
        i30.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar5, mVar6, mVar7, new aa.m("repository", v8.l0.b(i30.w0), (String) null, rVar, rVar, r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        fd.Companion.getClass();
        aa.q0 q0Var = fd.l;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("discussion", q0Var, (String) null, rVar, rVar, r4));
        aa.s mVar8 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = sy.d0.n("DiscussionComment");
        List list2 = ns.e.a;
        List r5 = x61.l.r(new aa.s[]{mVar8, no.a.c(list2, "selections", "DiscussionComment", n3, list2), new aa.n("DiscussionComment", sy.d0.n("DiscussionComment"), n2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        aa.j0 j0Var2 = zp.a;
        k71.k.g(j0Var2, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var2, (String) null, rVar, no.a.s(p00.i, new aa.u0(new aa.t("nodeId"))), r5), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
