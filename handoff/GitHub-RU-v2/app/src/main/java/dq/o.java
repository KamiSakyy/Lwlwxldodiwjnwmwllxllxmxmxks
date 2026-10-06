package dq;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.rf0;
import m10.sa;
import m10.wg;
import m10.yf;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("User");
        List list = d0.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        List n2 = sy.d0Shadow.n("Organization");
        List list2 = c0.a;
        List r = x61.l.r(new aa.s[]{mVar, c, no.a.c(list2, "selections", "Organization", n2, list2)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = sy.d0Shadow.n("User");
        List list3 = n0.a;
        aa.s c2 = no.a.c(list3, "selections", "User", n3, list3);
        ah.Companion.getClass();
        List r2 = x61.l.r(new aa.s[]{mVar2, c2, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        aa.m mVar4 = new aa.m("createdAt", v8.l0.b(sa.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.m mVar5 = new aa.m("dismissable", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar);
        aa.m mVar6 = new aa.m("identifier", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        yf.Companion.getClass();
        aa.m mVar7 = new aa.m("followee", v8.l0.b(yf.a), (String) null, rVar, rVar, r);
        rf0.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar3, mVar4, mVar5, mVar6, mVar7, new aa.m("follower", v8.l0.b(rf0.g0), (String) null, rVar, rVar, r2)});
    }
}
