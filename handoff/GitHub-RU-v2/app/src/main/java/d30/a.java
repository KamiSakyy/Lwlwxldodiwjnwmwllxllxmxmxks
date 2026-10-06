package d30;

import aa.m;
import aa.r;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.fa;
import hc0.fb;
import hc0.ha;
import hc0.xa;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        db.Companion.getClass();
        x xVar = db.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        List n2 = d0Shadow.n(new m("totalCount", l0.b(xVar), (String) null, rVar, rVar, rVar));
        bb.Companion.getClass();
        m mVar = new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        x xVar2 = xa.a;
        m mVar2 = new m("viewerIsFollowing", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("isFollowingViewer", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        fa.Companion.getClass();
        m mVar4 = new m("followers", l0.b(fa.a), (String) null, rVar, rVar, n);
        ha.Companion.getClass();
        m mVar5 = new m("following", l0.b(ha.a), (String) null, rVar, rVar, n2);
        m mVar6 = new m("viewerCanBlock", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("viewerCanUnblock", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, new m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
    }
}
