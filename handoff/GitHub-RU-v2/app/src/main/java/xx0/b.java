package xx0;

import aa.m;
import aa.r;
import aa.s;
import java.util.List;
import pz0.go;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        xd.Companion.getClass();
        r b = l0.b(xd.a);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2Field");
        List list = d.a;
        s c = no.a.c(list, "selections", "ProjectV2Field", n, list);
        List n2 = d0Shadow.n("ProjectV2SingleSelectField");
        List list2 = h.a;
        s c2 = no.a.c(list2, "selections", "ProjectV2SingleSelectField", n2, list2);
        List n3 = d0Shadow.n("ProjectV2IterationField");
        List list3 = f.a;
        List r = l.r(new s[]{mVar, c, c2, no.a.c(list3, "selections", "ProjectV2IterationField", n3, list3)});
        go.Companion.getClass();
        a = d0Shadow.n(new m("nodes", l0.a(go.a), (String) null, rVar, rVar, r));
    }
}
