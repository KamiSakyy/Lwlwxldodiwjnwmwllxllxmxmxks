package h10;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.i30;
import m10.j10;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k3 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Commit");
        List list = fr.b.a;
        aa.s c = no.a.c(list, "selections", "Commit", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ch.Companion.getClass();
        aa.x xVar3 = ch.a;
        aa.m mVar2 = new aa.m("totalCount", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m10.y5.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("nodes", v8.l0.a(m10.y5.j), (String) null, rVar, rVar, r)});
        aa.m mVar3 = new aa.m("aheadBy", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("behindBy", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m10.k6.Companion.getClass();
        aa.r b2 = v8.l0.b(m10.k6.a);
        m10.i6.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, new aa.m("commits", b2, (String) null, rVar, no.a.s(m10.i6.b, new aa.u0(50)), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar5 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var = m10.i6.d;
        k71.k.g(q0Var, "type");
        j10.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar5, new aa.m("compare", q0Var, (String) null, rVar, no.a.s(j10.d, new aa.u0(new aa.t("headRef"))), r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar6 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var2 = j10.e;
        k71.k.g(q0Var2, "type");
        i30.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar6, new aa.m("ref", q0Var2, (String) null, rVar, no.a.s(i30.T, new aa.u0(new aa.t("baseRef"))), r4), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = i30.w0;
        k71.k.g(q0Var3, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("name"))), new aa.k(p00.m, new aa.u0(new aa.t("owner")))}), r5), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
