package wn0;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import pz0.h50;
import pz0.la0;
import pz0.o7;
import pz0.td;
import pz0.vd;
import pz0.xd;
import pz0.y90;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        o7.Companion.getClass();
        x xVar = o7.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("createdAt", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar3 = xd.a;
        List r = l.r(new m[]{mVar, mVar2, new m("name", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        x xVar4 = vd.a;
        k71.k.g(xVar4, "type");
        m mVar4 = new m("billableDurationInSeconds", xVar4, (String) null, rVar, rVar, rVar);
        m mVar5 = new m("runNumber", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("createdAt", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("updatedAt", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        x xVar5 = h50.a;
        m mVar8 = new m("resourcePath", l0.b(xVar5), (String) null, rVar, rVar, rVar);
        la0.Companion.getClass();
        m mVar9 = new m("eventType", l0.b(la0.s), (String) null, rVar, rVar, rVar);
        m mVar10 = new m("url", l0.b(xVar5), (String) null, rVar, rVar, rVar);
        y90.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, new m("workflow", l0.b(y90.e), (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
