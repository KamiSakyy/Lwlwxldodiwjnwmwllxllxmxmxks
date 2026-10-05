package nj0;

import aa.j0;
import aa.m;
import aa.r;
import aa.x;
import gn0.eq;
import gn0.fb;
import gn0.hb;
import gn0.pb;
import gn0.tb;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        pb.Companion.getClass();
        x xVar = pb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        hb.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("oid", l0.b(hb.a), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar2 = tb.a;
        List r2 = l.r(new m[]{mVar2, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        j0 j0Var = fb.a;
        k.g(j0Var, "type");
        m mVar5 = new m("target", j0Var, (String) null, rVar, rVar, r);
        eq.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, new m("repository", l0.b(eq.m0), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
