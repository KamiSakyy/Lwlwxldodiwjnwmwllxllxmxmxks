package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.p00;
import m10.ux;
import m10.zp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class u2 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.r b2 = v8.l0.b(xVar);
        ux.Companion.getClass();
        a81.t tVar = ux.S;
        aa.m mVar3 = new aa.m("viewerMergeHeadlineText", b2, "mergeHeadline", rVar, no.a.s(tVar, new aa.u0("MERGE")), rVar);
        aa.r b3 = v8.l0.b(xVar);
        a81.t tVar2 = ux.R;
        List r = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("PullRequest", sy.d0.n("PullRequest"), x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("viewerMergeBodyText", b3, "mergeBody", rVar, no.a.s(tVar2, new aa.u0("MERGE")), rVar), new aa.m("viewerMergeHeadlineText", v8.l0.b(xVar), "squashHeadline", rVar, no.a.s(tVar, new aa.u0("SQUASH")), rVar), new aa.m("viewerMergeBodyText", v8.l0.b(xVar), "squashBody", rVar, no.a.s(tVar2, new aa.u0("SQUASH")), rVar)})), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        aa.j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new aa.u0(new aa.t("id"))), r), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
