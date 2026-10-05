package ls0;

import aa.a0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import pz0.jx;
import pz0.pd;
import pz0.py;
import pz0.td;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        td.Companion.getClass();
        x xVar = td.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar2 = pd.a;
        List r = l.r(new m[]{mVar, new m("viewerCanReact", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r2 = l.r(new m[]{new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("viewerCanReact", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        py.Companion.getClass();
        a0 a0Var = py.s;
        k.g(a0Var, "type");
        m mVar3 = new m("viewerPermission", a0Var, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar3 = xd.a;
        List r3 = l.r(new m[]{mVar2, mVar3, new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        jx.Companion.getClass();
        a = l.r(new s[]{new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("locked", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("PullRequest", d0.n("PullRequest"), r), new n("Issue", d0.n("Issue"), r2), new n("Discussion", d0.n("Discussion"), l.r(new m[]{new m("repository", l0.b(jx.t0), (String) null, rVar, rVar, r3), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("viewerCanReact", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("viewerCanUpvote", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
    }
}
