package sp;

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
import m10.ie;
import m10.ne0;
import m10.vp;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        ah.Companion.getClass();
        r b = l0.b(ah.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar = eh.a;
        List r = l.r(new m[]{mVar, new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("clientMutationId", xVar, (String) null, rVar, rVar, rVar);
        ie.Companion.getClass();
        q0 q0Var = ie.c;
        k.g(q0Var, "type");
        List r2 = l.r(new m[]{mVar2, new m("draftIssue", q0Var, (String) null, rVar, rVar, r)});
        ne0.Companion.getClass();
        q0 q0Var2 = ne0.a;
        k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = d0.n(new m("updateProjectV2DraftIssue", q0Var2, (String) null, rVar, no.a.s(vp.m1, new u0(x61.x.u(new w61.k[]{new w61.k("draftIssueId", new t("id")), new w61.k("title", new t("title"))}))), r2));
    }
}
