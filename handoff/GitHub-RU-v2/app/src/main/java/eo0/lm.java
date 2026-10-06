package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class lm implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("stargazers");

    public static jn0.kw c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.mw mwVar = null;
        while (eVar.r0(a) == 0) {
            mwVar = (jn0.mw) aa.c.c(nm.a, false).a(eVar, wVar);
        }
        if (mwVar != null) {
            return new jn0.kw(mwVar);
        }
        k41.b.B(eVar, "stargazers");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.kw kwVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kwVar, "value");
        fVar.z0("stargazers");
        aa.c.c(nm.a, false).b(fVar, wVar, kwVar.a);
    }
}
