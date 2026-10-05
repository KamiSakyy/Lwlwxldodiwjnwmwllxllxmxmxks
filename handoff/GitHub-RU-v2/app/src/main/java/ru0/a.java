package ru0;

import aa.j0;
import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import pz0.jd;
import pz0.jx;
import pz0.ld;
import pz0.td;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        td.Companion.getClass();
        x xVar = td.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        ld.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("oid", l0.b(ld.a), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List r2 = l.r(new m[]{mVar2, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        jd.Companion.getClass();
        j0 j0Var = jd.a;
        k.g(j0Var, "type");
        m mVar5 = new m("target", j0Var, (String) null, rVar, rVar, r);
        jx.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, new m("repository", l0.b(jx.t0), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
