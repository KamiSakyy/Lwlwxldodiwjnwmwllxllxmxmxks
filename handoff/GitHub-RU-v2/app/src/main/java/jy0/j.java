package jy0;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import pz0.k2;
import pz0.o7;
import pz0.pd;
import pz0.td;
import pz0.tq;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j {
    public static final List a;

    static {
        xd.Companion.getClass();
        r b = l0.b(xd.a);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        s mVar2 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        k2.Companion.getClass();
        x xVar = k2.a;
        k.g(xVar, "type");
        s mVar3 = new m("fullDatabaseId", xVar, (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        s mVar4 = new m("updatedAt", l0.b(o7.a), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        s mVar5 = new m("isArchived", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        tq.Companion.getClass();
        s mVar6 = new m("type", l0.b(tq.s), (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2Item");
        List list = xx0.e.a;
        a = l.r(new s[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, no.a.c(list, "selections", "ProjectV2Item", n, list)});
    }
}
