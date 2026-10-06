package kz0;

import java.util.List;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class u {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.p a2 = v8.l0.a(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("mobileCapabilities", a2, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
