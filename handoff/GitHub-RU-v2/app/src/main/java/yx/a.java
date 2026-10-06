package yx;

import aa.m;
import aa.x;
import java.util.List;
import k71.k;
import m10.eh;
import m10.wg;
import v8.l0;
import x61.l;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        k.g(xVar, "type");
        rShadow rVar = rShadow.r;
        m mVar = new m("endCursor", xVar, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar2 = wg.a;
        a = l.r(new m[]{mVar, new m("hasNextPage", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("startCursor", xVar, (String) null, rVar, rVar, rVar)});
    }
}
