package h10;

import java.util.List;
import m10.ah;
import m10.eb0;
import m10.eh;
import m10.gb0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h1 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("link", b, (String) null, rVar, rVar, rVar);
        gb0.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("linkType", v8.l0.b(gb0.s), (String) null, rVar, rVar, rVar)});
        eb0.Companion.getClass();
        aa.q0 q0Var = eb0.a;
        k71.k.g(q0Var, "type");
        aa.m mVar2 = new aa.m("enterpriseSupportContact", q0Var, (String) null, rVar, rVar, r);
        ah.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
