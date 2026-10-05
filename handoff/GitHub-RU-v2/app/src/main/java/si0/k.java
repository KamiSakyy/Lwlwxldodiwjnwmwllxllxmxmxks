package si0;

import aa.a0;
import aa.x;
import gn0.pb;
import gn0.pm;
import gn0.rb;
import gn0.tb;
import java.util.List;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k {
    public static final List a;

    static {
        pb.Companion.getClass();
        aa.r b = l0.b(pb.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        pm.Companion.getClass();
        a0 a0Var = pm.s;
        k71.k.g(a0Var, "type");
        aa.m mVar2 = new aa.m("reviewDecision", a0Var, (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        x xVar = rb.a;
        k71.k.g(xVar, "type");
        aa.m mVar3 = new aa.m("totalCommentsCount", xVar, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar)});
    }
}
