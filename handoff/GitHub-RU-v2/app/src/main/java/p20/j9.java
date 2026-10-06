package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j9 implements aaShadow.a {
    public static final j9 a = new j9();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.fe feVar = null;
        while (eVar.r0(b) == 0) {
            feVar = (u10.fe) aa.c.b(aa.c.c(o9.a, true)).a(eVar, wVar);
        }
        return new u10.ae(feVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ae aeVar = (u10.ae) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aeVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(o9.a, true)).b(fVar, wVar, aeVar.a);
    }
}
