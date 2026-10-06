package uz;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.eh;
import m10.sa;
import m10.wg;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        s mVar2 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        s mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        s mVar4 = new m("updatedAt", l0.b(sa.a), (String) null, rVar, rVar, rVar);
        s mVar5 = new m("shortDescription", xVar, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar2 = wg.a;
        s mVar6 = new m("public", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        s mVar7 = new m("number", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        s mVar8 = new m("viewerCanUpdate", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar9 = new m("useElasticsearch", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        s mVar10 = new m("url", l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2");
        List list = c.a;
        a = l.r(new s[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, no.a.c(list, "selections", "ProjectV2", n, list)});
    }
}
