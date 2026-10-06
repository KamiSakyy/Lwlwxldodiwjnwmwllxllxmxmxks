package ew;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.wg;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = l0.b(eh.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.m mVar2 = new aa.m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        aa.m mVar3 = new aa.m("stargazerCount", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("viewerHasStarred", l0.b(wg.a), (String) null, rVar, rVar, rVar)});
    }
}
