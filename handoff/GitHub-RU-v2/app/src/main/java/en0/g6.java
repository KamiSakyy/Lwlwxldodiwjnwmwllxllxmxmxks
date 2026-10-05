package en0;

import gn0.pb;
import gn0.s00;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g6 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.a.a;
        aa.s c = no.a.c(list, "selections", "Actor", r, list);
        aa.s mVar2 = new aa.m("name", xVar, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        List r2 = x61.l.r(new aa.s[]{mVar, c, mVar2, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        s00.Companion.getClass();
        a = sy.d0.n(new aa.m("viewer", v8.l0.b(s00.P), (String) null, rVar, rVar, r2));
    }
}
