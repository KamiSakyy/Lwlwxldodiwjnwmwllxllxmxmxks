package si0;

import aa.q0;
import aa.x;
import gn0.lb;
import gn0.mx;
import gn0.pb;
import gn0.ps;
import gn0.s00;
import gn0.tb;
import java.util.List;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q {
    public static final List a;

    static {
        lb.Companion.getClass();
        aa.r b = l0.b(lb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("isViewer", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar = tb.a;
        aa.m mVar2 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        aa.m mVar3 = new aa.m("avatarUrl", l0.b(mx.a), (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s00.Companion.getClass();
        q0 q0Var = s00.P;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{mVar4, new aa.m("requestedBy", q0Var, (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar5 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ps.Companion.getClass();
        q0 q0Var2 = ps.a;
        k71.k.g(q0Var2, "type");
        a = x61.l.r(new aa.m[]{mVar5, new aa.m("viewerLatestReviewRequest", q0Var2, (String) null, rVar, rVar, r2), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
