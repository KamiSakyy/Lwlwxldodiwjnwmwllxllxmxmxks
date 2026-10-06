package dq;

import aa.u0;
import java.util.List;
import m10.ah;
import m10.cc0;
import m10.eh;
import m10.fg0;
import m10.hg0;
import m10.i30;
import m10.l40;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("name", xVar, (String) null, rVar, rVar, rVar)});
        List r2 = x61.l.r(new aa.m[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("name", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("login", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        aa.x xVar3 = cc0.a;
        aa.s mVar5 = new aa.m("url", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List r3 = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.b.a;
        List r4 = x61.l.r(new aa.s[]{mVar2, mVar3, mVar4, mVar5, no.a.c(list, "selections", "Actor", r3, list), new aa.n("User", sy.d0Shadow.n("User"), r), new aa.n("Organization", sy.d0Shadow.n("Organization"), r2)});
        List r5 = x61.l.r(new aa.m[]{new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        fg0.Companion.getClass();
        List n = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(fg0.c), (String) null, rVar, rVar, r5));
        aa.m mVar6 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar8 = new aa.m("url", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        aa.m mVar9 = new aa.m("owner", v8.l0.b(l40.e), (String) null, rVar, rVar, r4);
        wg.Companion.getClass();
        aa.m mVar10 = new aa.m("usesCustomOpenGraphImage", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar);
        aa.m mVar11 = new aa.m("openGraphImageUrl", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        hg0.Companion.getClass();
        aa.r b2 = v8.l0.b(hg0.a);
        i30.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, new aa.m("lists", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(i30.w, new u0(100)), new aa.k(i30.x, new u0(Boolean.TRUE))}), n), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
