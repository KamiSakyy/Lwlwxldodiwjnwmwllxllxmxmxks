package hv;

import aa.a0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.jz;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.r b = l0.b(ah.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        jz.Companion.getClass();
        a0 a0Var = jz.s;
        k71.k.g(a0Var, "type");
        aa.m mVar2 = new aa.m("reviewDecision", a0Var, (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        x xVar = ch.a;
        k71.k.g(xVar, "type");
        aa.m mVar3 = new aa.m("totalCommentsCount", xVar, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("__typename", l0.b(eh.a), (String) null, rVar, rVar, rVar)});
    }
}
