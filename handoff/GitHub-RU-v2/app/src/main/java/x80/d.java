package x80;

import aa.j0;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.mu;
import hc0.ra;
import hc0.ta;
import hc0.uu;
import hc0.xa;
import java.util.List;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        uu.Companion.getClass();
        r b = l0.b(uu.s);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("state", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar = bb.a;
        aa.m mVar2 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar2 = fb.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ta.Companion.getClass();
        aa.m mVar3 = new aa.m("oid", l0.b(ta.a), (String) null, rVar, rVar, rVar);
        mu.Companion.getClass();
        q0 q0Var = mu.c;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Commit", d0.n("Commit"), x61.l.r(new aa.m[]{mVar3, new aa.m("statusCheckRollup", q0Var, (String) null, rVar, rVar, r)}))});
        aa.m mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        aa.m mVar6 = new aa.m("viewerCanCommitToBranch", l0.b(xa.a), (String) null, rVar, rVar, rVar);
        ra.Companion.getClass();
        j0 j0Var = ra.a;
        k71.k.g(j0Var, "type");
        a = x61.l.r(new aa.m[]{mVar4, mVar5, mVar6, new aa.m("target", j0Var, (String) null, rVar, rVar, r2), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
