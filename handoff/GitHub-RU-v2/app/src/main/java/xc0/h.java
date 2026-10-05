package xc0;

import aa.m;
import aa.r;
import aa.u0;
import aa.x;
import gn0.a20;
import gn0.e20;
import gn0.pb;
import gn0.r6;
import gn0.rb;
import gn0.tb;
import gn0.u10;
import gn0.y10;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h {
    public static final List a;

    static {
        r6.Companion.getClass();
        r b = l0.b(r6.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("createdAt", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar = pb.a;
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar2 = tb.a;
        List r = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        rb.Companion.getClass();
        m mVar3 = new m("totalCount", l0.b(rb.a), (String) null, rVar, rVar, rVar);
        y10.Companion.getClass();
        List r2 = l.r(new m[]{mVar3, new m("nodes", l0.a(y10.b), (String) null, rVar, rVar, r)});
        m mVar4 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        e20.Companion.getClass();
        m mVar6 = new m("state", l0.b(e20.s), (String) null, rVar, rVar, rVar);
        a20.Companion.getClass();
        r b2 = l0.b(a20.a);
        u10.Companion.getClass();
        a = l.r(new m[]{mVar4, mVar5, mVar6, new m("runs", b2, (String) null, rVar, no.a.s(u10.b, new u0(1)), r2), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
