package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t6 implements aaShadow.a {
    public static final t6 a = new t6();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ga gaVar = null;
        while (eVar.r0(b) == 0) {
            gaVar = (u10.ga) aa.c.b(aa.c.c(v6.a, true)).a(eVar, wVar);
        }
        return new u10.eaShadow(gaVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.eaShadow eaVar = (u10.eaShadow) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eaVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(v6.a, true)).b(fVar, wVar, eaVar.a);
    }
}
