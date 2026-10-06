package fr0;

import aa.m;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.ja;
import pz0.la;
import pz0.td;
import pz0.vd;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("DiscussionComment");
        List list = d.a;
        s c = no.a.c(list, "selections", "DiscussionComment", n, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        vd.Companion.getClass();
        m mVar2 = new m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        ja.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, new m("nodes", l0.a(ja.c), (String) null, rVar, rVar, r)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        la.Companion.getClass();
        a = l.r(new m[]{mVar3, new m("replies", l0.b(la.a), (String) null, rVar, no.a.s(ja.b, new u0(new t("previewCount"))), r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
