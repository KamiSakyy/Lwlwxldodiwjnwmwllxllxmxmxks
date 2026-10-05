package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f70 implements aa.w0 {
    public static final c70 Companion = new c70();

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.m5.a;
        List list2 = h10.m5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == f70.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.cu.a, false);
    }

    public final int hashCode() {
        return k71.x.a(f70.class).hashCode();
    }

    public final String i() {
        return "969712a6afa3d0bd912c093d2785fd38541dacb48c2132036c272d9a4b9b513c";
    }

    public final String j() {
        Companion.getClass();
        return "query SpokenLanguages { spokenLanguages { name code } id __typename }";
    }

    public final String name() {
        return "SpokenLanguages";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
