package th0;

import aa.m;
import aa.r;
import aa.x;
import gn0.pb;
import gn0.ph;
import gn0.t6;
import gn0.tb;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        t6.Companion.getClass();
        r b = l0.b(t6.s);
        x61.r rVar = x61.r.r;
        m mVar = new m("day", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        m mVar2 = new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar);
        ph.Companion.getClass();
        x xVar = ph.a;
        m mVar3 = new m("startTime", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("endTime", l0.b(xVar), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar)});
    }
}
