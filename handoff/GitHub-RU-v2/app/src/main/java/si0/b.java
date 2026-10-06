package si0;

import aa.x;
import gn0.hn;
import gn0.pb;
import gn0.r6;
import gn0.tb;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = l0.b(tb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("PullRequest");
        List list = h.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        r6.Companion.getClass();
        x xVar = r6.a;
        k71.k.g(xVar, "type");
        aa.s mVar2 = new aa.m("lastEditedAt", xVar, (String) null, rVar, rVar, rVar);
        hn.Companion.getClass();
        aa.s mVar3 = new aa.m("state", l0.b(hn.s), (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar, c, mVar2, mVar3, new aa.m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar)});
    }
}
