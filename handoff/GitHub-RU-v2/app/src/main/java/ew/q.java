package ew;

import aa.x;
import java.util.List;
import m10.ah;
import m10.cc0;
import m10.eh;
import m10.l40;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class q {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        aa.s mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.b.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Actor", r, list)});
        aa.m mVar4 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        aa.m mVar6 = new aa.m("url", l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar4, mVar5, mVar6, new aa.m("owner", l0.b(l40.e), (String) null, rVar, rVar, r2), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
