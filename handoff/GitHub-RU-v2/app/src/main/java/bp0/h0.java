package bp0;

import java.util.List;
import pz0.pd;
import pz0.td;
import pz0.vc;
import pz0.vd;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h0 {
    public static final List a;

    static {
        vd.Companion.getClass();
        aa.r b = l0.b(vd.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        td.Companion.getClass();
        aa.m mVar = new aa.m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.m mVar2 = new aa.m("viewerIsFollowing", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        vc.Companion.getClass();
        aa.m mVar3 = new aa.m("followers", l0.b(vc.a), (String) null, rVar, rVar, n);
        xd.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
    }
}
