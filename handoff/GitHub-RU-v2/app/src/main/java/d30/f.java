package d30;

import aa.m;
import aa.r;
import aa.u0;
import hc0.bb;
import hc0.db;
import hc0.fa;
import hc0.fb;
import hc0.kz;
import hc0.xa;
import java.util.List;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        db.Companion.getClass();
        r b = l0.b(db.a);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        bb.Companion.getClass();
        m mVar = new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        m mVar2 = new m("viewerIsFollowing", l0.b(xa.a), (String) null, rVar, rVar, rVar);
        fa.Companion.getClass();
        r b2 = l0.b(fa.a);
        kz.Companion.getClass();
        m mVar3 = new m("followers", b2, (String) null, rVar, no.a.s(kz.e, new u0(3)), n);
        fb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, new m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
    }
}
