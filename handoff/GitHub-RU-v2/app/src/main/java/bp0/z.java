package bp0;

import aa.q0;
import java.util.List;
import pz0.ag;
import pz0.td;
import pz0.vd;
import pz0.xd;
import pz0.zd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class z {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("color", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar2 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        aa.s mVar5 = new aa.m("contributorsCount", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        zd.Companion.getClass();
        aa.s mVar6 = new aa.m("descriptionHTML", l0.b(zd.a), (String) null, rVar, rVar, rVar);
        ag.Companion.getClass();
        q0 q0Var = ag.a;
        k71.k.g(q0Var, "type");
        aa.s mVar7 = new aa.m("primaryLanguage", q0Var, (String) null, rVar, rVar, r);
        List n = sy.d0Shadow.n("Repository");
        List list = vu0.o.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        List n2 = sy.d0Shadow.n("Repository");
        List list2 = a0.a;
        a = x61.l.r(new aa.s[]{mVar3, mVar4, mVar5, mVar6, mVar7, c, no.a.c(list2, "selections", "Repository", n2, list2)});
    }
}
