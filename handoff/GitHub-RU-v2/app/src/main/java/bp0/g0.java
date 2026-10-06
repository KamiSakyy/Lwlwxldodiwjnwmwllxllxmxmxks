package bp0;

import java.util.List;
import pz0.h50;
import pz0.td;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g0 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.s mVar2 = new aa.m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.s mVar4 = new aa.m("url", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.b.a;
        a = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, mVar4, no.a.c(list, "selections", "Actor", r, list)});
    }
}
