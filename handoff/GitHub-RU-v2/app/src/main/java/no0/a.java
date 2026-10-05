package no0;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import jy0.j;
import k71.k;
import pz0.eb;
import pz0.lp;
import pz0.np;
import pz0.o7;
import pz0.su;
import pz0.td;
import pz0.wk;
import pz0.xd;
import pz0.xn;
import pz0.zd;
import pz0.zn;
import sy.d0;
import v8.l0;
import x61.l;
import xx0.i;

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
        List n = d0.n("ProjectV2");
        List list2 = i.a;
        s c = no.a.c(list2, "selections", "ProjectV2", n, list2);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r3 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        xn.Companion.getClass();
        List n2 = d0.n(new m("nodes", l0.a(xn.d), (String) null, rVar, rVar, r3));
        s mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = d0.n("ProjectV2Item");
        List list3 = j.a;
        List r4 = l.r(new s[]{mVar3, no.a.c(list3, "selections", "ProjectV2Item", n3, list3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        lp.Companion.getClass();
        List n4 = d0.n(new m("nodes", l0.a(lp.b), (String) null, rVar, rVar, r4));
        m mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        zd.Companion.getClass();
        m mVar5 = new m("bodyHTML", l0.b(zd.a), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        m mVar7 = new m("updatedAt", l0.b(o7.a), (String) null, rVar, rVar, rVar);
        pz0.l.Companion.getClass();
        j0 j0Var = pz0.l.a;
        k.g(j0Var, "type");
        m mVar8 = new m("creator", j0Var, (String) null, rVar, rVar, r2);
        zn.Companion.getClass();
        r b2 = l0.b(zn.a);
        eb.Companion.getClass();
        m mVar9 = new m("projectsV2", b2, (String) null, rVar, no.a.s(eb.b, new u0(1)), n2);
        np.Companion.getClass();
        List r5 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("DraftIssue", d0.n("DraftIssue"), l.r(new m[]{mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, new m("projectV2Items", l0.b(np.a), (String) null, rVar, no.a.s(eb.a, new u0(1)), n4)}))});
        wk.Companion.getClass();
        j0 j0Var2 = wk.a;
        k.g(j0Var2, "type");
        su.Companion.getClass();
        a = l.r(new m[]{new m("node", j0Var2, (String) null, rVar, no.a.s(su.i, new u0(new t("nodeId"))), r5), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
