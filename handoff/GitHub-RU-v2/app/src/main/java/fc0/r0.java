package fc0;

import hc0.ap;
import hc0.bb;
import hc0.fb;
import hc0.o8;
import hc0.pm;
import hc0.w8;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r0 {
    public static final List a;

    static {
        bb.Companion.getClass();
        aa.x xVar = bb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        aa.x xVar2 = fb.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        w8.Companion.getClass();
        aa.q0 q0Var = w8.c;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("replyTo", q0Var, (String) null, rVar, rVar, r), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        o8.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("comment", q0Var, (String) null, rVar, no.a.s(o8.f, new aa.u0(new aa.t("commentUrl"))), r2), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var2 = o8.l;
        k71.k.g(q0Var2, "type");
        ap.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar4, new aa.m("discussion", q0Var2, (String) null, rVar, no.a.s(ap.i, new aa.u0(new aa.t("discussionNumber"))), r3), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = ap.k0;
        k71.k.g(q0Var3, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pm.i, new aa.u0(new aa.t("repositoryName"))), new aa.k(pm.j, new aa.u0(new aa.t("repositoryOwner")))}), r4));
    }
}
