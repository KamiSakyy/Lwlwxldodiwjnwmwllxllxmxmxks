package a80;

import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.fm;
import hc0.h6;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = l0.b(fb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("PullRequest");
        List list = h.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        h6.Companion.getClass();
        x xVar = h6.a;
        k71.k.g(xVar, "type");
        aa.s mVar2 = new aa.m("lastEditedAt", xVar, (String) null, rVar, rVar, rVar);
        fm.Companion.getClass();
        aa.s mVar3 = new aa.m("state", l0.b(fm.s), (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar, c, mVar2, mVar3, new aa.m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar)});
    }
}
