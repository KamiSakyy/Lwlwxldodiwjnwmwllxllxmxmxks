package fr;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.cc0;
import m10.da0;
import m10.eh;
import m10.mg;
import m10.p90;
import m10.rf0;
import m10.sa;
import m10.wg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("login", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        x xVar3 = cc0.a;
        m mVar3 = new m("avatarUrl", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("name", xVar, (String) null, rVar, rVar, rVar);
        rf0.Companion.getClass();
        q0 q0Var = rf0.g0;
        k.g(q0Var, "type");
        List r2 = l.r(new m[]{mVar2, mVar3, mVar4, new m("user", q0Var, (String) null, rVar, rVar, r)});
        List r3 = l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("avatarUrl", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("name", xVar, (String) null, rVar, rVar, rVar), new m("user", q0Var, (String) null, rVar, rVar, l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        da0.Companion.getClass();
        List r4 = l.r(new m[]{mVar5, new m("state", l0.b(da0.s), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar6 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        m mVar7 = new m("committedDate", l0.b(sa.a), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("messageHeadline", l0.b(xVar), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar4 = wg.a;
        m mVar9 = new m("committedViaWeb", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar10 = new m("authoredByCommitter", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar11 = new m("abbreviatedOid", l0.b(xVar), (String) null, rVar, rVar, rVar);
        mg.Companion.getClass();
        q0 q0Var2 = mg.a;
        k.g(q0Var2, "type");
        m mVar12 = new m("committer", q0Var2, (String) null, rVar, rVar, r2);
        m mVar13 = new m("author", q0Var2, (String) null, rVar, rVar, r3);
        p90.Companion.getClass();
        q0 q0Var3 = p90.c;
        k.g(q0Var3, "type");
        a = l.r(new m[]{mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, new m("statusCheckRollup", q0Var3, (String) null, rVar, rVar, r4), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
