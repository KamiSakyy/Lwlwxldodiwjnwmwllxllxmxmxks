package xe0;

import aa.m;
import aa.r;
import aa.x;
import gn0.hb;
import gn0.pb;
import gn0.tb;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        pb.Companion.getClass();
        r b = l0.b(pb.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar = tb.a;
        m mVar2 = new m("abbreviatedOid", l0.b(xVar), (String) null, rVar, rVar, rVar);
        hb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("oid", l0.b(hb.a), (String) null, rVar, rVar, rVar), new m("messageHeadline", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("messageBody", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
