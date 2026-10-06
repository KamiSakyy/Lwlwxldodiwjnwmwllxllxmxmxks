package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bl implements aaShadow.a {
    public static final bl a = new bl();
    public static final List b = sy.d0Shadow.n("subject");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.nu nuVar = null;
        while (eVar.r0(b) == 0) {
            nuVar = (jn0.nu) aa.c.b(aa.c.c(cl.a, true)).a(eVar, wVar);
        }
        return new jn0.mu(nuVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.mu muVar = (jn0.mu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(muVar, "value");
        fVar.z0("subject");
        aa.c.b(aa.c.c(cl.a, true)).b(fVar, wVar, muVar.a);
    }
}
