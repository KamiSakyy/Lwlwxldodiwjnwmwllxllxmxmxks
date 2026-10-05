package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wa implements aa.a {
    public static final wa a = new wa();
    public static final List b = sy.d0.o("__typename", "activeLockReason");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        hc0.jd jdVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                jdVar = (hc0.jd) aa.c.b(ic0.a.v).a(eVar, wVar);
            }
        }
        eVar.s0();
        k60.g gVar = k60.g.a;
        k60.e c = k60.g.c(eVar, wVar);
        if (str != null) {
            return new u10.cg(str, jdVar, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.cg cgVar = (u10.cg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cgVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, cgVar.a);
        fVar.z0("activeLockReason");
        aa.c.b(ic0.a.v).b(fVar, wVar, cgVar.b);
        k60.g gVar = k60.g.a;
        k60.g.d(fVar, wVar, cgVar.c);
    }
}
