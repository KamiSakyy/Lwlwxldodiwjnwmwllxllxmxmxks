package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xf implements aaShadow.w0 {
    public static final uf Companion = new uf();

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.o1.a;
        List list2 = fc0.o1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == xf.class;
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ra.a, false);
    }

    public final int hashCode() {
        return k71.x.a(xf.class).hashCode();
    }

    public final String i() {
        return "e66bdf26672fa9c70959630842f91dcaec3b312e023c5fbc72f5fa43a8359b7e";
    }

    public final String j() {
        Companion.getClass();
        return "query Languages { programmingLanguages(suggested: true) { name color id __typename } }";
    }

    public final String name() {
        return "Languages";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
