package h10;

import java.util.List;
import m10.ah;
import m10.eh;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.p a2 = v8.l0.a(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("mobileCapabilities", a2, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
