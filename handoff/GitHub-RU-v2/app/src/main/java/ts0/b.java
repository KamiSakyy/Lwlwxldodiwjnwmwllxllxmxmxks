package ts0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import pz0.hs;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;
import yt0.h;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("PullRequest");
        List list2 = h.a;
        s c = no.a.c(list2, "selections", "PullRequest", n, list2);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r3 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pz0.l.Companion.getClass();
        m mVar4 = new m("enqueuer", l0.b(pz0.l.a), (String) null, rVar, rVar, r2);
        vd.Companion.getClass();
        x xVar3 = vd.a;
        k.g(xVar3, "type");
        m mVar5 = new m("estimatedTimeToMerge", xVar3, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar4 = pd.a;
        m mVar6 = new m("jump", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("solo", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("position", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        hs.Companion.getClass();
        q0 q0Var = hs.N;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, new m("pullRequest", q0Var, (String) null, rVar, rVar, r3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
