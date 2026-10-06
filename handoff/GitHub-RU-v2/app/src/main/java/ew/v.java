package ew;

import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.fg0;
import m10.hg0;
import m10.i30;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("UserList");
        List list = rx.g.a;
        aa.s c = no.a.c(list, "selections", "UserList", n, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        fg0.Companion.getClass();
        List n2 = d0Shadow.n(new aa.m("nodes", l0.a(fg0.c), (String) null, rVar, rVar, r));
        aa.m mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hg0.Companion.getClass();
        aa.r b2 = l0.b(hg0.a);
        i30.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar2, new aa.m("lists", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(i30.w, new u0(100)), new aa.k(i30.x, new u0(Boolean.TRUE))}), n2), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
