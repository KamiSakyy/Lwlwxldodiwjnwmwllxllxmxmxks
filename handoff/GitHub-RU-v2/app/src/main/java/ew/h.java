package ew;

import aa.j0;
import aa.q0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.da0;
import m10.eh;
import m10.p90;
import m10.qg;
import m10.sg;
import m10.wg;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h {
    public static final List a;

    static {
        da0.Companion.getClass();
        aa.r b = l0.b(da0.s);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("state", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar = ah.a;
        aa.m mVar2 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        sg.Companion.getClass();
        aa.m mVar3 = new aa.m("oid", l0.b(sg.a), (String) null, rVar, rVar, rVar);
        p90.Companion.getClass();
        q0 q0Var = p90.c;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.s[]{new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Commit", d0Shadow.n("Commit"), x61.l.r(new aa.m[]{mVar3, new aa.m("statusCheckRollup", q0Var, (String) null, rVar, rVar, r)}))});
        aa.m mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.m mVar6 = new aa.m("viewerCanCommitToBranch", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        qg.Companion.getClass();
        j0 j0Var = qg.a;
        k71.k.g(j0Var, "type");
        a = x61.l.r(new aa.m[]{mVar4, mVar5, mVar6, new aa.m("target", j0Var, (String) null, rVar, rVar, r2), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
