package vu0;

import aa.j0;
import aa.q0;
import aa.x;
import java.util.List;
import pz0.f30;
import pz0.jd;
import pz0.ld;
import pz0.n30;
import pz0.pd;
import pz0.td;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h {
    public static final List a;

    static {
        n30.Companion.getClass();
        aa.r b = l0.b(n30.s);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("state", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar = td.a;
        aa.m mVar2 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ld.Companion.getClass();
        aa.m mVar3 = new aa.m("oid", l0.b(ld.a), (String) null, rVar, rVar, rVar);
        f30.Companion.getClass();
        q0 q0Var = f30.c;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.s[]{new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Commit", d0Shadow.n("Commit"), x61.l.r(new aa.m[]{mVar3, new aa.m("statusCheckRollup", q0Var, (String) null, rVar, rVar, r)}))});
        aa.m mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.m mVar6 = new aa.m("viewerCanCommitToBranch", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        jd.Companion.getClass();
        j0 j0Var = jd.a;
        k71.k.g(j0Var, "type");
        a = x61.l.r(new aa.m[]{mVar4, mVar5, mVar6, new aa.m("target", j0Var, (String) null, rVar, rVar, r2), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
