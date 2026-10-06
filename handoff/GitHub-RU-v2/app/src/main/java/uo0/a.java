package uo0;

import aa.m;
import aa.p;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.ob;
import pz0.pd;
import pz0.td;
import pz0.w80;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("name", b, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("enabled", l0.b(pd.a), (String) null, rVar, rVar, rVar)});
        ob.Companion.getClass();
        p a2 = l0.a(l0.b(ob.a));
        w80.Companion.getClass();
        m mVar2 = new m("featureFlags", a2, (String) null, rVar, no.a.s(w80.h, new u0(new t("flags"))), r);
        td.Companion.getClass();
        x xVar2 = td.a;
        a = l.r(new m[]{new m("viewer", l0.b(w80.W), (String) null, rVar, rVar, l.r(new m[]{mVar2, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
