package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.fd;
import m10.gr;
import m10.i30;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d3 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Discussion");
        List list = js.c.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Discussion", n, list)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s nVar = new aa.n("Discussion", sy.d0.n("Discussion"), r);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, nVar, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        fd.Companion.getClass();
        aa.q0 q0Var = fd.l;
        k71.k.g(q0Var, "type");
        i30.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{new aa.m("discussion", q0Var, (String) null, rVar, no.a.s(i30.f, new aa.u0(new aa.t("discussionNumber"))), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = i30.w0;
        k71.k.g(q0Var2, "type");
        List r4 = x61.l.r(new aa.m[]{new aa.m("organizationDiscussionsRepository", q0Var2, (String) null, rVar, rVar, r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        gr.Companion.getClass();
        aa.q0 q0Var3 = gr.o;
        k71.k.g(q0Var3, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("organization", q0Var3, (String) null, rVar, no.a.s(p00.j, new aa.u0(new aa.t("repositoryOwner"))), r4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
