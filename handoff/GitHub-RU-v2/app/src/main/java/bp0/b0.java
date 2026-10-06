package bp0;

import java.util.List;
import pz0.jx;
import pz0.o7;
import pz0.pd;
import pz0.td;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b0 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Repository");
        List list = z.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        td.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", l0.b(td.a), (String) null, rVar, rVar, rVar)});
        o7.Companion.getClass();
        aa.m mVar2 = new aa.m("createdAt", l0.b(o7.a), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.m mVar3 = new aa.m("dismissable", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("identifier", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("reason", l0.b(xVar), (String) null, rVar, rVar, rVar);
        jx.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, mVar5, new aa.m("repository", l0.b(jx.t0), (String) null, rVar, rVar, r)});
    }
}
