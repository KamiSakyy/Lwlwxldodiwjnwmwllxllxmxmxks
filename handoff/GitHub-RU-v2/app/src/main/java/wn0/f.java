package wn0;

import aa.a0;
import aa.m;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.a3;
import pz0.e3;
import pz0.h50;
import pz0.k2;
import pz0.o7;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.xd;
import pz0.y2;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        td.Companion.getClass();
        r b = l0.b(td.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        k2.Companion.getClass();
        x xVar = k2.a;
        k71.k.g(xVar, "type");
        m mVar2 = new m("fullDatabaseId", xVar, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        e3.Companion.getClass();
        m mVar4 = new m("status", l0.b(e3.s), (String) null, rVar, rVar, rVar);
        y2.Companion.getClass();
        a0 a0Var = y2.s;
        k71.k.g(a0Var, "type");
        m mVar5 = new m("conclusion", a0Var, (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        m mVar6 = new m("duration", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("title", xVar2, (String) null, rVar, rVar, rVar);
        m mVar8 = new m("summary", xVar2, (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        x xVar3 = o7.a;
        k71.k.g(xVar3, "type");
        m mVar9 = new m("startedAt", xVar3, (String) null, rVar, rVar, rVar);
        m mVar10 = new m("completedAt", xVar3, (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        m mVar11 = new m("permalink", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        r b2 = l0.b(pd.a);
        List t = no.a.t("checkRequired", false);
        a3.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, new m("isRequired", b2, (String) null, t, no.a.s(a3.a, new u0(new t("pullRequestId"))), rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
