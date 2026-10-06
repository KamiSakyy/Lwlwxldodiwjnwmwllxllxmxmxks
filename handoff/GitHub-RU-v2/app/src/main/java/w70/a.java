package w70;

import aa.m;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.bk;
import hc0.fb;
import hc0.ji;
import hc0.nj;
import hc0.vj;
import hc0.xa;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        xa.Companion.getClass();
        r b = l0.b(xa.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar = fb.a;
        k.g(xVar, "type");
        List r = l.r(new m[]{mVar, new m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Project");
        List list = u70.a.a;
        s c = no.a.c(list, "selections", "Project", n, list);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ji.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(ji.a), (String) null, rVar, rVar, r);
        nj.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("nodes", l0.a(nj.a), (String) null, rVar, rVar, r2)});
        m mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        vj.Companion.getClass();
        r b2 = l0.b(vj.a);
        bk.Companion.getClass();
        a = l.r(new m[]{mVar4, new m("projects", b2, (String) null, rVar, l.r(new aa.k[]{new aa.k(bk.a, new u0(new t("after"))), new aa.k(bk.b, new u0(50)), new aa.k(bk.c, new u0(x61.x.u(new w61.k[]{new w61.k("direction", "ASC"), new w61.k("field", "NAME")}))), new aa.k(bk.d, new u0(new t("search"))), new aa.k(bk.e, new u0(d0Shadow.n("OPEN")))}), r3)});
    }
}
