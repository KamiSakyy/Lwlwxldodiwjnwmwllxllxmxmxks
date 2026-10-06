package ny;

import aaShadow.m;
import aaShadow.q0;
import aaShadow.r;
import aaShadow.s;
import aaShadow.t;
import aaShadow.u0;
import java.util.List;
import k71.k;
import m10.aaShadow;
import m10.ah;
import m10.eh;
import m10.fg0;
import m10.vp;
import rx.g;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        r b = l0.b(eh.a);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("UserList");
        List list = g.a;
        s c = no.a.c(list, "selections", "UserList", n, list);
        ah.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        fg0.Companion.getClass();
        q0 q0Var = fg0.c;
        k.g(q0Var, "type");
        List n2 = d0Shadow.n(new m("list", q0Var, (String) null, rVar, rVar, r));
        aaShadow.Companion.getClass();
        q0 q0Var2 = aaShadow.a;
        k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = d0Shadow.n(new m("createUserList", q0Var2, (String) null, rVar, no.a.s(vp.N, new u0(new t("input"))), n2));
    }
}
