package ng0;

import aa.a0;
import aa.m;
import aa.r;
import aa.x;
import gn0.eq;
import gn0.hr;
import gn0.mx;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import gn0.xc;
import gn0.zc;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        pb.Companion.getClass();
        x xVar = pb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar2 = tb.a;
        List r = l.r(new m[]{mVar, new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hr.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, new m("owner", l0.b(hr.a), (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xc.Companion.getClass();
        m mVar5 = new m("state", l0.b(xc.s), "issueState", rVar, rVar, rVar);
        m mVar6 = new m("title", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        m mVar7 = new m("url", l0.b(mx.a), (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        m mVar8 = new m("number", l0.b(rb.a), (String) null, rVar, rVar, rVar);
        eq.Companion.getClass();
        m mVar9 = new m("repository", l0.b(eq.m0), (String) null, rVar, rVar, r2);
        zc.Companion.getClass();
        a0 a0Var = zc.s;
        k.g(a0Var, "type");
        a = l.r(new m[]{mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, new m("stateReason", a0Var, (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
