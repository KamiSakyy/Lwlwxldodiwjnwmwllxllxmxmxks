package p20;

import java.util.List;
import u10.jw;
import u10.kw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class em implements aaShadow.a {
    public static final em a = new em();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kw kwVar = null;
        while (eVar.r0(b) == 0) {
            kwVar = (kw) aa.c.b(aa.c.c(fm.a, true)).a(eVar, wVar);
        }
        return new jw(kwVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jw jwVar = (jw) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jwVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(fm.a, true)).b(fVar, wVar, jwVar.a);
    }
}
