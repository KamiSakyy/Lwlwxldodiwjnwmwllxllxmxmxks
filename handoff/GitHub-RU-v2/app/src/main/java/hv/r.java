package hv;

import aa.q0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.x50;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        x50.Companion.getClass();
        q0 q0Var = x50.a;
        k71.k.g(q0Var, "type");
        a = x61.l.r(new aa.m[]{mVar2, new aa.m("viewerLatestReviewRequest", q0Var, (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
