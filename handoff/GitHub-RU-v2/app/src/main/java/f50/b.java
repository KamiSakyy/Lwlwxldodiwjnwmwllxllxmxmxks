package f50;

import aa.a0;
import aa.m;
import aa.r;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.h6;
import hc0.i9;
import hc0.xa;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        bb.Companion.getClass();
        r b = l0.b(bb.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        x xVar = xa.a;
        m mVar2 = new m("closed", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("viewerCanClose", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("viewerCanReopen", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h6.Companion.getClass();
        x xVar2 = h6.a;
        k.g(xVar2, "type");
        m mVar5 = new m("closedAt", xVar2, (String) null, rVar, rVar, rVar);
        i9.Companion.getClass();
        a0 a0Var = i9.s;
        k.g(a0Var, "type");
        m mVar6 = new m("stateReason", a0Var, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, new m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
    }
}
