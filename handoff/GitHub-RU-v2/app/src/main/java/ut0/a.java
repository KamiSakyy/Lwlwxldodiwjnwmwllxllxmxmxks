package ut0;

import aa.m;
import aa.n;
import aa.p;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.bd;
import pz0.dd;
import pz0.h50;
import pz0.ln;
import pz0.pd;
import pz0.td;
import pz0.vm;
import pz0.xd;
import pz0.xm;
import sy.d0Shadow;
import v8.l0;
import vu0.j;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Repository");
        List list = j.a;
        s c = no.a.c(list, "selections", "Repository", n, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("name", xVar, (String) null, rVar, rVar, rVar);
        dd.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, new m("text", xVar, (String) null, rVar, no.a.s(dd.a, new u0(40)), rVar)});
        m mVar3 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        m mVar4 = new m("url", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        p a2 = l0.a(dd.b);
        bd.Companion.getClass();
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Repository", d0Shadow.n("Repository"), r), new n("Gist", d0Shadow.n("Gist"), l.r(new m[]{mVar3, mVar4, new m("files", a2, (String) null, rVar, no.a.s(bd.a, new u0(1)), r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        vm.Companion.getClass();
        List n2 = d0Shadow.n(new m("nodes", l0.a(vm.a), "pinnedItems", rVar, rVar, r3));
        pd.Companion.getClass();
        m mVar5 = new m("hasPinnedItems", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        xm.Companion.getClass();
        r b2 = l0.b(xm.a);
        ln.Companion.getClass();
        a = l.r(new m[]{mVar5, new m("items", b2, (String) null, rVar, no.a.s(ln.a, new u0(6)), n2)});
    }
}
