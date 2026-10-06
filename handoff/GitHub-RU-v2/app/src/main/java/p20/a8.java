package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a8 implements aaShadow.a {
    public static final a8 a = new a8();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ic icVar = null;
        while (eVar.r0(b) == 0) {
            icVar = (u10.ic) aa.c.b(aa.c.c(f8.a, false)).a(eVar, wVar);
        }
        return new u10.dc(icVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.dc dcVar = (u10.dc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dcVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(f8.a, false)).b(fVar, wVar, dcVar.a);
    }
}
