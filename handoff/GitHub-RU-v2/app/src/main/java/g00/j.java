package g00;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.ew;
import m10.sa;
import m10.wg;
import m10.x2;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j {
    public static final List a;

    static {
        eh.Companion.getClass();
        r b = l0.b(eh.a);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        s mVar2 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        x2.Companion.getClass();
        x xVar = x2.a;
        k.g(xVar, "type");
        s mVar3 = new m("fullDatabaseId", xVar, (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        s mVar4 = new m("updatedAt", l0.b(sa.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        s mVar5 = new m("isArchived", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        s mVar6 = new m("type", l0.b(ew.s), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2Item");
        List list = uz.e.a;
        a = l.r(new s[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, no.a.c(list, "selections", "ProjectV2Item", n, list)});
    }
}
