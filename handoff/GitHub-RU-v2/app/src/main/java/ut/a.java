package ut;

import aa.a0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.n40;
import m10.wg;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar2 = wg.a;
        List r = l.r(new m[]{mVar, new m("viewerCanReact", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r2 = l.r(new m[]{new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("viewerCanReact", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        n40.Companion.getClass();
        a0 a0Var = n40.s;
        k.g(a0Var, "type");
        m mVar3 = new m("viewerPermission", a0Var, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar3 = eh.a;
        List r3 = l.r(new m[]{mVar2, mVar3, new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        i30.Companion.getClass();
        a = l.r(new s[]{new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("locked", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("PullRequest", d0Shadow.n("PullRequest"), r), new n("Issue", d0Shadow.n("Issue"), r2), new n("Discussion", d0Shadow.n("Discussion"), l.r(new m[]{new m("repository", l0.b(i30.w0), (String) null, rVar, rVar, r3), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("viewerCanReact", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("viewerCanUpvote", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
    }
}
