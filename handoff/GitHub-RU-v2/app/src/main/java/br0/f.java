package br0;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import pz0.jx;
import pz0.ny;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        td.Companion.getClass();
        x xVar = td.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List r = l.r(new m[]{mVar, new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ny.Companion.getClass();
        m mVar4 = new m("owner", l0.b(ny.e), (String) null, rVar, rVar, r);
        pd.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, mVar4, new m("isOrganizationDiscussionRepository", l0.b(pd.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        m mVar6 = new m("number", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        jx.Companion.getClass();
        a = l.r(new m[]{mVar5, mVar6, new m("repository", l0.b(jx.t0), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
