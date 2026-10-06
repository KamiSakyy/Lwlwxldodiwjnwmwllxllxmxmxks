package g00;

import aa.k;
import aa.m;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.at;
import m10.ct;
import m10.eh;
import m10.wh;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2");
        List list = uz.j.a;
        s c = no.a.c(list, "selections", "ProjectV2", n, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        at.Companion.getClass();
        List n2 = d0Shadow.n(new m("nodes", l0.a(at.d), (String) null, rVar, rVar, r));
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ct.Companion.getClass();
        r b2 = l0.b(ct.a);
        wh.Companion.getClass();
        a = l.r(new m[]{mVar2, mVar3, new m("projectsV2", b2, (String) null, rVar, l.r(new k[]{new k(wh.o, new u0((Object) null)), new k(wh.p, new u0(5))}), n2)});
    }
}
