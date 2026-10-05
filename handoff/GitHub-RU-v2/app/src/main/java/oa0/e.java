package oa0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements aa.a {
    public static final e a = new e();
    public static final List b = sy.d0.o("viewer", "repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        na0.j jVar = null;
        na0.i iVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                jVar = (na0.j) aa.c.c(g.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                iVar = (na0.i) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
            }
        }
        if (jVar != null) {
            return new na0.h(jVar, iVar);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        na0.h hVar = (na0.h) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("viewer");
        aa.c.c(g.a, false).b(fVar, wVar, hVar.a);
        fVar.z0("repository");
        aa.c.b(aa.c.c(f.a, true)).b(fVar, wVar, hVar.b);
    }
}
