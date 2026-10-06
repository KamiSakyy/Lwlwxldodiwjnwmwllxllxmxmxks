package gu;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.gn;
import m10.sa;
import m10.yg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        m mVar2 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        gn.Companion.getClass();
        m mVar4 = new m("state", l0.b(gn.s), (String) null, rVar, rVar, rVar);
        yg.Companion.getClass();
        m mVar5 = new m("progressPercentage", l0.b(yg.a), (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        x xVar2 = sa.a;
        k.g(xVar2, "type");
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, new m("dueOn", xVar2, (String) null, rVar, rVar, rVar)});
    }
}
