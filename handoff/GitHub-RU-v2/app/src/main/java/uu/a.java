package uu;

import aa.m;
import aa.r;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.wg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ah.Companion.getClass();
        r b = l0.b(ah.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        m mVar2 = new m("viewerIsFollowing", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(eh.a), (String) null, rVar, rVar, rVar)});
    }
}
