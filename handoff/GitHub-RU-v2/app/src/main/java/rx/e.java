package rx;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        s mVar2 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.b.a;
        a = l.r(new s[]{mVar, mVar2, no.a.c(list, "selections", "Actor", r, list), new m("name", xVar, (String) null, rVar, rVar, rVar), new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
