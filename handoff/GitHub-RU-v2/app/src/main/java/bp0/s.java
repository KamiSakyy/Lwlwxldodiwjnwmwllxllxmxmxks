package bp0;

import java.util.List;
import pz0.aw;
import pz0.o7;
import pz0.pd;
import pz0.td;
import pz0.w80;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.a.a;
        aa.s c = no.a.c(list, "selections", "Actor", r, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r2 = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Release");
        List list2 = x.a;
        List r3 = x61.l.r(new aa.s[]{mVar2, no.a.c(list2, "selections", "Release", n, list2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        w80.Companion.getClass();
        aa.m mVar3 = new aa.m("actor", l0.b(w80.W), (String) null, rVar, rVar, r2);
        o7.Companion.getClass();
        aa.m mVar4 = new aa.m("createdAt", l0.b(o7.a), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.m mVar5 = new aa.m("dismissable", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        aa.m mVar6 = new aa.m("identifier", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aw.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar3, mVar4, mVar5, mVar6, new aa.m("release", l0.b(aw.e), (String) null, rVar, rVar, r3)});
    }
}
