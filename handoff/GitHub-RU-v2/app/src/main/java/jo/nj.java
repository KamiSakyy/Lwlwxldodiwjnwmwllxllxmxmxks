package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nj implements aaShadow.w0 {
    public static final kj Companion = new kj();

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.b2.a;
        List list2 = h10.b2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == nj.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.gd.a, false);
    }

    public final int hashCode() {
        return k71.x.a(nj.class).hashCode();
    }

    public final String i() {
        return "0910a4f48d7e286538aeeb8ec3517d959959e432176b4fec581131cdae1b885c";
    }

    public final String j() {
        Companion.getClass();
        return "query Languages { programmingLanguages(suggested: true) { name color id __typename } id __typename }";
    }

    public final String name() {
        return "Languages";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
