package s70;

import aa.m;
import aa.n;
import aa.p;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.ew;
import hc0.fb;
import hc0.ja;
import hc0.jj;
import hc0.la;
import hc0.ti;
import hc0.vi;
import hc0.xa;
import java.util.List;
import sy.d0;
import v8.l0;
import x61.l;
import x80.f;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("Repository");
        List list = f.a;
        s c = no.a.c(list, "selections", "Repository", n, list);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("name", xVar, (String) null, rVar, rVar, rVar);
        la.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, new m("text", xVar, (String) null, rVar, no.a.s(la.a, new u0(40)), rVar)});
        m mVar3 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        m mVar4 = new m("url", l0.b(ew.a), (String) null, rVar, rVar, rVar);
        p a2 = l0.a(la.b);
        ja.Companion.getClass();
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Repository", d0.n("Repository"), r), new n("Gist", d0.n("Gist"), l.r(new m[]{mVar3, mVar4, new m("files", a2, (String) null, rVar, no.a.s(ja.a, new u0(1)), r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        ti.Companion.getClass();
        List n2 = d0.n(new m("nodes", l0.a(ti.a), "pinnedItems", rVar, rVar, r3));
        xa.Companion.getClass();
        m mVar5 = new m("hasPinnedItems", l0.b(xa.a), (String) null, rVar, rVar, rVar);
        vi.Companion.getClass();
        r b2 = l0.b(vi.a);
        jj.Companion.getClass();
        a = l.r(new m[]{mVar5, new m("items", b2, (String) null, rVar, no.a.s(jj.a, new u0(6)), n2)});
    }
}
