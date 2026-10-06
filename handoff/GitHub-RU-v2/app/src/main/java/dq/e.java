package dq;

import java.util.List;
import m10.ah;
import m10.cc0;
import m10.eh;
import m10.fd;
import m10.rf0;
import m10.sa;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e {
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
        List n = sy.d0.n("Discussion");
        List list2 = i.a;
        List r3 = x61.l.r(new aa.s[]{mVar2, no.a.c(list2, "selections", "Discussion", n, list2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        aa.m mVar3 = new aa.m("actor", v8.l0.b(rf0.g0), (String) null, rVar, rVar, r2);
        sa.Companion.getClass();
        aa.m mVar4 = new aa.m("createdAt", v8.l0.b(sa.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.m mVar5 = new aa.m("dismissable", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar);
        aa.m mVar6 = new aa.m("identifier", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        aa.x xVar3 = cc0.a;
        k71.k.g(xVar3, "type");
        aa.m mVar7 = new aa.m("previewImageUrl", xVar3, (String) null, rVar, rVar, rVar);
        fd.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar3, mVar4, mVar5, mVar6, mVar7, new aa.m("discussion", v8.l0.b(fd.l), (String) null, rVar, rVar, r3)});
    }
    public Object e(Object p1) { return null; }
    public Object e(Object p1) { return null; }
}
