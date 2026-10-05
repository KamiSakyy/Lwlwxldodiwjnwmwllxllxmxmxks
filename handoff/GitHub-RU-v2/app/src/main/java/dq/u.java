package dq;

import java.util.List;
import m10.co;
import m10.eh;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class u {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("MobileCopilotFeatureComparisonSubsectionItem");
        List list = y.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "MobileCopilotFeatureComparisonSubsectionItem", n, list)});
        aa.m mVar2 = new aa.m("title", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        co.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar2, new aa.m("planRows", no.a.d(co.a), (String) null, rVar, rVar, r)});
    }
}
