package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class qe implements aa.a {
    public static final List a = sy.d0.n("mentionableItems");

    public static jn0.ul c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ll llVar = null;
        while (eVar.r0(a) == 0) {
            llVar = (jn0.ll) aa.c.b(aa.c.c(he.a, false)).a(eVar, wVar);
        }
        return new jn0.ul(llVar);
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.ul ulVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ulVar, "value");
        fVar.z0("mentionableItems");
        aa.c.b(aa.c.c(he.a, false)).b(fVar, wVar, ulVar.a);
    }
}
