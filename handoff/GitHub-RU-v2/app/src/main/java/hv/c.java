package hv;

import aa.x;
import java.util.List;
import m10.ah;
import m10.b00;
import m10.eh;
import m10.sa;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = l0.b(eh.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("PullRequest");
        List list = i.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        sa.Companion.getClass();
        x xVar = sa.a;
        k71.k.g(xVar, "type");
        aa.s mVar2 = new aa.m("lastEditedAt", xVar, (String) null, rVar, rVar, rVar);
        b00.Companion.getClass();
        aa.s mVar3 = new aa.m("state", l0.b(b00.s), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar, c, mVar2, mVar3, new aa.m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar)});
    }
}
