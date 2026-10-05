package ns;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.fd;
import m10.wg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = l.r(new m[]{mVar, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        m mVar3 = new m("isAnswer", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        fd.Companion.getClass();
        q0 q0Var = fd.l;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar2, mVar3, new m("discussion", q0Var, (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
