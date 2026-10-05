package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.ny;
import m10.p00;
import m10.py;
import m10.ry;
import m10.si;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p7 {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.x xVar = ah.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("id", b, (String) null, rVar, rVar, rVar));
        ry.Companion.getClass();
        aa.a0 a0Var = ry.s;
        aa.m mVar = new aa.m("allowableStatus", v8.l0.b(a0Var), (String) null, rVar, rVar, rVar);
        py.Companion.getClass();
        aa.m mVar2 = new aa.m("name", v8.l0.b(py.s), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("isDefault", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("allowableStatus", v8.l0.b(a0Var), (String) null, rVar, rVar, rVar);
        m10.f1.Companion.getClass();
        aa.m mVar4 = new aa.m("mergeMethods", no.a.d(m10.f1.a), (String) null, rVar, rVar, r);
        ny.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar3, mVar4, new aa.m("name", v8.l0.b(ny.s), (String) null, rVar, rVar, rVar)});
        aa.m mVar5 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        m10.d1.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar5, new aa.m("viewerMergeActions", no.a.d(m10.d1.a), (String) null, rVar, rVar, r2)});
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        List r4 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("Issue", sy.d0.n("Issue"), n), new aa.n("PullRequest", sy.d0.n("PullRequest"), r3)});
        aa.m mVar6 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        si.Companion.getClass();
        aa.x0 x0Var = si.a;
        k71.k.g(x0Var, "type");
        i30.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar6, new aa.m("issueOrPullRequest", x0Var, (String) null, rVar, no.a.s(i30.n, new aa.u0(new aa.t("number"))), r4), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = i30.w0;
        k71.k.g(q0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("repositoryName"))), new aa.k(p00.m, new aa.u0(new aa.t("repositoryOwner")))}), r5), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
