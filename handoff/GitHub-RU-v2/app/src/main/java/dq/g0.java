package dq;

import aa.q0;
import java.util.List;
import m10.ah;
import m10.ak;
import m10.ch;
import m10.eh;
import m10.gh;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("color", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar2 = new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        aa.s mVar5 = new aa.m("contributorsCount", v8.l0.b(ch.a), (String) null, rVar, rVar, rVar);
        gh.Companion.getClass();
        aa.s mVar6 = new aa.m("descriptionHTML", v8.l0.b(gh.a), (String) null, rVar, rVar, rVar);
        ak.Companion.getClass();
        q0 q0Var = ak.a;
        k71.k.g(q0Var, "type");
        aa.s mVar7 = new aa.m("primaryLanguage", q0Var, (String) null, rVar, rVar, r);
        List n = sy.d0.n("Repository");
        List list = ew.p.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        List n2 = sy.d0.n("Repository");
        List list2 = h0.a;
        a = x61.l.r(new aa.s[]{mVar3, mVar4, mVar5, mVar6, mVar7, c, no.a.c(list2, "selections", "Repository", n2, list2)});
    }
}
