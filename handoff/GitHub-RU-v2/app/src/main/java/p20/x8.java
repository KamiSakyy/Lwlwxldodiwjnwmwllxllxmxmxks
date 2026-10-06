package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x8 implements aaShadow.a {
    public static final x8 a = new x8();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.qd qdVar = null;
        while (eVar.r0(b) == 0) {
            qdVar = (u10.qd) aa.c.b(aa.c.c(d9.a, false)).a(eVar, wVar);
        }
        return new u10.kd(qdVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.kd kdVar = (u10.kd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kdVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(d9.a, false)).b(fVar, wVar, kdVar.a);
    }
}
