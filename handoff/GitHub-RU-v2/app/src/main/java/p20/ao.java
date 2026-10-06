package p20;

import java.util.List;
import u10.cz;
import u10.gz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ao implements aaShadow.a {
    public static final ao a = new ao();
    public static final List b = sy.d0Shadow.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        gz gzVar = null;
        while (eVar.r0(b) == 0) {
            gzVar = (gz) aa.c.c(fo.a, false).a(eVar, wVar);
        }
        if (gzVar != null) {
            return new cz(gzVar);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        cz czVar = (cz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(czVar, "value");
        fVar.z0("viewer");
        aa.c.c(fo.a, false).b(fVar, wVar, czVar.a);
    }
}
