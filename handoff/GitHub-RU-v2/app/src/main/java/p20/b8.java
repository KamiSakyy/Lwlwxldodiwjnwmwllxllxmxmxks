package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b8 implements aaShadow.a {
    public static final b8 a = new b8();
    public static final List b = sy.d0.n("patch");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.gc gcVar = null;
        while (eVar.r0(b) == 0) {
            gcVar = (u10.gc) aa.c.b(aa.c.c(d8.a, false)).a(eVar, wVar);
        }
        return new u10.ec(gcVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ec ecVar = (u10.ec) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ecVar, "value");
        fVar.z0("patch");
        aa.c.b(aa.c.c(d8.a, false)).b(fVar, wVar, ecVar.a);
    }
}
