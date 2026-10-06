package oi0;

import aa.m;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.bl;
import gn0.jj;
import gn0.lb;
import gn0.nk;
import gn0.pb;
import gn0.tb;
import gn0.vk;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        lb.Companion.getClass();
        r b = l0.b(lb.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar = tb.a;
        k.g(xVar, "type");
        List r = l.r(new m[]{mVar, new m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Project");
        List list = mi0.a.a;
        s c = no.a.c(list, "selections", "Project", n, list);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(jj.a), (String) null, rVar, rVar, r);
        nk.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("nodes", l0.a(nk.a), (String) null, rVar, rVar, r2)});
        m mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        vk.Companion.getClass();
        r b2 = l0.b(vk.a);
        bl.Companion.getClass();
        a = l.r(new m[]{mVar4, new m("projects", b2, (String) null, rVar, l.r(new aa.k[]{new aa.k(bl.a, new u0(new t("after"))), new aa.k(bl.b, new u0(50)), new aa.k(bl.c, new u0(x61.x.u(new w61.k("direction", "ASC"), new w61.k("field", "NAME")))), new aa.k(bl.d, new u0(new t("search"))), new aa.k(bl.e, new u0(d0Shadow.n("OPEN")))}), r3)});
    }
}
