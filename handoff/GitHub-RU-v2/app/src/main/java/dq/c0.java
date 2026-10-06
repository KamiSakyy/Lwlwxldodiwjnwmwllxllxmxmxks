package dq;

import java.util.List;
import m10.ah;
import m10.cc0;
import m10.eh;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.s mVar2 = new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("name", xVar, (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("login", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        aa.s mVar5 = new aa.m("url", v8.l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        aa.s mVar6 = new aa.m("description", xVar, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.s mVar7 = new aa.m("viewerIsFollowing", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.b.a;
        a = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, no.a.c(list, "selections", "Actor", r, list)});
    }
}
