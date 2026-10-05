package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class pe implements aa.a {
    public static final List a = sy.d0.n("mentionableItems");

    public static jn0.tl c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.nl nlVar = null;
        while (eVar.r0(a) == 0) {
            nlVar = (jn0.nl) aa.c.b(aa.c.c(je.a, false)).a(eVar, wVar);
        }
        return new jn0.tl(nlVar);
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.tl tlVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tlVar, "value");
        fVar.z0("mentionableItems");
        aa.c.b(aa.c.c(je.a, false)).b(fVar, wVar, tlVar.a);
    }
}
