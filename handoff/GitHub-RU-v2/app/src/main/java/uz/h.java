package uz;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.pt;
import m10.ww;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2SingleSelectFieldOption");
        List list = k.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2SingleSelectFieldOption", n, list)});
        ah.Companion.getClass();
        m mVar2 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        x xVar2 = ch.a;
        k71.k.g(xVar2, "type");
        m mVar3 = new m("databaseId", xVar2, (String) null, rVar, rVar, rVar);
        m mVar4 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        pt.Companion.getClass();
        m mVar5 = new m("dataType", l0.b(pt.s), (String) null, rVar, rVar, rVar);
        ww.Companion.getClass();
        a = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, new m("options", no.a.d(ww.a), (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
