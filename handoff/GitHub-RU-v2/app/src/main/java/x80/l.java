package x80;

import aa.r;
import aa.s;
import aa.x;
import hc0.bb;
import hc0.dq;
import hc0.ew;
import hc0.fb;
import java.util.List;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        s mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar3 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.b.a;
        List r2 = x61.l.r(new s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Actor", r, list)});
        aa.m mVar4 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        aa.m mVar6 = new aa.m("url", l0.b(ew.a), (String) null, rVar, rVar, rVar);
        dq.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar4, mVar5, mVar6, new aa.m("owner", l0.b(dq.a), (String) null, rVar, rVar, r2), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
