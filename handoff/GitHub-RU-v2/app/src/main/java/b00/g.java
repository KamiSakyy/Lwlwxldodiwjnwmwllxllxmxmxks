package b00;

import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ct;
import m10.eh;
import m10.i30;
import m10.l40;
import m10.ow;
import m10.p00;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2Connection");
        List list = uz.a.a;
        List r = x61.l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2Connection", n, list)});
        ct.Companion.getClass();
        r b2 = l0.b(ct.a);
        ow.Companion.getClass();
        List n2 = d0.n(new aa.m("projectsV2", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ow.b, new u0(new t("after"))), new aa.k(ow.c, new u0(new t("number"))), new aa.k(ow.d, new u0(new t("minPermission"))), new aa.k(ow.e, new u0(x61.x.u(new w61.k[]{new w61.k("direction", "DESC"), new w61.k("field", "RELEVANCE")}))), new aa.k(ow.f, new u0(new t("query")))}), r));
        s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r2 = x61.l.r(new s[]{mVar2, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("ProjectV2Owner", x61.l.r(new String[]{"Issue", "Organization", "PullRequest", "User"}), n2)});
        aa.m mVar3 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("owner", l0.b(l40.e), (String) null, rVar, rVar, r2), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        i30.Companion.getClass();
        q0 q0Var = i30.w0;
        k71.k.g(q0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new u0(new t("repo"))), new aa.k(p00.m, new u0(new t("owner")))}), r3), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
