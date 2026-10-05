package en0;

import gn0.pb;
import gn0.pd;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s1 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("name", b, (String) null, rVar, rVar, rVar);
        aa.m mVar2 = new aa.m("color", xVar, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        pd.Companion.getClass();
        aa.r b2 = v8.l0.b(v8.l0.a(pd.a));
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("programmingLanguages", b2, (String) null, rVar, no.a.s(rn.k, new aa.u0(Boolean.TRUE)), r));
    }
}
