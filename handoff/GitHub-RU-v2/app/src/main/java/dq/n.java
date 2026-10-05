package dq;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.r b = v8.l0.b(ah.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.m mVar2 = new aa.m("viewerIsFollowing", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(eh.a), (String) null, rVar, rVar, rVar)});
    }
}
