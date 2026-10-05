package ox;

import aa.m;
import aa.p0;
import aa.q0;
import aa.w;
import aa.w0;
import java.util.List;
import k71.k;
import k71.x;
import m10.p00;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements w0 {
    public static final a Companion = new a();

    public final m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k.g(q0Var, "type");
        List list = sx.a.a;
        List list2 = sx.a.a;
        k.g(list2, "selections");
        r rVar = r.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == d.class;
    }

    public final p0 g() {
        return aa.c.c(px.a.a, false);
    }

    public final int hashCode() {
        return x.a(d.class).hashCode();
    }

    public final String i() {
        return "65b5d56eecd155279a3154d5dc2616b7971d591f06d8196217a0d05c058c4a25";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerId { viewer { id login __typename } id __typename }";
    }

    public final String name() {
        return "ViewerId";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k.g(wVar, "customScalarAdapters");
    }
}
