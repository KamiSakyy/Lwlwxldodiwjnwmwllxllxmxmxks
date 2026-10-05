package h50;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import hc0.bb;
import hc0.ew;
import hc0.fb;
import hc0.hb;
import hc0.k9;
import hc0.xa;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ew.Companion.getClass();
        r b = l0.b(ew.a);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("url", b, (String) null, rVar, rVar, rVar));
        bb.Companion.getClass();
        m mVar = new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar = fb.a;
        m mVar2 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        hb.Companion.getClass();
        m mVar3 = new m("emojiHTML", l0.b(hb.a), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        x xVar2 = xa.a;
        m mVar4 = new m("isAnswerable", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("isPollable", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        k9.Companion.getClass();
        q0 q0Var = k9.a;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, new m("template", q0Var, (String) null, rVar, rVar, n), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
