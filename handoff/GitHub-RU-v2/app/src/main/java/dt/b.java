package dt;

import aa.m;
import aa.r;
import java.util.List;
import m10.ah;
import m10.ch;
import m10.ci;
import m10.eh;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        ch.Companion.getClass();
        r b = l0.b(ch.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        ah.Companion.getClass();
        m mVar = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        ci.Companion.getClass();
        m mVar2 = new m("comments", l0.b(ci.a), (String) null, rVar, rVar, n);
        eh.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(eh.a), (String) null, rVar, rVar, rVar)});
    }
}
