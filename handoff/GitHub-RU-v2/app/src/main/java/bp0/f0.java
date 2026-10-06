package bp0;

import java.util.List;
import pz0.pd;
import pz0.td;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f0 {
    public static final List a;

    static {
        td.Companion.getClass();
        aa.r b = l0.b(td.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.x xVar = pd.a;
        aa.m mVar2 = new aa.m("viewerCanBlock", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("viewerCanUnblock", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("viewerIsFollowing", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("isFollowingViewer", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, mVar4, mVar5, new aa.m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
    }
}
