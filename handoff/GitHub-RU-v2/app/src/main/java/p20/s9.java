package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s9 implements aaShadow.a {
    public static final s9 a = new s9();
    public static final List b = sy.d0Shadow.n("followUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.me meVar = null;
        while (eVar.r0(b) == 0) {
            meVar = (u10.me) aa.c.b(aa.c.c(t9.a, false)).a(eVar, wVar);
        }
        return new u10.le(meVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.le leVar = (u10.le) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(leVar, "value");
        fVar.z0("followUser");
        aa.c.b(aa.c.c(t9.a, false)).b(fVar, wVar, leVar.a);
    }
}
