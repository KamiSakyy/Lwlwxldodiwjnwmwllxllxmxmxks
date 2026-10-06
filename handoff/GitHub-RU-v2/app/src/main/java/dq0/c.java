package dq0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import pz0.f30;
import pz0.fd;
import pz0.h50;
import pz0.n30;
import pz0.o7;
import pz0.pd;
import pz0.td;
import pz0.w80;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("login", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        x xVar3 = h50.a;
        m mVar3 = new m("avatarUrl", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("name", xVar, (String) null, rVar, rVar, rVar);
        w80.Companion.getClass();
        q0 q0Var = w80.W;
        k.g(q0Var, "type");
        List r2 = l.r(new m[]{mVar2, mVar3, mVar4, new m("user", q0Var, (String) null, rVar, rVar, r)});
        List r3 = l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("avatarUrl", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("name", xVar, (String) null, rVar, rVar, rVar), new m("user", q0Var, (String) null, rVar, rVar, l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        n30.Companion.getClass();
        List r4 = l.r(new m[]{mVar5, new m("state", l0.b(n30.s), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar6 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        m mVar7 = new m("committedDate", l0.b(o7.a), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("messageHeadline", l0.b(xVar), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar4 = pd.a;
        m mVar9 = new m("committedViaWeb", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar10 = new m("authoredByCommitter", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar11 = new m("abbreviatedOid", l0.b(xVar), (String) null, rVar, rVar, rVar);
        fd.Companion.getClass();
        q0 q0Var2 = fd.a;
        k.g(q0Var2, "type");
        m mVar12 = new m("committer", q0Var2, (String) null, rVar, rVar, r2);
        m mVar13 = new m("author", q0Var2, (String) null, rVar, rVar, r3);
        f30.Companion.getClass();
        q0 q0Var3 = f30.c;
        k.g(q0Var3, "type");
        a = l.r(new m[]{mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, new m("statusCheckRollup", q0Var3, (String) null, rVar, rVar, r4), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
