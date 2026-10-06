package ew;

import aa.x;
import java.util.List;
import m10.ah;
import m10.at;
import m10.eh;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2");
        List list = uz.i.a;
        aa.s c = no.a.c(list, "selections", "ProjectV2", n, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        at.Companion.getClass();
        aa.s mVar3 = new aa.m("project", l0.b(at.d), (String) null, rVar, rVar, r);
        List n2 = d0Shadow.n("ProjectV2Item");
        List list2 = g00.j.a;
        a = x61.l.r(new aa.s[]{mVar2, mVar3, no.a.c(list2, "selections", "ProjectV2Item", n2, list2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
