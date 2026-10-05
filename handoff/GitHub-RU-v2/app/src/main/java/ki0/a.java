package ki0;

import aa.m;
import aa.n;
import aa.p;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import gn0.jk;
import gn0.lb;
import gn0.mx;
import gn0.pb;
import gn0.tb;
import gn0.tj;
import gn0.vj;
import gn0.xa;
import gn0.za;
import java.util.List;
import pj0.f;
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
        List n = d0.n("Repository");
        List list = f.a;
        s c = no.a.c(list, "selections", "Repository", n, list);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("name", xVar, (String) null, rVar, rVar, rVar);
        za.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, new m("text", xVar, (String) null, rVar, no.a.s(za.a, new u0(40)), rVar)});
        m mVar3 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        m mVar4 = new m("url", l0.b(mx.a), (String) null, rVar, rVar, rVar);
        p a2 = l0.a(za.b);
        xa.Companion.getClass();
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Repository", d0.n("Repository"), r), new n("Gist", d0.n("Gist"), l.r(new m[]{mVar3, mVar4, new m("files", a2, (String) null, rVar, no.a.s(xa.a, new u0(1)), r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        tj.Companion.getClass();
        List n2 = d0.n(new m("nodes", l0.a(tj.a), "pinnedItems", rVar, rVar, r3));
        lb.Companion.getClass();
        m mVar5 = new m("hasPinnedItems", l0.b(lb.a), (String) null, rVar, rVar, rVar);
        vj.Companion.getClass();
        r b2 = l0.b(vj.a);
        jk.Companion.getClass();
        a = l.r(new m[]{mVar5, new m("items", b2, (String) null, rVar, no.a.s(jk.a, new u0(6)), n2)});
    }
}
