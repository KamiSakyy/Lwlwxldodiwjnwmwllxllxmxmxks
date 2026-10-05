package ds0;

import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.ba;
import pz0.hs;
import pz0.le;
import pz0.sf;
import pz0.td;
import pz0.uf;
import pz0.xd;
import sy.d0;
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
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("Label");
        List list = bs0.a.a;
        s c = no.a.c(list, "selections", "Label", n, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        sf.Companion.getClass();
        q0 q0Var = sf.a;
        List r2 = l.r(new m[]{mVar2, new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, r)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        uf.Companion.getClass();
        q0 q0Var2 = uf.a;
        k.g(q0Var2, "type");
        le.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("labels", q0Var2, (String) null, rVar, no.a.s(le.k, new u0(25)), r2)});
        List r4 = l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Label", d0.n("Label"), list), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        m mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ba.Companion.getClass();
        List r5 = l.r(new m[]{mVar4, new m("labels", q0Var2, (String) null, rVar, no.a.s(ba.i, new u0(25)), r4)});
        List r6 = l.r(new m[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Label", d0.n("Label"), list), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hs.Companion.getClass();
        a = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Issue", d0.n("Issue"), r3), new n("Discussion", d0.n("Discussion"), r5), new n("PullRequest", d0.n("PullRequest"), l.r(new m[]{mVar5, new m("labels", q0Var2, (String) null, rVar, no.a.s(hs.o, new u0(25)), r6)}))});
    }

    public static List a() {
        return a;
    }
}
