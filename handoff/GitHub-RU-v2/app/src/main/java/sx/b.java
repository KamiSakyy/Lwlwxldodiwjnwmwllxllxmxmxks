package sx;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.f90;
import m10.rf0;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        ch.Companion.getClass();
        r b = l0.b(ch.a);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        ah.Companion.getClass();
        x xVar = ah.a;
        m mVar = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        f90.Companion.getClass();
        m mVar2 = new m("starredRepositories", l0.b(f90.a), (String) null, rVar, rVar, n);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        a = l.r(new m[]{new m("viewer", l0.b(rf0.g0), (String) null, rVar, rVar, r), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
