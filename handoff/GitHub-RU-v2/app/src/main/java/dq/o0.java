package dq;

import java.util.List;
import m10.ah;
import m10.cg;
import m10.ch;
import m10.eh;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o0 {
    public static final List a;

    static {
        ch.Companion.getClass();
        aa.r b = v8.l0.b(ch.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        ah.Companion.getClass();
        aa.m mVar = new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.m mVar2 = new aa.m("viewerIsFollowing", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar);
        cg.Companion.getClass();
        aa.m mVar3 = new aa.m("followers", v8.l0.b(cg.a), (String) null, rVar, rVar, n);
        eh.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("__typename", v8.l0.b(eh.a), (String) null, rVar, rVar, rVar)});
    }
}
