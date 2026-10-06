package g00;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.sa;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        m mVar2 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        x xVar2 = sa.a;
        a = l.r(new m[]{mVar, mVar2, mVar3, new m("updatedAt", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("createdAt", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
