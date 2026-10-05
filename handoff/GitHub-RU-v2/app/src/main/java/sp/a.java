package sp;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import g00.j;
import java.util.List;
import k71.k;
import m10.ah;
import m10.at;
import m10.ct;
import m10.eh;
import m10.gh;
import m10.ie;
import m10.p00;
import m10.sa;
import m10.su;
import m10.uu;
import m10.zp;
import sy.d0;
import uz.i;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2");
        List list2 = i.a;
        s c = no.a.c(list2, "selections", "ProjectV2", n, list2);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r3 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        at.Companion.getClass();
        List n2 = d0.n(new m("nodes", l0.a(at.d), (String) null, rVar, rVar, r3));
        s mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = d0.n("ProjectV2Item");
        List list3 = j.a;
        List r4 = l.r(new s[]{mVar3, no.a.c(list3, "selections", "ProjectV2Item", n3, list3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        su.Companion.getClass();
        List n4 = d0.n(new m("nodes", l0.a(su.b), (String) null, rVar, rVar, r4));
        m mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        gh.Companion.getClass();
        m mVar5 = new m("bodyHTML", l0.b(gh.a), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        m mVar7 = new m("updatedAt", l0.b(sa.a), (String) null, rVar, rVar, rVar);
        m10.l.Companion.getClass();
        j0 j0Var = m10.l.a;
        k.g(j0Var, "type");
        m mVar8 = new m("creator", j0Var, (String) null, rVar, rVar, r2);
        ct.Companion.getClass();
        r b2 = l0.b(ct.a);
        ie.Companion.getClass();
        m mVar9 = new m("projectsV2", b2, (String) null, rVar, no.a.s(ie.b, new u0(1)), n2);
        uu.Companion.getClass();
        List r5 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("DraftIssue", d0.n("DraftIssue"), l.r(new m[]{mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, new m("projectV2Items", l0.b(uu.a), (String) null, rVar, no.a.s(ie.a, new u0(1)), n4)}))});
        zp.Companion.getClass();
        j0 j0Var2 = zp.a;
        k.g(j0Var2, "type");
        p00.Companion.getClass();
        a = l.r(new m[]{new m("node", j0Var2, (String) null, rVar, no.a.s(p00.i, new u0(new t("nodeId"))), r5), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
