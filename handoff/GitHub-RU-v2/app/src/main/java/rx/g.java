package rx;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.lg0;
import m10.wg;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g {
    public static final List a;

    static {
        ch.Companion.getClass();
        r b = l0.b(ch.a);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        ah.Companion.getClass();
        m mVar = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar = eh.a;
        m mVar2 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        m mVar3 = new m("isPrivate", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        lg0.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("items", l0.b(lg0.a), (String) null, rVar, rVar, n), new m("slug", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
