package h20;

import aa.m;
import aa.r;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.fb;
import hc0.h6;
import hc0.m00;
import hc0.q00;
import hc0.s00;
import hc0.w00;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h {
    public static final List a;

    static {
        h6.Companion.getClass();
        r b = l0.b(h6.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("createdAt", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar = bb.a;
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar2 = fb.a;
        List r = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        db.Companion.getClass();
        m mVar3 = new m("totalCount", l0.b(db.a), (String) null, rVar, rVar, rVar);
        q00.Companion.getClass();
        List r2 = l.r(new m[]{mVar3, new m("nodes", l0.a(q00.b), (String) null, rVar, rVar, r)});
        m mVar4 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        w00.Companion.getClass();
        m mVar6 = new m("state", l0.b(w00.s), (String) null, rVar, rVar, rVar);
        s00.Companion.getClass();
        r b2 = l0.b(s00.a);
        m00.Companion.getClass();
        a = l.r(new m[]{mVar4, mVar5, mVar6, new m("runs", b2, (String) null, rVar, no.a.s(m00.b, new u0(1)), r2), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
