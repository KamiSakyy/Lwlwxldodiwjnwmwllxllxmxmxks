package a80;

import aa.q0;
import aa.x;
import hc0.bb;
import hc0.ew;
import hc0.fb;
import hc0.kz;
import hc0.lr;
import hc0.xa;
import java.util.List;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class q {
    public static final List a;

    static {
        xa.Companion.getClass();
        aa.r b = l0.b(xa.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("isViewer", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar = fb.a;
        aa.m mVar2 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        aa.m mVar3 = new aa.m("avatarUrl", l0.b(ew.a), (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        kz.Companion.getClass();
        q0 q0Var = kz.O;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{mVar4, new aa.m("requestedBy", q0Var, (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar5 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        lr.Companion.getClass();
        q0 q0Var2 = lr.a;
        k71.k.g(q0Var2, "type");
        a = x61.l.r(new aa.m[]{mVar5, new aa.m("viewerLatestReviewRequest", q0Var2, (String) null, rVar, rVar, r2), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
