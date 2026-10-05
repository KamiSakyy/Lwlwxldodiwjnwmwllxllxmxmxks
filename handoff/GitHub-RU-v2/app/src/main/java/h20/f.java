package h20;

import aa.a0;
import aa.m;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.ew;
import hc0.fb;
import hc0.h6;
import hc0.j2;
import hc0.l2;
import hc0.p2;
import hc0.v1;
import hc0.xa;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        bb.Companion.getClass();
        r b = l0.b(bb.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        v1.Companion.getClass();
        x xVar = v1.a;
        k.g(xVar, "type");
        m mVar2 = new m("fullDatabaseId", xVar, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar2 = fb.a;
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        p2.Companion.getClass();
        m mVar4 = new m("status", l0.b(p2.s), (String) null, rVar, rVar, rVar);
        j2.Companion.getClass();
        a0 a0Var = j2.s;
        k.g(a0Var, "type");
        m mVar5 = new m("conclusion", a0Var, (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        m mVar6 = new m("duration", l0.b(db.a), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("title", xVar2, (String) null, rVar, rVar, rVar);
        m mVar8 = new m("summary", xVar2, (String) null, rVar, rVar, rVar);
        h6.Companion.getClass();
        x xVar3 = h6.a;
        k.g(xVar3, "type");
        m mVar9 = new m("startedAt", xVar3, (String) null, rVar, rVar, rVar);
        m mVar10 = new m("completedAt", xVar3, (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        m mVar11 = new m("permalink", l0.b(ew.a), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        r b2 = l0.b(xa.a);
        List t = no.a.t("checkRequired", false);
        l2.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, new m("isRequired", b2, (String) null, t, no.a.s(l2.a, new u0(new t("pullRequestId"))), rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
