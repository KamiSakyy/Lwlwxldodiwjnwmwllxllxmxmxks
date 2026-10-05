package gw0;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import pz0.pd;
import pz0.q90;
import pz0.td;
import pz0.vd;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g {
    public static final List a;

    static {
        vd.Companion.getClass();
        r b = l0.b(vd.a);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        td.Companion.getClass();
        m mVar = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar = xd.a;
        m mVar2 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        m mVar3 = new m("isPrivate", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        q90.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("items", l0.b(q90.a), (String) null, rVar, rVar, n), new m("slug", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
