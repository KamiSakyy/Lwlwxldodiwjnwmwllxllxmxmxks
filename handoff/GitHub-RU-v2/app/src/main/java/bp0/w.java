package bp0;

import aa.u0;
import java.util.List;
import pz0.h50;
import pz0.pd;
import pz0.rx;
import pz0.td;
import pz0.vc;
import pz0.vd;
import pz0.w80;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class w {
    public static final List a;

    static {
        vd.Companion.getClass();
        aa.x xVar = vd.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        List n2 = sy.d0Shadow.n(new aa.m("totalCount", l0.b(xVar), (String) null, rVar, rVar, rVar));
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        aa.s mVar = new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.s mVar2 = new aa.m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("name", xVar2, (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.s mVar5 = new aa.m("url", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        aa.s mVar6 = new aa.m("bio", xVar2, (String) null, rVar, rVar, rVar);
        rx.Companion.getClass();
        aa.r b2 = l0.b(rx.a);
        w80.Companion.getClass();
        aa.s mVar7 = new aa.m("repositories", b2, (String) null, rVar, no.a.s(w80.I, new u0(sy.d0Shadow.n("OWNER"))), n);
        vc.Companion.getClass();
        aa.s mVar8 = new aa.m("followers", l0.b(vc.a), (String) null, rVar, rVar, n2);
        pd.Companion.getClass();
        aa.x xVar3 = pd.a;
        aa.s mVar9 = new aa.m("viewerIsFollowing", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar10 = new aa.m("isViewer", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar11 = new aa.m("privateProfile", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.b.a;
        a = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, no.a.c(list, "selections", "Actor", r, list)});
    }
}
