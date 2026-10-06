package vf0;

import aa.m;
import aa.r;
import aa.x;
import gn0.eq;
import gn0.hr;
import gn0.lb;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        pb.Companion.getClass();
        x xVar = pb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar2 = tb.a;
        List r = l.r(new m[]{mVar, new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hr.Companion.getClass();
        m mVar4 = new m("owner", l0.b(hr.a), (String) null, rVar, rVar, r);
        lb.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, mVar4, new m("isOrganizationDiscussionRepository", l0.b(lb.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        m mVar6 = new m("number", l0.b(rb.a), (String) null, rVar, rVar, rVar);
        eq.Companion.getClass();
        a = l.r(new m[]{mVar5, mVar6, new m("repository", l0.b(eq.m0), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
