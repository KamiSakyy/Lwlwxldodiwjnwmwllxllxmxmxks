package nw0;

import aa.m;
import aa.x;
import java.util.List;
import k71.k;
import pz0.pd;
import pz0.xd;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        k.g(xVar, "type");
        r rVar = r.r;
        m mVar = new m("endCursor", xVar, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar2 = pd.a;
        a = l.r(new m[]{mVar, new m("hasNextPage", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("startCursor", xVar, (String) null, rVar, rVar, rVar)});
    }
}
