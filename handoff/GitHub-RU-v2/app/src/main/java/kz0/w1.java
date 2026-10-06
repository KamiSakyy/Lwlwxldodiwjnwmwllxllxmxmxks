package kz0;

import java.util.List;
import pz0.pd;
import pz0.td;
import pz0.w80;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class w1 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        aa.s mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("login", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.s mVar4 = new aa.m("isEmployee", v8.l0.b(pd.a), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.b.a;
        aa.s c = no.a.c(list, "selections", "Actor", r, list);
        List n = sy.d0Shadow.n("User");
        List list2 = gw0.c.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, mVar4, c, no.a.c(list2, "selections", "User", n, list2)});
        w80.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(w80.W), (String) null, rVar, rVar, r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
