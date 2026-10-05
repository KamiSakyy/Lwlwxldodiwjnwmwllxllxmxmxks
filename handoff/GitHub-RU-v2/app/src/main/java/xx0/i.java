package xx0;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import pz0.h50;
import pz0.o7;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        s mVar2 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        s mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        s mVar4 = new m("updatedAt", l0.b(o7.a), (String) null, rVar, rVar, rVar);
        s mVar5 = new m("shortDescription", xVar, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar2 = pd.a;
        s mVar6 = new m("public", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        s mVar7 = new m("number", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        s mVar8 = new m("viewerCanUpdate", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar9 = new m("useElasticsearch", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        s mVar10 = new m("url", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2");
        List list = c.a;
        a = l.r(new s[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, no.a.c(list, "selections", "ProjectV2", n, list)});
    }
}
