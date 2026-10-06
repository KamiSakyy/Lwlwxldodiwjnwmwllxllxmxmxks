package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yf implements aaShadow.a {
    public static final yf a = new yf();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(nf.a, true)))).a(eVar, wVar);
        }
        return new u10.nn(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.nnShadow nnVar = (u10.nn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nnVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(nf.a, true)))).b(fVar, wVar, nnVar.a);
    }
}
