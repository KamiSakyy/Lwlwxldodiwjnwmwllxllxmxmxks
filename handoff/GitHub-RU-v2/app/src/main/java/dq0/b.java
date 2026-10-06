package dq0;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import pz0.ld;
import pz0.td;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        td.Companion.getClass();
        r b = l0.b(td.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar = xd.a;
        m mVar2 = new m("abbreviatedOid", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ld.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("oid", l0.b(ld.a), (String) null, rVar, rVar, rVar), new m("messageHeadline", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("messageBody", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
