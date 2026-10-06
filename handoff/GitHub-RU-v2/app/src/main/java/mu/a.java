package mu;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.mp;
import m10.ua;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ua.Companion.getClass();
        r b = l0.b(ua.s);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("day", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        m mVar2 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        mp.Companion.getClass();
        x xVar = mp.a;
        m mVar3 = new m("startTime", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("endTime", l0.b(xVar), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("__typename", l0.b(eh.a), (String) null, rVar, rVar, rVar)});
    }
}
