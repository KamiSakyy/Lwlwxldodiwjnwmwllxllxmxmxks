package jy0;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import pz0.o7;
import pz0.td;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        m mVar2 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        x xVar2 = o7.a;
        a = l.r(new m[]{mVar, mVar2, mVar3, new m("updatedAt", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("createdAt", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
