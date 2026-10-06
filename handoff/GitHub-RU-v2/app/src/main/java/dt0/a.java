package dt0;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import pz0.lk;
import pz0.q7;
import pz0.td;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        q7.Companion.getClass();
        r b = l0.b(q7.s);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("day", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        m mVar2 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        lk.Companion.getClass();
        x xVar = lk.a;
        m mVar3 = new m("startTime", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("endTime", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
    }
}
