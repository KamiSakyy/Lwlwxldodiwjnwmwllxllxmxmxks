package si0;

import aa.x;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import java.util.List;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g {
    public static final List a;

    static {
        pb.Companion.getClass();
        aa.r b = l0.b(pb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        x xVar = rb.a;
        k71.k.g(xVar, "type");
        aa.m mVar2 = new aa.m("totalCommentsCount", xVar, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar)});
    }
}
