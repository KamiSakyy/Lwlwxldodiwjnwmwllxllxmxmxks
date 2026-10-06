package xe0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import gn0.bb;
import gn0.lb;
import gn0.mx;
import gn0.pb;
import gn0.qv;
import gn0.r6;
import gn0.s00;
import gn0.tb;
import gn0.yv;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("login", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        x xVar3 = mx.a;
        m mVar3 = new m("avatarUrl", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("name", xVar, (String) null, rVar, rVar, rVar);
        s00.Companion.getClass();
        q0 q0Var = s00.P;
        k.g(q0Var, "type");
        List r2 = l.r(new m[]{mVar2, mVar3, mVar4, new m("user", q0Var, (String) null, rVar, rVar, r)});
        List r3 = l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("avatarUrl", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("name", xVar, (String) null, rVar, rVar, rVar), new m("user", q0Var, (String) null, rVar, rVar, l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        yv.Companion.getClass();
        List r4 = l.r(new m[]{mVar5, new m("state", l0.b(yv.s), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar6 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        r6.Companion.getClass();
        m mVar7 = new m("committedDate", l0.b(r6.a), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("messageHeadline", l0.b(xVar), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar4 = lb.a;
        m mVar9 = new m("committedViaWeb", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar10 = new m("authoredByCommitter", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar11 = new m("abbreviatedOid", l0.b(xVar), (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        q0 q0Var2 = bb.a;
        k.g(q0Var2, "type");
        m mVar12 = new m("committer", q0Var2, (String) null, rVar, rVar, r2);
        m mVar13 = new m("author", q0Var2, (String) null, rVar, rVar, r3);
        qv.Companion.getClass();
        q0 q0Var3 = qv.c;
        k.g(q0Var3, "type");
        a = l.r(new m[]{mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, new m("statusCheckRollup", q0Var3, (String) null, rVar, rVar, r4), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
