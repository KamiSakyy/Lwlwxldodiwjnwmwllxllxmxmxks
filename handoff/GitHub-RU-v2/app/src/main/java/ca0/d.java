package ca0;

import aa.m;
import aa.p0;
import aa.q0;
import aa.w;
import aa.w0;
import hc0.pm;
import java.util.List;
import k71.k;
import k71.x;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements w0 {
    public static final a Companion = new a();

    public final m d() {
        pm.Companion.getClass();
        q0 q0Var = pm.r;
        k.g(q0Var, "type");
        List list = ga0.a.a;
        List list2 = ga0.a.a;
        k.g(list2, "selections");
        r rVar = r.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == d.class;
    }

    public final p0 g() {
        return aa.c.c(da0.a.a, false);
    }

    public final int hashCode() {
        return x.a(d.class).hashCode();
    }

    public final String i() {
        return "cad5a3d03d0fd86abb1face200a13665cf1ac0750b98d05d479d53a8251c239d";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerId { viewer { id login __typename } }";
    }

    public final String name() {
        return "ViewerId";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k.g(wVar, "customScalarAdapters");
    }



}
