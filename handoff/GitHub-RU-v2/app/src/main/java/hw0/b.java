package hw0;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import pz0.td;
import pz0.vd;
import pz0.w80;
import pz0.xd;
import pz0.z20;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        vd.Companion.getClass();
        r b = l0.b(vd.a);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        td.Companion.getClass();
        x xVar = td.a;
        m mVar = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        z20.Companion.getClass();
        m mVar2 = new m("starredRepositories", l0.b(z20.a), (String) null, rVar, rVar, n);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List r = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        w80.Companion.getClass();
        a = l.r(new m[]{new m("viewer", l0.b(w80.W), (String) null, rVar, rVar, r), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
