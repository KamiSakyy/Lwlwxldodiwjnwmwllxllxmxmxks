package a80;

import aa.x;
import hc0.ap;
import hc0.bb;
import hc0.db;
import hc0.dq;
import hc0.fb;
import java.util.List;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j {
    public static final List a;

    static {
        bb.Companion.getClass();
        x xVar = bb.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar2 = fb.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        dq.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, new aa.m("owner", l0.b(dq.a), (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        aa.m mVar5 = new aa.m("number", l0.b(db.a), (String) null, rVar, rVar, rVar);
        ap.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("repository", l0.b(ap.k0), (String) null, rVar, rVar, r2), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
