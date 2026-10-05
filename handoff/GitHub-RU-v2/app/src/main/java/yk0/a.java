package yk0;

import aa.m;
import aa.r;
import aa.x;
import gn0.pb;
import gn0.s00;
import gn0.tb;
import java.util.List;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        pb.Companion.getClass();
        r b = l0.b(pb.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar = tb.a;
        List r = l.r(new m[]{mVar, new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s00.Companion.getClass();
        a = d0.n(new m("viewer", l0.b(s00.P), (String) null, rVar, rVar, r));
    }
}
