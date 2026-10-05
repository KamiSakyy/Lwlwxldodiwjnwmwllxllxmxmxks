package kv;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.cc0;
import m10.da0;
import m10.eh;
import m10.j90;
import m10.mg;
import m10.sa;
import m10.y5;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        da0.Companion.getClass();
        m mVar2 = new m("state", l0.b(da0.s), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new m[]{mVar, mVar2, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        List r2 = l.r(new m[]{mVar3, new m("avatarUrl", l0.b(cc0.a), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        j90.Companion.getClass();
        q0 q0Var = j90.a;
        k.g(q0Var, "type");
        m mVar6 = new m("status", q0Var, (String) null, rVar, rVar, r);
        m mVar7 = new m("messageHeadline", l0.b(xVar), (String) null, rVar, rVar, rVar);
        mg.Companion.getClass();
        q0 q0Var2 = mg.a;
        k.g(q0Var2, "type");
        m mVar8 = new m("author", q0Var2, (String) null, rVar, rVar, r2);
        sa.Companion.getClass();
        List r3 = l.r(new m[]{mVar4, mVar5, mVar6, mVar7, mVar8, new m("committedDate", l0.b(sa.a), (String) null, rVar, rVar, rVar)});
        m mVar9 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar10 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        y5.Companion.getClass();
        a = l.r(new m[]{mVar9, mVar10, new m("commit", l0.b(y5.j), "pullRequestCommit", rVar, rVar, r3)});
    }
}
