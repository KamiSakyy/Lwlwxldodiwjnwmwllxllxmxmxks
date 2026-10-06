package xx0;

import aa.m;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.io;
import pz0.td;
import pz0.xd;
import pz0.xn;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2FieldConfigurationConnection");
        List list = b.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2FieldConfigurationConnection", n, list)});
        io.Companion.getClass();
        r b2 = l0.b(io.a);
        xn.Companion.getClass();
        m mVar2 = new m("fields", b2, (String) null, rVar, no.a.s(xn.a, new u0(50)), r);
        td.Companion.getClass();
        a = l.r(new m[]{mVar2, new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
