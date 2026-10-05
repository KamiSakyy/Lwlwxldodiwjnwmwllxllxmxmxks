package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e9 implements aa.a {
    public static final e9 a = new e9();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.xd xdVar = null;
        while (eVar.r0(b) == 0) {
            xdVar = (u10.xd) aa.c.b(aa.c.c(i9.a, false)).a(eVar, wVar);
        }
        return new u10.td(xdVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.td tdVar = (u10.td) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tdVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(i9.a, false)).b(fVar, wVar, tdVar.a);
    }
}
