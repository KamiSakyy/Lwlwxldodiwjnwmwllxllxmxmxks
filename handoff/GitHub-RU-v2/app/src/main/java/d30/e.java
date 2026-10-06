package d30;

import aa.m;
import aa.r;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.xa;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e {
    public static final List a;

    static {
        bb.Companion.getClass();
        r b = l0.b(bb.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        x xVar = xa.a;
        m mVar2 = new m("viewerCanBlock", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("viewerCanUnblock", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("viewerIsFollowing", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("isFollowingViewer", l0.b(xVar), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, new m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
    }
}
