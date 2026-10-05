package aw;

import aa.j0;
import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.qg;
import m10.sg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        sg.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("oid", l0.b(sg.a), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r2 = l.r(new m[]{mVar2, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        qg.Companion.getClass();
        j0 j0Var = qg.a;
        k.g(j0Var, "type");
        m mVar5 = new m("target", j0Var, (String) null, rVar, rVar, r);
        i30.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, new m("repository", l0.b(i30.w0), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
