package dq;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.rf0;
import m10.sa;
import m10.wg;
import m10.x10;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class z {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        aa.s c = no.a.c(list, "selections", "Actor", r, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r2 = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Release");
        List list2 = e0.a;
        List r3 = x61.l.r(new aa.s[]{mVar2, no.a.c(list2, "selections", "Release", n, list2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        aa.m mVar3 = new aa.m("actor", v8.l0.b(rf0.g0), (String) null, rVar, rVar, r2);
        sa.Companion.getClass();
        aa.m mVar4 = new aa.m("createdAt", v8.l0.b(sa.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.m mVar5 = new aa.m("dismissable", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar);
        aa.m mVar6 = new aa.m("identifier", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        x10.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar3, mVar4, mVar5, mVar6, new aa.m("release", v8.l0.b(x10.e), (String) null, rVar, rVar, r3)});
    }
}
