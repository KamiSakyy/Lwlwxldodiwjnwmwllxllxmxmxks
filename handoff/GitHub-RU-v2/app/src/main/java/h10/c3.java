package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.fd;
import m10.gr;
import m10.i30;
import m10.nd;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c3 {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.x xVar = ah.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        nd.Companion.getClass();
        aa.q0 q0Var = nd.c;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("replyTo", q0Var, (String) null, rVar, rVar, r), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        fd.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{new aa.m("comment", q0Var, (String) null, rVar, no.a.s(fd.f, new aa.u0(new aa.t("commentUrl"))), r2), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var2 = fd.l;
        k71.k.g(q0Var2, "type");
        i30.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, new aa.m("discussion", q0Var2, (String) null, rVar, no.a.s(i30.f, new aa.u0(new aa.t("discussionNumber"))), r3), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = i30.w0;
        k71.k.g(q0Var3, "type");
        List r5 = x61.l.r(new aa.m[]{new aa.m("organizationDiscussionsRepository", q0Var3, (String) null, rVar, rVar, r4), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        gr.Companion.getClass();
        aa.q0 q0Var4 = gr.o;
        k71.k.g(q0Var4, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("organization", q0Var4, (String) null, rVar, no.a.s(p00.j, new aa.u0(new aa.t("repositoryOwner"))), r5), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
