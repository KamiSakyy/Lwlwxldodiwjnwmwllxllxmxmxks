package xx0;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import pz0.ko;
import pz0.lr;
import pz0.td;
import pz0.vd;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2SingleSelectFieldOption");
        List list = k.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2SingleSelectFieldOption", n, list)});
        td.Companion.getClass();
        m mVar2 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        x xVar2 = vd.a;
        k71.k.g(xVar2, "type");
        m mVar3 = new m("databaseId", xVar2, (String) null, rVar, rVar, rVar);
        m mVar4 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ko.Companion.getClass();
        m mVar5 = new m("dataType", l0.b(ko.s), (String) null, rVar, rVar, rVar);
        lr.Companion.getClass();
        a = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, new m("options", no.a.d(lr.a), (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
