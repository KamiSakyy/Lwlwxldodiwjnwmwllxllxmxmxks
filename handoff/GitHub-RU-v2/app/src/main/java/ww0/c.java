package ww0;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.k90;
import pz0.su;
import pz0.td;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        td.Companion.getClass();
        x xVar = td.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List r = l.r(new m[]{mVar, new m("slug", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("description", xVar2, (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        k90.Companion.getClass();
        q0 q0Var = k90.c;
        k.g(q0Var, "type");
        su.Companion.getClass();
        a = l.r(new m[]{new m("list", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(su.g, new u0(new t("login"))), new aa.k(su.h, new u0(new t("slug")))}), r), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
