package wn0;

import aa.m;
import aa.r;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.ha0;
import pz0.ja0;
import pz0.na0;
import pz0.o7;
import pz0.td;
import pz0.vd;
import pz0.xd;
import pz0.y90;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h {
    public static final List a;

    static {
        o7.Companion.getClass();
        r b = l0.b(o7.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("createdAt", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar = td.a;
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List r = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        vd.Companion.getClass();
        m mVar3 = new m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        ha0.Companion.getClass();
        List r2 = l.r(new m[]{mVar3, new m("nodes", l0.a(ha0.b), (String) null, rVar, rVar, r)});
        m mVar4 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        na0.Companion.getClass();
        m mVar6 = new m("state", l0.b(na0.s), (String) null, rVar, rVar, rVar);
        ja0.Companion.getClass();
        r b2 = l0.b(ja0.a);
        y90.Companion.getClass();
        a = l.r(new m[]{mVar4, mVar5, mVar6, new m("runs", b2, (String) null, rVar, no.a.s(y90.d, new u0(1)), r2), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
