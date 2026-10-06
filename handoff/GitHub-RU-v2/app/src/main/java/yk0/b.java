package yk0;

import aa.m;
import aa.r;
import gn0.mv;
import gn0.pb;
import gn0.rb;
import gn0.s00;
import gn0.tb;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        rb.Companion.getClass();
        r b = l0.b(rb.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        pb.Companion.getClass();
        m mVar = new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar);
        mv.Companion.getClass();
        m mVar2 = new m("starredRepositories", l0.b(mv.a), (String) null, rVar, rVar, n);
        tb.Companion.getClass();
        List r = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar)});
        s00.Companion.getClass();
        a = d0Shadow.n(new m("viewer", l0.b(s00.P), (String) null, rVar, rVar, r));
    }
}
