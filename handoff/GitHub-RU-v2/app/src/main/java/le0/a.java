package le0;

import aa.m;
import aa.r;
import aa.x;
import gn0.pb;
import gn0.r6;
import gn0.tb;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        m mVar2 = new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar);
        r6.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("createdAt", l0.b(r6.a), (String) null, rVar, rVar, rVar), new m("oldBase", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("newBase", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
