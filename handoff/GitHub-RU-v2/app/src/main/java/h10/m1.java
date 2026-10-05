package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.rf0;
import m10.ue;
import m10.ye;
import m10.zf0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class m1 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("FeedFilter");
        List list = ts.a.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "FeedFilter", n, list)});
        ye.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("filters", v8.l0.a(v8.l0.b(ye.a)), (String) null, rVar, rVar, r));
        ue.Companion.getClass();
        aa.m mVar2 = new aa.m("feed", v8.l0.b(ue.d), (String) null, rVar, rVar, n2);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        zf0.Companion.getClass();
        aa.q0 q0Var = zf0.c;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, new aa.m("dashboard", q0Var, (String) null, rVar, rVar, r2)});
        rf0.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(rf0.g0), (String) null, rVar, rVar, r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
