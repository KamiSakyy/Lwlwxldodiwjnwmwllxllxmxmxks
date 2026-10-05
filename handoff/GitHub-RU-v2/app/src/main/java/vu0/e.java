package vu0;

import aa.a0;
import aa.q0;
import aa.x;
import java.util.List;
import pz0.bf;
import pz0.df;
import pz0.jx;
import pz0.le;
import pz0.ny;
import pz0.td;
import pz0.vd;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e {
    public static final List a;

    static {
        td.Companion.getClass();
        x xVar = td.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ny.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, new aa.m("owner", l0.b(ny.e), (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("title", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar6 = new aa.m("titleHTML", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        aa.m mVar7 = new aa.m("number", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        jx.Companion.getClass();
        aa.m mVar8 = new aa.m("repository", l0.b(jx.t0), (String) null, rVar, rVar, r2);
        df.Companion.getClass();
        a0 a0Var = df.s;
        k71.k.g(a0Var, "type");
        aa.m mVar9 = new aa.m("stateReason", a0Var, (String) null, rVar, rVar, rVar);
        bf.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, new aa.m("state", l0.b(bf.s), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        le.Companion.getClass();
        q0 q0Var = le.A;
        k71.k.g(q0Var, "type");
        a = x61.l.r(new aa.m[]{new aa.m("parent", q0Var, (String) null, rVar, rVar, r3), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
