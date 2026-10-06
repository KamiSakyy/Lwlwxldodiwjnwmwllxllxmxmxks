package o70;

import aa.m;
import aa.r;
import aa.x;
import hc0.fb;
import hc0.xa;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        xa.Companion.getClass();
        r b = l0.b(xa.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("hasPreviousPage", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar = fb.a;
        k.g(xVar, "type");
        a = l.r(new m[]{mVar, new m("startCursor", xVar, (String) null, rVar, rVar, rVar)});
    }
}
