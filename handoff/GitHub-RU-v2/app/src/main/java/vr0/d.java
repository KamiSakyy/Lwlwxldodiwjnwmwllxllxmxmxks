package vr0;

import aa.a0;
import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import pz0.bf;
import pz0.df;
import pz0.h50;
import pz0.jx;
import pz0.ny;
import pz0.td;
import pz0.vd;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        td.Companion.getClass();
        x xVar = td.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List r = l.r(new m[]{mVar, new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ny.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, new m("owner", l0.b(ny.e), (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        bf.Companion.getClass();
        m mVar5 = new m("state", l0.b(bf.s), "issueState", rVar, rVar, rVar);
        m mVar6 = new m("title", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        m mVar7 = new m("url", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        m mVar8 = new m("number", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        jx.Companion.getClass();
        m mVar9 = new m("repository", l0.b(jx.t0), (String) null, rVar, rVar, r2);
        df.Companion.getClass();
        a0 a0Var = df.s;
        k.g(a0Var, "type");
        a = l.r(new m[]{mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, new m("stateReason", a0Var, (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
