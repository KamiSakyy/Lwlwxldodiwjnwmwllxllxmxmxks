package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q10 implements aaShadow.w0 {
    public static final n10 Companion = new n10();

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.v4.a;
        List list2 = en0.v4.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == q10.class;
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.vp.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(q10.class).hashCode();
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
