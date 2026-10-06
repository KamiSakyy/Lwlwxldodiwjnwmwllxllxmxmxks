package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements aaShadow.a {
    public static final e a = new e();
    public static final List b = sy.d0.n("comment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.h hVar = null;
        while (eVar.r0(b) == 0) {
            hVar = (u10.h) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
        }
        return new u10.g(hVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.g gVar = (u10.g) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("comment");
        aa.c.b(aa.c.c(f.a, true)).b(fVar, wVar, gVar.a);
    }
}
