package ht;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.mj;
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
        eh.Companion.getClass();
        x xVar = eh.a;
        m mVar2 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        m mVar4 = new m("isEnabled", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        mj.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("color", l0.b(mj.s), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
