package h10;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.fd;
import m10.gs;
import m10.hd;
import m10.i30;
import m10.is;
import m10.ks;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h3 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        aa.m mVar2 = new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ch.Companion.getClass();
        aa.m mVar3 = new aa.m("number", v8.l0.b(ch.a), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("title", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        m10.l.Companion.getClass();
        aa.j0 j0Var = m10.l.a;
        k71.k.g(j0Var, "type");
        aa.m mVar5 = new aa.m("author", j0Var, (String) null, rVar, rVar, r2);
        hd.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, mVar4, mVar5, new aa.m("category", v8.l0.b(hd.a), (String) null, rVar, rVar, r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar6 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        fd.Companion.getClass();
        aa.m mVar7 = new aa.m("discussion", v8.l0.b(fd.l), (String) null, rVar, rVar, r4);
        ks.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar6, mVar7, new aa.m("pattern", v8.l0.b(ks.s), (String) null, rVar, rVar, rVar), new aa.m("gradientStopColors", v8.l0.b(v8.l0.a(v8.l0.b(xVar))), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        gs.Companion.getClass();
        List n = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(gs.a), (String) null, rVar, rVar, r5));
        aa.m mVar8 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        is.Companion.getClass();
        aa.r b2 = v8.l0.b(is.a);
        i30.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar8, new aa.m("pinnedDiscussions", b2, (String) null, rVar, no.a.s(i30.H, new aa.u0(10)), n), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = i30.w0;
        k71.k.g(q0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("repositoryName"))), new aa.k(p00.m, new aa.u0(new aa.t("repositoryOwner")))}), r6), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
