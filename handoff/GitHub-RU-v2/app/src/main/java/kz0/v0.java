package kz0;

import java.util.List;
import pz0.ba;
import pz0.ja;
import pz0.jx;
import pz0.su;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v0 {
    public static final List a;

    static {
        td.Companion.getClass();
        aa.x xVar = td.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        ja.Companion.getClass();
        aa.q0 q0Var = ja.c;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("replyTo", q0Var, (String) null, rVar, rVar, r), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        ba.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("comment", q0Var, (String) null, rVar, no.a.s(ba.f, new aa.u0(new aa.t("commentUrl"))), r2), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var2 = ba.l;
        k71.k.g(q0Var2, "type");
        jx.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar4, new aa.m("discussion", q0Var2, (String) null, rVar, no.a.s(jx.i, new aa.u0(new aa.t("discussionNumber"))), r3), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = jx.t0;
        k71.k.g(q0Var3, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("repositoryName"))), new aa.k(su.m, new aa.u0(new aa.t("repositoryOwner")))}), r4), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
