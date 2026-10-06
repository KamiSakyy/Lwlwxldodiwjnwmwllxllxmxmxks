package vi0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import gn0.bb;
import gn0.d4;
import gn0.mx;
import gn0.ov;
import gn0.pb;
import gn0.r6;
import gn0.tb;
import gn0.yv;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        yv.Companion.getClass();
        m mVar2 = new m("state", l0.b(yv.s), (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = l.r(new m[]{mVar, mVar2, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        List r2 = l.r(new m[]{mVar3, new m("avatarUrl", l0.b(mx.a), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ov.Companion.getClass();
        q0 q0Var = ov.a;
        k.g(q0Var, "type");
        m mVar6 = new m("status", q0Var, (String) null, rVar, rVar, r);
        m mVar7 = new m("messageHeadline", l0.b(xVar), (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        q0 q0Var2 = bb.a;
        k.g(q0Var2, "type");
        m mVar8 = new m("author", q0Var2, (String) null, rVar, rVar, r2);
        r6.Companion.getClass();
        List r3 = l.r(new m[]{mVar4, mVar5, mVar6, mVar7, mVar8, new m("committedDate", l0.b(r6.a), (String) null, rVar, rVar, rVar)});
        m mVar9 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar10 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        d4.Companion.getClass();
        a = l.r(new m[]{mVar9, mVar10, new m("commit", l0.b(d4.j), "pullRequestCommit", rVar, rVar, r3)});
    }
}
