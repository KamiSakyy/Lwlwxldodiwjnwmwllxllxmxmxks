package dq;

import java.util.List;
import m10.ah;
import m10.cg;
import m10.ch;
import m10.eg;
import m10.eh;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ch.Companion.getClass();
        aa.x xVar = ch.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        List n2 = sy.d0.n(new aa.m("totalCount", v8.l0.b(xVar), (String) null, rVar, rVar, rVar));
        ah.Companion.getClass();
        aa.m mVar = new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.x xVar2 = wg.a;
        aa.m mVar2 = new aa.m("viewerIsFollowing", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("isFollowingViewer", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        cg.Companion.getClass();
        aa.m mVar4 = new aa.m("followers", v8.l0.b(cg.a), (String) null, rVar, rVar, n);
        eg.Companion.getClass();
        aa.m mVar5 = new aa.m("following", v8.l0.b(eg.a), (String) null, rVar, rVar, n2);
        aa.m mVar6 = new aa.m("viewerCanBlock", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("viewerCanUnblock", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, new aa.m("__typename", v8.l0.b(eh.a), (String) null, rVar, rVar, rVar)});
    }
}
