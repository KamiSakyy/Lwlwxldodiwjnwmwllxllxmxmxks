package no0;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.eb;
import pz0.s70;
import pz0.sk;
import pz0.td;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        td.Companion.getClass();
        r b = l0.b(td.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar = xd.a;
        List r = l.r(new m[]{mVar, new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("clientMutationId", xVar, (String) null, rVar, rVar, rVar);
        eb.Companion.getClass();
        q0 q0Var = eb.c;
        k.g(q0Var, "type");
        List r2 = l.r(new m[]{mVar2, new m("draftIssue", q0Var, (String) null, rVar, rVar, r)});
        s70.Companion.getClass();
        q0 q0Var2 = s70.a;
        k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = d0.n(new m("updateProjectV2DraftIssue", q0Var2, (String) null, rVar, no.a.s(sk.h1, new u0(x61.x.u(new w61.k("draftIssueId", new t("id")), new w61.k("title", new t("title"))))), r2));
    }
}
