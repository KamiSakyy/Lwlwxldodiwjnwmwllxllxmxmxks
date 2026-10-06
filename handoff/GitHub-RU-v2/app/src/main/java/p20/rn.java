package p20;

import java.util.List;
import u10.ny;
import u10.oy;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rn implements aaShadow.a {
    public static final rn a = new rn();
    public static final List b = sy.d0Shadow.n("replaceAssigneesForAssignable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        oy oyVar = null;
        while (eVar.r0(b) == 0) {
            oyVar = (oy) aa.c.b(aa.c.c(sn.a, false)).a(eVar, wVar);
        }
        return new ny(oyVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ny nyVar = (ny) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nyVar, "value");
        fVar.z0("replaceAssigneesForAssignable");
        aa.c.b(aa.c.c(sn.a, false)).b(fVar, wVar, nyVar.a);
    }
}
