package xx0;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import pz0.m7;
import pz0.vd;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("titleHTML", l0.b(xVar), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        m mVar4 = new m("duration", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        m7.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("startDate", l0.b(m7.a), (String) null, rVar, rVar, rVar)});
    }
}
