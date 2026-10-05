package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.p00;
import m10.ty;
import m10.ux;
import m10.vy;
import m10.zp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class w2 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("commitMessageBody", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar2 = new aa.m("commitMessageHeadline", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("possibleCommitAuthorEmails", v8.l0.b(v8.l0.a(v8.l0.b(xVar))), (String) null, rVar, rVar, rVar);
        vy.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("state", v8.l0.b(vy.s), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        aa.m mVar5 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ty.Companion.getClass();
        aa.r b = v8.l0.b(ty.a);
        ux.Companion.getClass();
        List r2 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("PullRequest", sy.d0.n("PullRequest"), x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("mergeRequirements", b, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ux.v, new aa.u0(new aa.t("bypassRequirements"))), new aa.k(ux.w, new aa.u0(new aa.t("mergeAction"))), new aa.k(ux.x, new aa.u0(new aa.t("mergeMethod")))}), r)})), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        aa.j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new aa.u0(new aa.t("id"))), r2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
