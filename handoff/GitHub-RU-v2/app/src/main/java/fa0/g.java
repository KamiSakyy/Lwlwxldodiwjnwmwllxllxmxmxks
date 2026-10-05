package fa0;

import aa.m;
import aa.r;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.e00;
import hc0.fb;
import hc0.xa;
import java.util.List;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g {
    public static final List a;

    static {
        db.Companion.getClass();
        r b = l0.b(db.a);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        bb.Companion.getClass();
        m mVar = new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar = fb.a;
        m mVar2 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        m mVar3 = new m("isPrivate", l0.b(xa.a), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        e00.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("items", l0.b(e00.a), (String) null, rVar, rVar, n), new m("slug", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
