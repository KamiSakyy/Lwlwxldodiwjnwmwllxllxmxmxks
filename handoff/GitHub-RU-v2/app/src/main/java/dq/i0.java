package dq;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.sa;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Repository");
        List list = g0.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        ah.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        sa.Companion.getClass();
        aa.m mVar2 = new aa.m("createdAt", v8.l0.b(sa.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.m mVar3 = new aa.m("dismissable", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("identifier", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("reason", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        i30.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, mVar5, new aa.m("repository", v8.l0.b(i30.w0), (String) null, rVar, rVar, r)});
    }
}
