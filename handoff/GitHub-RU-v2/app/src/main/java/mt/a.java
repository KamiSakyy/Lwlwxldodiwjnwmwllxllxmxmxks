package mt;

import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.fd;
import m10.sj;
import m10.uj;
import m10.ux;
import m10.wh;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Label");
        List list = kt.a.a;
        s c = no.a.c(list, "selections", "Label", n, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        sj.Companion.getClass();
        q0 q0Var = sj.a;
        List r2 = l.r(new m[]{mVar2, new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, r)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        uj.Companion.getClass();
        q0 q0Var2 = uj.a;
        k.g(q0Var2, "type");
        wh.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("labels", q0Var2, (String) null, rVar, no.a.s(wh.k, new u0(25)), r2)});
        List r4 = l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Label", d0Shadow.n("Label"), list), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        m mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        fd.Companion.getClass();
        List r5 = l.r(new m[]{mVar4, new m("labels", q0Var2, (String) null, rVar, no.a.s(fd.i, new u0(25)), r4)});
        List r6 = l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Label", d0Shadow.n("Label"), list), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ux.Companion.getClass();
        a = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Issue", d0Shadow.n("Issue"), r3), new n("Discussion", d0Shadow.n("Discussion"), r5), new n("PullRequest", d0Shadow.n("PullRequest"), l.r(new m[]{mVar5, new m("labels", q0Var2, (String) null, rVar, no.a.s(ux.p, new u0(25)), r6)}))});
    }
}
