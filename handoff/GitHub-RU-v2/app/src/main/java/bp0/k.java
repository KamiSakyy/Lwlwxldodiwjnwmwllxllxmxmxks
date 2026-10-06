package bp0;

import java.util.List;
import pz0.pd;
import pz0.td;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k {
    public static final List a;

    static {
        td.Companion.getClass();
        aa.r b = l0.b(td.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.m mVar2 = new aa.m("viewerIsFollowing", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
    }
}
