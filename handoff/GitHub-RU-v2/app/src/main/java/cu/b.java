package cu;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import hv.i;
import java.util.List;
import k71.k;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.ux;
import m10.wg;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("PullRequest");
        List list2 = i.a;
        s c = no.a.c(list2, "selections", "PullRequest", n, list2);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r3 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m10.l.Companion.getClass();
        m mVar4 = new m("enqueuer", l0.b(m10.l.a), (String) null, rVar, rVar, r2);
        ch.Companion.getClass();
        x xVar3 = ch.a;
        k.g(xVar3, "type");
        m mVar5 = new m("estimatedTimeToMerge", xVar3, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar4 = wg.a;
        m mVar6 = new m("jump", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("solo", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("position", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        ux.Companion.getClass();
        q0 q0Var = ux.T;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, new m("pullRequest", q0Var, (String) null, rVar, rVar, r3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
