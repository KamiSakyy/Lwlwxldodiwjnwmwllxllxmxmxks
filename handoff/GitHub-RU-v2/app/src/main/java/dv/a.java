package dv;

import aa.m;
import aa.n;
import aa.p;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import ew.j;
import java.util.List;
import m10.ah;
import m10.cc0;
import m10.cs;
import m10.eh;
import m10.es;
import m10.ig;
import m10.kg;
import m10.ss;
import m10.wg;
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
        List n = d0Shadow.n("Repository");
        List list = j.a;
        s c = no.a.c(list, "selections", "Repository", n, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("name", xVar, (String) null, rVar, rVar, rVar);
        kg.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, new m("text", xVar, (String) null, rVar, no.a.s(kg.a, new u0(40)), rVar)});
        m mVar3 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        m mVar4 = new m("url", l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        p a2 = l0.a(kg.b);
        ig.Companion.getClass();
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Repository", d0Shadow.n("Repository"), r), new n("Gist", d0Shadow.n("Gist"), l.r(new m[]{mVar3, mVar4, new m("files", a2, (String) null, rVar, no.a.s(ig.a, new u0(1)), r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        cs.Companion.getClass();
        List n2 = d0Shadow.n(new m("nodes", l0.a(cs.a), "pinnedItems", rVar, rVar, r3));
        wg.Companion.getClass();
        m mVar5 = new m("hasPinnedItems", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        es.Companion.getClass();
        r b2 = l0.b(es.a);
        ss.Companion.getClass();
        a = l.r(new m[]{mVar5, new m("items", b2, (String) null, rVar, no.a.s(ss.a, new u0(6)), n2)});
    }
}
