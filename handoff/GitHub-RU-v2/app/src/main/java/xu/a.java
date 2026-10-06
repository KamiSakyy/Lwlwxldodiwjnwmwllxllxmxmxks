package xu;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.eh;
import m10.wg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        wg.Companion.getClass();
        r b = l0.b(wg.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("hasPreviousPage", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar = eh.a;
        k.g(xVar, "type");
        a = l.r(new m[]{mVar, new m("startCursor", xVar, (String) null, rVar, rVar, rVar)});
    }
}
