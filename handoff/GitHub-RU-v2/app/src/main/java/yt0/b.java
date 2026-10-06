package yt0;

import aa.x;
import java.util.List;
import pz0.gu;
import pz0.o7;
import pz0.td;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = l0.b(xd.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("PullRequest");
        List list = h.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        o7.Companion.getClass();
        x xVar = o7.a;
        k71.k.g(xVar, "type");
        aa.s mVar2 = new aa.m("lastEditedAt", xVar, (String) null, rVar, rVar, rVar);
        gu.Companion.getClass();
        aa.s mVar3 = new aa.m("state", l0.b(gu.s), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar, c, mVar2, mVar3, new aa.m("id", l0.b(td.a), (String) null, rVar, rVar, rVar)});
    }
}
