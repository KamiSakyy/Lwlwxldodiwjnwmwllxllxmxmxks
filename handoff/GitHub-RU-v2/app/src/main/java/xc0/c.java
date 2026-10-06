package xc0;

import aa.m;
import aa.r;
import aa.x;
import gn0.c20;
import gn0.mx;
import gn0.pb;
import gn0.r6;
import gn0.rb;
import gn0.tb;
import gn0.u10;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        r6.Companion.getClass();
        x xVar = r6.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("createdAt", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar3 = tb.a;
        List r = l.r(new m[]{mVar, mVar2, new m("name", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        x xVar4 = rb.a;
        k.g(xVar4, "type");
        m mVar4 = new m("billableDurationInSeconds", xVar4, (String) null, rVar, rVar, rVar);
        m mVar5 = new m("runNumber", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("createdAt", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("updatedAt", l0.b(xVar), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        x xVar5 = mx.a;
        m mVar8 = new m("resourcePath", l0.b(xVar5), (String) null, rVar, rVar, rVar);
        c20.Companion.getClass();
        m mVar9 = new m("eventType", l0.b(c20.s), (String) null, rVar, rVar, rVar);
        m mVar10 = new m("url", l0.b(xVar5), (String) null, rVar, rVar, rVar);
        u10.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, new m("workflow", l0.b(u10.c), (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
