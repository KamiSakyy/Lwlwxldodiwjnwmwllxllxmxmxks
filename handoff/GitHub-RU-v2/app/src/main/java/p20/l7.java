package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l7 implements aaShadow.a {
    public static final l7 a = new l7();
    public static final List b = sy.d0Shadow.o("repository", "search");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.jb jbVar = null;
        u10.kb kbVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                jbVar = (u10.jb) aa.c.b(aa.c.c(o7.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                kbVar = (u10.kb) aa.c.c(p7.a, false).a(eVar, wVar);
            }
        }
        if (kbVar != null) {
            return new u10.gb(jbVar, kbVar);
        }
        k41.b.B(eVar, "search");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.gb gbVar = (u10.gb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gbVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(o7.a, false)).b(fVar, wVar, gbVar.a);
        fVar.z0("search");
        aa.c.c(p7.a, false).b(fVar, wVar, gbVar.b);
    }
}
