package x50;

import aa.m;
import aa.r;
import hc0.bb;
import hc0.db;
import hc0.fb;
import hc0.zb;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        db.Companion.getClass();
        r b = l0.b(db.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        bb.Companion.getClass();
        m mVar = new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        zb.Companion.getClass();
        m mVar2 = new m("comments", l0.b(zb.a), (String) null, rVar, rVar, n);
        fb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
    }
}
