package pj0;

import aa.r;
import aa.s;
import aa.x;
import gn0.hr;
import gn0.mx;
import gn0.pb;
import gn0.tb;
import java.util.List;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        s mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar3 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.b.a;
        List r2 = x61.l.r(new s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Actor", r, list)});
        aa.m mVar4 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        aa.m mVar6 = new aa.m("url", l0.b(mx.a), (String) null, rVar, rVar, rVar);
        hr.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar4, mVar5, mVar6, new aa.m("owner", l0.b(hr.a), (String) null, rVar, rVar, r2), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
