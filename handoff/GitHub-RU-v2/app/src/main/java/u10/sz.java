package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sz implements aa.w0 {
    public static final pz Companion = new pz();

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.o4.a;
        List list2 = fc0.o4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == sz.class;
    }

    public final aa.p0 g() {
        return aa.c.c(p20.lo.a, false);
    }

    public final int hashCode() {
        return k71.x.a(sz.class).hashCode();
    }

    public final String i() {
        return "11139df6b7ce63b0abf254d52054ea7336906a557f8b0021853456bb75ee512b";
    }

    public final String j() {
        Companion.getClass();
        return "query SpokenLanguages { spokenLanguages { name code } }";
    }

    public final String name() {
        return "SpokenLanguages";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
