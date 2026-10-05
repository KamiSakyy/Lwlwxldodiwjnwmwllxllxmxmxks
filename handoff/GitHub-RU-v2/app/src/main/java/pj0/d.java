package pj0;

import aa.j0;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import gn0.fb;
import gn0.hb;
import gn0.lb;
import gn0.pb;
import gn0.qv;
import gn0.tb;
import gn0.yv;
import java.util.List;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        yv.Companion.getClass();
        r b = l0.b(yv.s);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("state", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar = pb.a;
        aa.m mVar2 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar2 = tb.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hb.Companion.getClass();
        aa.m mVar3 = new aa.m("oid", l0.b(hb.a), (String) null, rVar, rVar, rVar);
        qv.Companion.getClass();
        q0 q0Var = qv.c;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Commit", d0.n("Commit"), x61.l.r(new aa.m[]{mVar3, new aa.m("statusCheckRollup", q0Var, (String) null, rVar, rVar, r)}))});
        aa.m mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        aa.m mVar6 = new aa.m("viewerCanCommitToBranch", l0.b(lb.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        j0 j0Var = fb.a;
        k71.k.g(j0Var, "type");
        a = x61.l.r(new aa.m[]{mVar4, mVar5, mVar6, new aa.m("target", j0Var, (String) null, rVar, rVar, r2), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
