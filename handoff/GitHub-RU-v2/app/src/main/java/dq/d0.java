package dq;

import aa.u0;
import java.util.List;
import m10.ah;
import m10.cc0;
import m10.cg;
import m10.ch;
import m10.eh;
import m10.q30;
import m10.rf0;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d0 {
    public static final List a;

    static {
        ch.Companion.getClass();
        aa.x xVar = ch.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        List n2 = sy.d0.n(new aa.m("totalCount", v8.l0.b(xVar), (String) null, rVar, rVar, rVar));
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        aa.s mVar = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.s mVar2 = new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("name", xVar2, (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("login", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        aa.s mVar5 = new aa.m("url", v8.l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        aa.s mVar6 = new aa.m("bio", xVar2, (String) null, rVar, rVar, rVar);
        q30.Companion.getClass();
        aa.r b2 = v8.l0.b(q30.a);
        rf0.Companion.getClass();
        aa.s mVar7 = new aa.m("repositories", b2, (String) null, rVar, no.a.s(rf0.I, new u0(sy.d0.n("OWNER"))), n);
        cg.Companion.getClass();
        aa.s mVar8 = new aa.m("followers", v8.l0.b(cg.a), (String) null, rVar, rVar, n2);
        wg.Companion.getClass();
        aa.x xVar3 = wg.a;
        aa.s mVar9 = new aa.m("viewerIsFollowing", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar10 = new aa.m("isViewer", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar11 = new aa.m("privateProfile", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.b.a;
        a = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, no.a.c(list, "selections", "Actor", r, list)});
    }
}
