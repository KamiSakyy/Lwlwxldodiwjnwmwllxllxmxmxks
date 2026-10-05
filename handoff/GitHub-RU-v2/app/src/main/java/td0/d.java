package td0;

import aa.m;
import aa.r;
import aa.x;
import gn0.mx;
import gn0.pb;
import gn0.tb;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        pb.Companion.getClass();
        r b = l0.b(pb.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar = tb.a;
        m mVar2 = new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("name", xVar, (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, new m("avatarUrl", l0.b(mx.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
