package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v9 implements aaShadow.a {
    public static final v9 a = new v9();
    public static final List b = sy.d0Shadow.n("followUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.re reVar = null;
        while (eVar.r0(b) == 0) {
            reVar = (u10.re) aa.c.b(aa.c.c(w9.a, false)).a(eVar, wVar);
        }
        return new u10.qe(reVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.qe qeVar = (u10.qe) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qeVar, "value");
        fVar.z0("followUser");
        aa.c.b(aa.c.c(w9.a, false)).b(fVar, wVar, qeVar.a);
    }
}
