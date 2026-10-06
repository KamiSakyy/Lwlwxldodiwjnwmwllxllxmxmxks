package p20;

import java.util.List;
import u10.jz;
import u10.nz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class go implements aaShadow.a {
    public static final go a = new go();
    public static final List b = sy.d0Shadow.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        nz nzVar = null;
        while (eVar.r0(b) == 0) {
            nzVar = (nz) aa.c.c(ko.a, false).a(eVar, wVar);
        }
        if (nzVar != null) {
            return new jz(nzVar);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jz jzVar = (jz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jzVar, "value");
        fVar.z0("viewer");
        aa.c.c(ko.a, false).b(fVar, wVar, jzVar.a);
    }
}
