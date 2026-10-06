package fc0;

import hc0.bb;
import hc0.fb;
import hc0.kz;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class z5 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.a.a;
        aa.s c = no.a.c(list, "selections", "Actor", r, list);
        aa.s mVar2 = new aa.m("name", xVar, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        List r2 = x61.l.r(new aa.s[]{mVar, c, mVar2, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        kz.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("viewer", v8.l0.b(kz.O), (String) null, rVar, rVar, r2));
    }
}
