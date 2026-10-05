package bp0;

import java.util.List;
import pz0.pd;
import pz0.td;
import pz0.vc;
import pz0.vd;
import pz0.xc;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        vd.Companion.getClass();
        aa.x xVar = vd.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        List n2 = sy.d0.n(new aa.m("totalCount", l0.b(xVar), (String) null, rVar, rVar, rVar));
        td.Companion.getClass();
        aa.m mVar = new aa.m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.x xVar2 = pd.a;
        aa.m mVar2 = new aa.m("viewerIsFollowing", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("isFollowingViewer", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        vc.Companion.getClass();
        aa.m mVar4 = new aa.m("followers", l0.b(vc.a), (String) null, rVar, rVar, n);
        xc.Companion.getClass();
        aa.m mVar5 = new aa.m("following", l0.b(xc.a), (String) null, rVar, rVar, n2);
        aa.m mVar6 = new aa.m("viewerCanBlock", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("viewerCanUnblock", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, new aa.m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
    }
}
