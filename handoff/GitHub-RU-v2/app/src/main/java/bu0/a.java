package bu0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import pz0.d30;
import pz0.fd;
import pz0.h50;
import pz0.n30;
import pz0.o7;
import pz0.s4;
import pz0.td;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        n30.Companion.getClass();
        m mVar2 = new m("state", l0.b(n30.s), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = l.r(new m[]{mVar, mVar2, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        List r2 = l.r(new m[]{mVar3, new m("avatarUrl", l0.b(h50.a), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        d30.Companion.getClass();
        q0 q0Var = d30.a;
        k.g(q0Var, "type");
        m mVar6 = new m("status", q0Var, (String) null, rVar, rVar, r);
        m mVar7 = new m("messageHeadline", l0.b(xVar), (String) null, rVar, rVar, rVar);
        fd.Companion.getClass();
        q0 q0Var2 = fd.a;
        k.g(q0Var2, "type");
        m mVar8 = new m("author", q0Var2, (String) null, rVar, rVar, r2);
        o7.Companion.getClass();
        List r3 = l.r(new m[]{mVar4, mVar5, mVar6, mVar7, mVar8, new m("committedDate", l0.b(o7.a), (String) null, rVar, rVar, rVar)});
        m mVar9 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar10 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s4.Companion.getClass();
        a = l.r(new m[]{mVar9, mVar10, new m("commit", l0.b(s4.j), "pullRequestCommit", rVar, rVar, r3)});
    }
}
