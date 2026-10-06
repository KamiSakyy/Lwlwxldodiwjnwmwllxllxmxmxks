package by0;

import aa.k;
import aa.m;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.no;
import pz0.xd;
import pz0.xr;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2ViewItemConnection");
        List list = b.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2ViewItemConnection", n, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar3 = new m("viewGroupId", xVar, (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("ProjectV2Group");
        List list2 = a.a;
        s c = no.a.c(list2, "selections", "ProjectV2Group", n2, list2);
        xr.Companion.getClass();
        r b2 = l0.b(xr.a);
        no.Companion.getClass();
        a = l.r(new s[]{mVar2, mVar3, c, new m("items", b2, (String) null, rVar, l.r(new k[]{new k(no.a, new u0((Object) null)), new k(no.b, new u0(20))}), r)});
    }
}
