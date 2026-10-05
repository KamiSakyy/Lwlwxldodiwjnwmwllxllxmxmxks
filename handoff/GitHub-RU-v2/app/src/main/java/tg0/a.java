package tg0;

import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import gn0.a9;
import gn0.hc;
import gn0.hd;
import gn0.jd;
import gn0.ll;
import gn0.pb;
import gn0.tb;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("Label");
        List list = rg0.a.a;
        s c = no.a.c(list, "selections", "Label", n, list);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        hd.Companion.getClass();
        q0 q0Var = hd.a;
        List r2 = l.r(new m[]{mVar2, new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, r)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        jd.Companion.getClass();
        q0 q0Var2 = jd.a;
        k.g(q0Var2, "type");
        hc.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("labels", q0Var2, (String) null, rVar, no.a.s(hc.k, new u0(25)), r2)});
        List r4 = l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Label", d0.n("Label"), list), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        m mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        a9.Companion.getClass();
        List r5 = l.r(new m[]{mVar4, new m("labels", q0Var2, (String) null, rVar, no.a.s(a9.i, new u0(25)), r4)});
        List r6 = l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Label", d0.n("Label"), list), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ll.Companion.getClass();
        a = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Issue", d0.n("Issue"), r3), new n("Discussion", d0.n("Discussion"), r5), new n("PullRequest", d0.n("PullRequest"), l.r(new m[]{mVar5, new m("labels", q0Var2, (String) null, rVar, no.a.s(ll.o, new u0(25)), r6)}))});
    }

    public static List a() {
        return a;
    }
}
