package p00;

import aa.m;
import aa.q0;
import aa.r;
import java.util.List;
import k71.k;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.oj;
import m10.wg;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ch.Companion.getClass();
        r b = l0.b(ch.a);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        ah.Companion.getClass();
        m mVar = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        m mVar2 = new m("isInOrganization", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        oj.Companion.getClass();
        q0 q0Var = oj.a;
        k.g(q0Var, "type");
        m mVar3 = new m("issueTypes", q0Var, (String) null, rVar, rVar, n);
        eh.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, new m("__typename", l0.b(eh.a), (String) null, rVar, rVar, rVar)});
    }

    public static Object a;
}
