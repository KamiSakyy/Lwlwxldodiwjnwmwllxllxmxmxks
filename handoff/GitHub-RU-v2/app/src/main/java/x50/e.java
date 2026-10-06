package x50;

import aa.a0;
import aa.m;
import aa.r;
import hc0.bb;
import hc0.fb;
import hc0.jc;
import hc0.lc;
import hc0.xa;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e {
    public static final List a;

    static {
        bb.Companion.getClass();
        r b = l0.b(bb.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        jc.Companion.getClass();
        m mVar2 = new m("state", l0.b(jc.s), (String) null, rVar, rVar, rVar);
        lc.Companion.getClass();
        a0 a0Var = lc.s;
        k.g(a0Var, "type");
        m mVar3 = new m("stateReason", a0Var, (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        m mVar4 = new m("viewerCanReopen", l0.b(xa.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
    }
}
