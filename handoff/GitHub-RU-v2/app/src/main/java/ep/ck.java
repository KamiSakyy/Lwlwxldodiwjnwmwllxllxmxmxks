package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ck implements aaShadow.a {
    public static final ck a = new ck();
    public static final List b = sy.d0Shadow.n("rejectDeployments");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.mt mtVar = null;
        while (eVar.r0(b) == 0) {
            mtVar = (jo.mt) aa.c.b(aa.c.c(ek.a, false)).a(eVar, wVar);
        }
        return new jo.kt(mtVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.kt ktVar = (jo.kt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ktVar, "value");
        fVar.z0("rejectDeployments");
        aa.c.b(aa.c.c(ek.a, false)).b(fVar, wVar, ktVar.a);
    }
}
