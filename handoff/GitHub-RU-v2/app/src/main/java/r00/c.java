package r00;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.p00;
import m10.wg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar2 = wg.a;
        m mVar2 = new m("isArchived", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("isEmpty", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar3 = eh.a;
        List r = l.r(new m[]{mVar, mVar2, mVar3, new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        i30.Companion.getClass();
        q0 q0Var = i30.w0;
        k.g(q0Var, "type");
        p00.Companion.getClass();
        a = l.r(new m[]{new m("repository", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(p00.l, new u0(new t("name"))), new aa.k(p00.m, new u0(new t("owner")))}), r), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
