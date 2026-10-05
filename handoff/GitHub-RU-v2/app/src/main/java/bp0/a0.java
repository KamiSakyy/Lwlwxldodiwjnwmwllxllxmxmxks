package bp0;

import aa.u0;
import java.util.List;
import pz0.h50;
import pz0.jx;
import pz0.k90;
import pz0.m90;
import pz0.ny;
import pz0.pd;
import pz0.td;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a0 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("name", xVar, (String) null, rVar, rVar, rVar)});
        List r2 = x61.l.r(new aa.m[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("name", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.x xVar3 = h50.a;
        aa.s mVar5 = new aa.m("url", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List r3 = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.b.a;
        List r4 = x61.l.r(new aa.s[]{mVar2, mVar3, mVar4, mVar5, no.a.c(list, "selections", "Actor", r3, list), new aa.n("User", sy.d0.n("User"), r), new aa.n("Organization", sy.d0.n("Organization"), r2)});
        List r5 = x61.l.r(new aa.m[]{new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        k90.Companion.getClass();
        List n = sy.d0.n(new aa.m("nodes", l0.a(k90.c), (String) null, rVar, rVar, r5));
        aa.m mVar6 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar8 = new aa.m("url", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        ny.Companion.getClass();
        aa.m mVar9 = new aa.m("owner", l0.b(ny.e), (String) null, rVar, rVar, r4);
        pd.Companion.getClass();
        aa.m mVar10 = new aa.m("usesCustomOpenGraphImage", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        aa.m mVar11 = new aa.m("openGraphImageUrl", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m90.Companion.getClass();
        aa.r b2 = l0.b(m90.a);
        jx.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, new aa.m("lists", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(jx.z, new u0(100)), new aa.k(jx.A, new u0(Boolean.TRUE))}), n), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
