package br0;

import aa.a0;
import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import pz0.o7;
import pz0.pd;
import pz0.td;
import pz0.va;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        td.Companion.getClass();
        r b = l0.b(td.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar = pd.a;
        m mVar2 = new m("closed", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("viewerCanClose", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("viewerCanReopen", l0.b(xVar), (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        x xVar2 = o7.a;
        k.g(xVar2, "type");
        m mVar5 = new m("closedAt", xVar2, (String) null, rVar, rVar, rVar);
        va.Companion.getClass();
        a0 a0Var = va.s;
        k.g(a0Var, "type");
        m mVar6 = new m("stateReason", a0Var, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, new m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
    }
}
