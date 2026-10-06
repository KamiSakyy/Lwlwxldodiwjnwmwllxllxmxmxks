package ew;

import aa.x;
import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.ja0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class t {
    public static final List a;

    static {
        ch.Companion.getClass();
        x xVar = ch.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        List r = x61.l.r(new aa.m[]{new aa.m("total", b, (String) null, rVar, rVar, rVar), new aa.m("completed", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ah.Companion.getClass();
        aa.m mVar = new aa.m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        ja0.Companion.getClass();
        aa.m mVar2 = new aa.m("subIssuesSummary", l0.b(ja0.a), (String) null, rVar, rVar, r);
        eh.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", l0.b(eh.a), (String) null, rVar, rVar, rVar)});
    }
}
