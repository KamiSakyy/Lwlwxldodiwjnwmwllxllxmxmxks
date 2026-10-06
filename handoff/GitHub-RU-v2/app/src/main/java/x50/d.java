package x50;

import aa.a0;
import aa.m;
import aa.r;
import aa.x;
import hc0.ap;
import hc0.bb;
import hc0.db;
import hc0.dq;
import hc0.ew;
import hc0.fb;
import hc0.jc;
import hc0.lc;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        bb.Companion.getClass();
        x xVar = bb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar2 = fb.a;
        List r = l.r(new m[]{mVar, new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        dq.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, new m("owner", l0.b(dq.a), (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        jc.Companion.getClass();
        m mVar5 = new m("state", l0.b(jc.s), "issueState", rVar, rVar, rVar);
        m mVar6 = new m("title", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        m mVar7 = new m("url", l0.b(ew.a), (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        m mVar8 = new m("number", l0.b(db.a), (String) null, rVar, rVar, rVar);
        ap.Companion.getClass();
        m mVar9 = new m("repository", l0.b(ap.k0), (String) null, rVar, rVar, r2);
        lc.Companion.getClass();
        a0 a0Var = lc.s;
        k.g(a0Var, "type");
        a = l.r(new m[]{mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, new m("stateReason", a0Var, (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
