package zf0;

import aa.m;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.i9;
import gn0.k9;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("DiscussionComment");
        List list = d.a;
        s c = no.a.c(list, "selections", "DiscussionComment", n, list);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        rb.Companion.getClass();
        m mVar2 = new m("totalCount", l0.b(rb.a), (String) null, rVar, rVar, rVar);
        i9.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, new m("nodes", l0.a(i9.c), (String) null, rVar, rVar, r)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        k9.Companion.getClass();
        a = l.r(new m[]{mVar3, new m("replies", l0.b(k9.a), (String) null, rVar, no.a.s(i9.b, new u0(new t("previewCount"))), r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
