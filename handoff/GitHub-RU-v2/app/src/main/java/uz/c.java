package uz;

import aa.m;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.at;
import m10.eh;
import m10.nt;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2FieldConfigurationConnection");
        List list = b.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2FieldConfigurationConnection", n, list)});
        nt.Companion.getClass();
        r b2 = l0.b(nt.a);
        at.Companion.getClass();
        m mVar2 = new m("fields", b2, (String) null, rVar, no.a.s(at.a, new u0(50)), r);
        ah.Companion.getClass();
        a = l.r(new m[]{mVar2, new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
