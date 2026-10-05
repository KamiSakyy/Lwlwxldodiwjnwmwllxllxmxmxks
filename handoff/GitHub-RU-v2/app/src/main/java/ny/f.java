package ny;

import aa.k;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import aa.x0;
import ew.v;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.fg0;
import m10.hg0;
import m10.jg0;
import m10.nf0;
import m10.rf0;
import m10.vp;
import rx.g;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("Repository");
        List list = v.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "Repository", n, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("UserList");
        List list2 = g.a;
        s c = no.a.c(list2, "selections", "UserList", n2, list2);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        fg0.Companion.getClass();
        List n3 = d0.n(new m("nodes", l0.a(fg0.c), (String) null, rVar, rVar, r2));
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hg0.Companion.getClass();
        r b2 = l0.b(hg0.a);
        rf0.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("lists", b2, (String) null, rVar, l.r(new k[]{new k(rf0.m, new u0((Object) null)), new k(rf0.n, new u0(100))}), n3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        jg0.Companion.getClass();
        x0 x0Var = jg0.a;
        k71.k.g(x0Var, "type");
        m mVar4 = new m("item", x0Var, (String) null, rVar, rVar, r);
        q0 q0Var = rf0.g0;
        k71.k.g(q0Var, "type");
        List r4 = l.r(new m[]{mVar4, new m("user", q0Var, (String) null, rVar, rVar, r3)});
        nf0.Companion.getClass();
        q0 q0Var2 = nf0.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = d0.n(new m("updateUserListsForItem", q0Var2, (String) null, rVar, no.a.s(vp.y1, new u0(new t("input"))), r4));
    }
}
