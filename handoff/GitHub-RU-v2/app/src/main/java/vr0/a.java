package vr0;

import aa.m;
import aa.r;
import java.util.List;
import pz0.re;
import pz0.td;
import pz0.vd;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        vd.Companion.getClass();
        r b = l0.b(vd.a);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        td.Companion.getClass();
        m mVar = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        re.Companion.getClass();
        m mVar2 = new m("comments", l0.b(re.a), (String) null, rVar, rVar, n);
        xd.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
    }
}
