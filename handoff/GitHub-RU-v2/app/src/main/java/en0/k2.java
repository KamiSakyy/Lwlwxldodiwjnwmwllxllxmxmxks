package en0;

import gn0.ll;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import gn0.yh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k2 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.r b2 = v8.l0.b(xVar);
        ll.Companion.getClass();
        a81.t tVar = ll.J;
        aa.m mVar3 = new aa.m("viewerMergeHeadlineText", b2, "mergeHeadline", rVar, no.a.s(tVar, new aa.u0("MERGE")), rVar);
        aa.r b3 = v8.l0.b(xVar);
        a81.t tVar2 = ll.I;
        List r = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("PullRequest", sy.d0.n("PullRequest"), x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("viewerMergeBodyText", b3, "mergeBody", rVar, no.a.s(tVar2, new aa.u0("MERGE")), rVar), new aa.m("viewerMergeHeadlineText", v8.l0.b(xVar), "squashHeadline", rVar, no.a.s(tVar, new aa.u0("SQUASH")), rVar), new aa.m("viewerMergeBodyText", v8.l0.b(xVar), "squashBody", rVar, no.a.s(tVar2, new aa.u0("SQUASH")), rVar)})), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        yh.Companion.getClass();
        aa.j0 j0Var = yh.a;
        k71.k.g(j0Var, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("node", j0Var, (String) null, rVar, no.a.s(rn.i, new aa.u0(new aa.t("id"))), r));
    }
}
