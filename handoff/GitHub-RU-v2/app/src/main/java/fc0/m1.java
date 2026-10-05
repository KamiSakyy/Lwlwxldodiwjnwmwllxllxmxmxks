package fc0;

import hc0.bb;
import hc0.fb;
import hc0.kz;
import hc0.xa;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m1 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        aa.s mVar2 = new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("login", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        aa.s mVar4 = new aa.m("isEmployee", v8.l0.b(xa.a), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.b.a;
        aa.s c = no.a.c(list, "selections", "Actor", r, list);
        List n = sy.d0.n("User");
        List list2 = fa0.c.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, mVar4, c, no.a.c(list2, "selections", "User", n, list2)});
        kz.Companion.getClass();
        a = sy.d0.n(new aa.m("viewer", v8.l0.b(kz.O), (String) null, rVar, rVar, r2));
    }
}
