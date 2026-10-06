package d80;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import hc0.bb;
import hc0.ew;
import hc0.fb;
import hc0.h6;
import hc0.ku;
import hc0.na;
import hc0.t3;
import hc0.uu;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        uu.Companion.getClass();
        m mVar2 = new m("state", l0.b(uu.s), (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r = l.r(new m[]{mVar, mVar2, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        List r2 = l.r(new m[]{mVar3, new m("avatarUrl", l0.b(ew.a), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ku.Companion.getClass();
        q0 q0Var = ku.a;
        k.g(q0Var, "type");
        m mVar6 = new m("status", q0Var, (String) null, rVar, rVar, r);
        m mVar7 = new m("messageHeadline", l0.b(xVar), (String) null, rVar, rVar, rVar);
        na.Companion.getClass();
        q0 q0Var2 = na.a;
        k.g(q0Var2, "type");
        m mVar8 = new m("author", q0Var2, (String) null, rVar, rVar, r2);
        h6.Companion.getClass();
        List r3 = l.r(new m[]{mVar4, mVar5, mVar6, mVar7, mVar8, new m("committedDate", l0.b(h6.a), (String) null, rVar, rVar, rVar)});
        m mVar9 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar10 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        t3.Companion.getClass();
        a = l.r(new m[]{mVar9, mVar10, new m("commit", l0.b(t3.j), "pullRequestCommit", rVar, rVar, r3)});
    }
}
