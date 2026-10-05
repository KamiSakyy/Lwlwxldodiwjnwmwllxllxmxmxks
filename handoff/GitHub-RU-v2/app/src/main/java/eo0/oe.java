package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class oe implements aa.a {
    public static final List a = sy.d0.n("mentionableItems");

    public static jn0.sl c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ml mlVar = null;
        while (eVar.r0(a) == 0) {
            mlVar = (jn0.ml) aa.c.b(aa.c.c(ie.a, false)).a(eVar, wVar);
        }
        return new jn0.sl(mlVar);
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.sl slVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(slVar, "value");
        fVar.z0("mentionableItems");
        aa.c.b(aa.c.c(ie.a, false)).b(fVar, wVar, slVar.a);
    }
}
