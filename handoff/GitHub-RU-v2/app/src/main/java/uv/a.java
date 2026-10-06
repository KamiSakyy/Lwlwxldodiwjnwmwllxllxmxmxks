package uv;

import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.da0;
import m10.eh;
import m10.i30;
import m10.j90;
import m10.l40;
import m10.sa;
import m10.wg;
import m10.y5;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Actor", l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), list)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        m mVar5 = new m("owner", l0.b(l40.e), (String) null, rVar, rVar, r3);
        wg.Companion.getClass();
        x xVar3 = wg.a;
        List r4 = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, new m("isPrivate", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        m mVar6 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        da0.Companion.getClass();
        List r5 = l.r(new m[]{mVar6, new m("state", l0.b(da0.s), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar7 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        j90.Companion.getClass();
        q0 q0Var = j90.a;
        k.g(q0Var, "type");
        List r6 = l.r(new m[]{mVar7, mVar8, new m("status", q0Var, (String) null, rVar, rVar, r5), new m("messageHeadline", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar9 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar10 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar11 = new m("isCrossRepository", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m10.l.Companion.getClass();
        j0 j0Var = m10.l.a;
        k.g(j0Var, "type");
        m mVar12 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        i30.Companion.getClass();
        m mVar13 = new m("commitRepository", l0.b(i30.w0), (String) null, rVar, rVar, r4);
        y5.Companion.getClass();
        q0 q0Var2 = y5.j;
        k.g(q0Var2, "type");
        m mVar14 = new m("commit", q0Var2, (String) null, rVar, rVar, r6);
        sa.Companion.getClass();
        a = l.r(new m[]{mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, new m("createdAt", l0.b(sa.a), (String) null, rVar, rVar, rVar)});
    }
}
