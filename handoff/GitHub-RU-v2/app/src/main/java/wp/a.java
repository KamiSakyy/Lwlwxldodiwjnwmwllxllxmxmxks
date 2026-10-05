package wp;

import aa.m;
import aa.p;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.rf0;
import m10.se;
import m10.wg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("name", b, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("enabled", l0.b(wg.a), (String) null, rVar, rVar, rVar)});
        se.Companion.getClass();
        p a2 = l0.a(l0.b(se.a));
        rf0.Companion.getClass();
        m mVar2 = new m("featureFlags", a2, (String) null, rVar, no.a.s(rf0.h, new u0(new t("flags"))), r);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        a = l.r(new m[]{new m("viewer", l0.b(rf0.g0), (String) null, rVar, rVar, l.r(new m[]{mVar2, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
