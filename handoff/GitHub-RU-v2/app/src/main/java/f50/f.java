package f50;

import aa.m;
import aa.r;
import aa.x;
import hc0.ap;
import hc0.bb;
import hc0.db;
import hc0.dq;
import hc0.fb;
import hc0.xa;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        bb.Companion.getClass();
        x xVar = bb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar2 = fb.a;
        List r = l.r(new m[]{mVar, new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        dq.Companion.getClass();
        m mVar4 = new m("owner", l0.b(dq.a), (String) null, rVar, rVar, r);
        xa.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, mVar4, new m("isOrganizationDiscussionRepository", l0.b(xa.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        m mVar6 = new m("number", l0.b(db.a), (String) null, rVar, rVar, rVar);
        ap.Companion.getClass();
        a = l.r(new m[]{mVar5, mVar6, new m("repository", l0.b(ap.k0), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
