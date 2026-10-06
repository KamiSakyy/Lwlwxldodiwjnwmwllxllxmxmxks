package bh0;

import aa.a0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import gn0.eq;
import gn0.jr;
import gn0.lb;
import gn0.pb;
import gn0.tb;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        pb.Companion.getClass();
        x xVar = pb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar2 = lb.a;
        List r = l.r(new m[]{mVar, new m("viewerCanReact", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r2 = l.r(new m[]{new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("viewerCanReact", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        jr.Companion.getClass();
        a0 a0Var = jr.s;
        k.g(a0Var, "type");
        m mVar3 = new m("viewerPermission", a0Var, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar3 = tb.a;
        List r3 = l.r(new m[]{mVar2, mVar3, new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        eq.Companion.getClass();
        a = l.r(new s[]{new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("locked", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("PullRequest", d0Shadow.n("PullRequest"), r), new n("Issue", d0Shadow.n("Issue"), r2), new n("Discussion", d0Shadow.n("Discussion"), l.r(new m[]{new m("repository", l0.b(eq.m0), (String) null, rVar, rVar, r3), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("viewerCanReact", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("viewerCanUpvote", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
    }
}
