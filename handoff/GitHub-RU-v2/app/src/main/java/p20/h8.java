package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h8 implements aa.a {
    public static final h8 a = new h8();
    public static final List b = sy.d0.o("extension", "fileType");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.nc ncVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new u10.mc(str, ncVar);
                }
                ncVar = (u10.nc) aa.c.b(aa.c.c(i8.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.mc mcVar = (u10.mc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mcVar, "value");
        fVar.z0("extension");
        aa.c.i.b(fVar, wVar, mcVar.a);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(i8.a, true)).b(fVar, wVar, mcVar.b);
    }
}
